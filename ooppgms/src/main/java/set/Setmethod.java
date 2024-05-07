package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj = new LinkedHashSet<String>();
		 obj.add("Adithya");   //add
	     obj.add("kunjata");   
	     obj.add("unni");   
	     obj.add("mrudhul");
	     obj.add("devu");
	     System.out.println(obj);
	    boolean x= obj.contains("Adithya");//contains
	     System.out.println(x);
	     obj.remove("kunjata");//remove
	     System.out.println(obj);
	    boolean c= obj.isEmpty();//isempty
	    System.out.println(c);
	    int a=obj.size();//size
	    System.out.println(a);
	}

}
