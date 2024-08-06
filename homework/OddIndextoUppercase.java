package week3.homework;

public class OddIndextoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program will change the odd index of an string to uppercase
		//Home Assignment <1>: Change Odd Index To Uppercase
		String test="changeme";
		char[] arrayTest=test.toCharArray();
		for(int i=1;i<arrayTest.length;i=i+2) 
			arrayTest[i]=Character.toUpperCase(arrayTest[i]);
		System.out.println(new String(arrayTest));
	}
}
