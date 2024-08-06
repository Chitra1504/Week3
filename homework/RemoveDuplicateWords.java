package week3.homework;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program is to remove the duplicate words from a String
		//Home Assignment <2>: Remove Duplicate Words in a String 
		String text="We learn Java basics as part of java sessions in java week1";
		int count=1;
		String result="";
		String[] words=text.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[i]=" ";
					words[j]=" ";					
				}
			}							
		}
		if(count>1) {
			for(int i=0;i<words.length;i++)
			result+=words[i]+" ";
	}
		System.out.println(result);
	}

}
