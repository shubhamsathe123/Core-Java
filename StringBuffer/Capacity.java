package StringBuffer;

public class Capacity {
public static void main(String[] args) {
	StringBuffer s=new StringBuffer("shubham");
	System.out.println(s.capacity());
	s.append("java is my fav");
	System.out.println(s.capacity());
	s.append("hi shubham sathe is herw");
	System.out.println(s.capacity());
}
}
