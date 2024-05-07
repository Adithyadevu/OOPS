package exception;

public class Customex {

	public static void main(String[] args) throws AdithyaException {
		// TODO Auto-generated method stub
int age=17;
if(age>=18) {
	System.out.println("eligible");
}
else {
	throw new AdithyaException("invalid age");
}
	}

}
