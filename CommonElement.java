package main.com;
import java.util.Arrays;
class CommonElement {

	public static void FindCommonElements(int[] arr1,int[] arr2)
	{
	
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
    for (int i : arr1) 
      {
			set1.add(i);
		  }
		for (int i : arr2) {
			set2.add(i);
		}
		set1.retainAll(set2);
		System.out.println("Common elements- " + set1);
	}
	public static void main(String[] args)
	{
		int[] arr1 = {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80 };

		int[] arr2 = { 81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90,1, 91, 92, 93 };

		System.out.println("Array 1: "+ Arrays.toString(arr1));
		System.out.println("Array 2: "+ Arrays.toString(arr2));
		FindCommonElements(arr1, arr2);
	}
}
