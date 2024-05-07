package list;

import java.util.ArrayList;
import java.util.List;

public class Listmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> obj=new ArrayList<String>();
obj.add("adithya");
obj.add("meenu");
obj.add("devu");
obj.add("aiswarya");
obj.add("devu");
obj.add("adithya");
obj.set(1, "Anu");//to set or replace name
int a=obj.indexOf("devu");//to print the first indexof means how many times "devu" occured
int b=obj.lastIndexOf("devu");//to print the last indexof 
obj.remove("meenu");//to remove any index value
String c=obj.get(3);//to get any name separate
boolean x=obj.contains("adithya");//
System.out.println(x);
System.out.println(c);
System.out.println(a);
System.out.println(b);
System.out.println(obj);

	}

}
