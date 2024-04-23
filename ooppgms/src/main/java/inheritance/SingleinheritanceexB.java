package inheritance;

public class SingleinheritanceexB extends SingleinheritanceexA{
	public void display() {
		System.out.println("Child class B");	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleinheritanceexB obj =new SingleinheritanceexB();
		obj.single();
		obj.display();
	}

}
