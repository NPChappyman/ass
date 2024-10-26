package array;

import java.util.LinkedList;

public class LowArrayApp {
	
	 public static void main(String[] args)
	    {
		 w.ww.test();
		int[] a = new int[] {12,313,141,1,42,2,4144,17};
		sort.bubblesort(a);
		for (int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
			  
		System.out.println(reverseWords("S[alam] aleykum world!"));
		
		}
	 
	 public static String reverseWords(final String original)
	  {
	      String answer = "";
	    String placeholder = "";
	    for(int i = original.length() - 1; i >= 0; i-- ){
	      if(original.charAt(i) != ' '){
	        placeholder = placeholder + original.charAt(i);
	      }
	      else{
	        answer = " " + placeholder + answer;
	        placeholder = "";
	      }
	    }
	    answer = placeholder + answer;
	    return answer;     
	  }
}
