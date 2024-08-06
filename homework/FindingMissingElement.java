package week3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Home Assignment <3>: Find Missing Element using List
		int arr[]={1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(arr);
		int i=0;
		List<Integer> val=new ArrayList<Integer>();
		for(int j=0;j<arr.length;j++)
			val.add(arr[j]);
		System.out.print("The missing elements are ");
		while(i<val.size()-1) {
			if(val.get(i+1)!=val.get(i)+1)
				System.out.print(val.get(i)+1+" ");
			i++;
		}
	}

}
