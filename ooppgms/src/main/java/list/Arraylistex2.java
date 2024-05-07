package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>obj=new ArrayList<String>();
obj.add("Adithya");
obj.add("Meenu");
Iterator <String> i=obj.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
i.remove();
System.out.println(obj);
	}

}
