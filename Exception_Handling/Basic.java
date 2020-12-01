package Exception_Handling;

public class Basic {
	public static void main(String[] args) {
		System.out.println("previous statement");
		try {
		int i=10/0;
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}
		System.out.println("after the exception");
	}

}
