package abstraction;

public class Multiple3 implements Multiple1, Multiple2 {

	@Override
	public void create() {
		// TODO Auto-generated method stub
System.out.println("Parent class A");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
System.out.println("Parent class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multiple3 obj=new Multiple3();
obj.create();
obj.view();
	}

}
