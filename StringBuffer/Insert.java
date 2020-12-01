package StringBuffer;

public class Insert {
public static void main(String[] args) {
	StringBuffer s=new StringBuffer("shubham");
	s.insert(1, "hello");
	System.out.println(s);
	s.insert(1, 1);
	System.out.println(s);
}
}
