package Collection;
import java.util.*;

public class Stacks {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("c");
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.empty());
		s.add("sathe");
		System.out.println(s);
	}

}
