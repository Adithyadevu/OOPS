package list;

import java.util.ArrayList;

public class Addallex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Adithya");
		obj.add("Meenu");
		System.out.println(obj);
		
		ArrayList<String>obj1=new ArrayList<String>();
		obj1.add("devu");
		obj1.add("mrudhul");
		obj1.add("unni");
		System.out.println(obj1);
		
		obj.addAll(obj1);//addall
		boolean a=obj1.contains("devu");
		System.out.println(a);
		
		System.out.println(obj.get(1));//to get the value
		
		boolean b=obj.isEmpty();//isempty
		System.out.println(b);
		
		obj.remove("unni");//remove
		System.out.println(obj);
		
		System.out.println(obj.size());//size
	}

}
