package TP4;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Da Java Code", "Duke Brown");
		Book b2 = b1;
		Book b3 = new Book("Da Java Code", "Duke Brown");
		
		System.out.println(b1 == b2);
		System.out.println(b1 == b3);
		System.out.println(b1.equals(b2));// true
		System.out.println(b1.equals(b3));// true
		
		ArrayList list = new ArrayList();
		list.add(b1);
		System.out.println(list.indexOf(b2));
		System.out.println(list.indexOf(b3));

		Book aBook = new Book("Da Java Code", "Duke Brown");
		System.out.println(aBook);
		
		//Book anotherBook = new Book(null, null);
		//ArrayList list2 = new ArrayList();
		//list2.add(aBook);
		//System.out.println(list2.indexOf(anotherBook));
		
		System.out.println("-----------------------------------");
		int[] arr = {100, 12, 32, 2, 1, 2, 3, 4, 7,  5, 6};
		System.out.println(Arrays.toString(arr));
		Caillou.swap(arr, 2, 3);
		System.out.println(Caillou.indexOfMin(arr, 0, 3));
		Caillou.tri(arr);
		System.out.println(Arrays.toString(arr));

	}
}
