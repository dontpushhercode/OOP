package lab1;
import java.util.Scanner;
//problem #1
public class Analyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Data data = new Data();
		while(true) { //main loop to read user input
			System.out.println("Enter number (Q to quit): ");
			String input = scanner.nextLine(); //get input in string format
			if(input.equals("Q") || input.equals("q")) {
				System.out.println("Average: " + data.getAverage()); //print average
				System.out.println("Maximum: " + data.getLargest()); //print largest
				break;
			}
			else {
				try {
					int inputInt = Integer.parseInt(input); //try to parse string to int 
					data.add(inputInt);
				}
				catch(NumberFormatException e) {
					System.out.println("Incorrect input! :(");
					continue;
				}
			}
		}
		scanner.close();
	}

}
