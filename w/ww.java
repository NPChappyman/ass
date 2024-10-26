package w;


public class ww {
	
	static public void test()
	{
		int[] a = new int[] {31,21,32,123,1212,1,7};
		array.sort.bubblesort(a);
		for (int i = 0 ; i< a.length;i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		System.out.print(Operation.SUM.action(9,12));
	}
	
}
enum Operation{
    SUM{
        public int action(int x, int y){ return x + y;}
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
    public abstract int action(int x, int y);
}