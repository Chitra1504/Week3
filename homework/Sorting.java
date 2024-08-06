package week3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Home Assignment <4>: Sorting Using Collection
		String arr[]={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> companies=new ArrayList<String>();
		for(String val:arr){
			companies.add(val);
		}
		Collections.sort(companies);
		int arrayLength=companies.size();
		for(int i=arrayLength-1;i>=0;i--)
			System.out.println(companies.get(i));
	}

}
