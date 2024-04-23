package polymorphism;

public class Methodoverriding1 extends Methodoverriding{
public void display() {
	System.out.println("child class");
	super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverriding1 obj=new Methodoverriding1();
		obj.display();
	}

}
