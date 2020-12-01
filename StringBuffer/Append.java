package StringBuffer;

public class Append {
public static void main(String[] args) {
	StringBuffer s=new StringBuffer("shubham");
	s.append("sathe");
	System.out.println(s);
	s.append('f');
	s.append(false);
	System.out.println(s);
	s.append(4.5f);
	System.out.println(s);
	s.append("null");
	System.out.println(s);
	
	
}
}
