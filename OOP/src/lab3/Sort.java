package lab3;
//#5
public class Sort {
	static <E> void swap(E[] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static <E extends Comparable<E>> int partition(E[] array, int low, int high) {
		E pivot = array[high];
		int i = low-1;
		for(int j=low; j<=high-1;j++) {
			if(array[j].compareTo(pivot)<0) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i+1, high);
		return i+1;
	}
	
	static <E extends Comparable<E>> void quickSort(E[] array, int low, int high) {
		if(low<high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi-1);
			quickSort(array, pi+1, high);
		}
	}
	
	static <E extends Comparable<E>> void quickSort(E[] array) {
		quickSort(array, 0, array.length-1);
	}
	
	private static <E extends Comparable<E>> void merge(E[] array, int left, int mid, int right) {
		int n1 = mid-left +1;
		int n2 = right-mid;
		
		E[] Left = (E[])new Comparable[n1]; //left array
        E[] Right = (E[])new Comparable[n2]; //right array
        
        for (int i=0;i<n1;i++) Left[i] = array[left+i]; //pushing all left elmnts (before mid)
        for (int j=0;j<n2;j++) Right[j] = array[mid+1+j]; //pushing all right elmnts (after mid)

        int i=0,j=0,k=left;
        
        while (i<n1 && j<n2) {
            if(Left[i].compareTo(Right[j])<=0) { //if elmnt from the left array is smaller than elmnt from the right array
                array[k] = Left[i]; 
                i++;
            } else { //whatever is smaller will be copied to the res array
                array[k] = Right[j];
                j++;
            }
            k++;
        }
        
        //everything that left
        while(i<n1) {
            array[k] = Left[i];
            i++;
            k++;
        }
        while(j<n2) {
            array[k] = Right[j];
            j++;
            k++;
        }
	}
	
	static <E extends Comparable<E>> void mergeSort(E[] array, int left, int right) {
		if(left<right) {
			int mid = left+(right-left)/2;
			mergeSort(array, left, mid);
			mergeSort(array, mid+1, right);
			merge(array, left, mid, right);
		}
	}
	
	static <E extends Comparable<E>> void mergeSort(E[] array) {
		if(array==null || array.length<2) return;
		mergeSort(array, 0, array.length-1);
	}
}
