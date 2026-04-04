package lab3;
//#3
import java.util.Iterator;

public interface MyCollection<T> extends Iterable<T>{
	void add(T element);
	void remove(T element);
	boolean contains(T element);
	int size();
	Iterator<T> iterator();
	boolean isEmpty();
}
