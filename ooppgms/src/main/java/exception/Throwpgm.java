package exception;

public class Throwpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=21;
if (age>=18) {
System.out.println("eligible");
}
else
{
	throw new ArithmeticException("invalid age");

}

	

	}

}
