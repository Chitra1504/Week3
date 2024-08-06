package week3.homework;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Home Assignment <2>: Find Second Largest Number using List
		int arr[]={3, 2, 11, 4, 6, 7};
		Arrays.sort(arr);
		System.out.println("The second largest number is "+arr[arr.length-2]);
	}

}
