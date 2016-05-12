/**
 * 
 */
package labKeyValuePair2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Cyanuro
 *
 */
public class PairApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyValuePair2<String, Integer> p1 = new KeyValuePair2<String, Integer>("SLC", 189899);
		KeyValuePair2<String, Integer> p2 = new KeyValuePair2<String, Integer>("NY", 8244910);
		KeyValuePair2<String, Integer> p3 = new KeyValuePair2<String, Integer>("LA", 3819702);
		KeyValuePair2<String, Integer> p4 = new KeyValuePair2<String, Integer>("SF", 812826);
		
		List<KeyValuePair2<String, Integer>> cities = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
		
		System.out.println("Original List:");
		printList(cities);
		System.out.println();
		
		System.out.println("Sorted List:");
		Collections.sort(cities);
		printList(cities);
		
	}

	private static <T> void printList(List<KeyValuePair2<String, Integer>> cities) {
		
		for(int i = 0; i < cities.size(); i++) {
			
			System.out.println(cities.get(i));
		}
	}
}
