package Collection;
import java.util.*;

public class Arraylist {
public static void main(String[] args) {
	
	ArrayList <String >a=new <String> ArrayList();
  
	a.add("shubham");
	a.add("Abasaheb");
	a.add("Sathe");
	
	System.out.println(a);
	Iterator itr=a.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
