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
		stack.stack thestack = new stack.stack(7);
		thestack.push(7);
		thestack.push(11);
		thestack.push(18);
		thestack.push(90);
		thestack.push(13);
		while (!thestack.isEmpty())
		{
			System.out.print(thestack.pop());
			System.out.print(" ");
			
		}
		System.out.println("");
		
	  }
}
