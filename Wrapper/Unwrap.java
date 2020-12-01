package Wrapper;

public class Unwrap {
	public static void main(String[] args) {
		/*METHOD 1
		Integer i=new Integer((int)10);
		int j=i.intValue();
		System.out.println(j);
		*/
		
		/*METHOD 2
		int j=10;
		Integer i=new Integer(j);
		int g=i;
		System.out.println(g);
		*/
		Integer i=10;
		int h=i;
		System.out.println(h);
	}

}
