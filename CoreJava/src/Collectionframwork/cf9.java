package CollectionFramework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class cf9 {
	public static void main(String[] args) {

		Integer arr[] = {1,2,3,4,5 };

//		Collections - Data type - Wrapper -> 
		Arrays.sort(arr);

//		for (Integer i : arr) {
//			System.out.println(i);
//		}
		
		System.out.println(Arrays.binarySearch(arr,10));

	}
}
