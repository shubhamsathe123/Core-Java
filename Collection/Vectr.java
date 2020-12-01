package Collection;
import java.util.*;

public class Vectr {
public static void main(String[] args) {

	Vector v=new Vector();
	v.add("shubham");
	v.add("sathe");
	v.addElement("Abasaheb");
	
	Iterator itr=v.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
