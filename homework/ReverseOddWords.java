package week3.homework;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Home Assignment <3>: Reverse Odd Words in a String
		String test = "I am a software tester";
		String[] arrayWords=test.split(" ");
		String result="";
		for(int i=0;i<arrayWords.length;i++)
		{
			if(i%2==1)
			{
				char[] val=arrayWords[i].toCharArray();
				for(int j=val.length-1;j>=0;j--)
				{
					result+=val[j];					
				}
				arrayWords[i]=result;
				result="";
			}			
		}
		for(String res:arrayWords)
			System.out.print(res+" ");
	}

}
