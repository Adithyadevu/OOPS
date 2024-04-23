package aggregation;

public class Student {
	String name;
	int rollno;
	Book x;
	public Student(String name,int rollno,Book x) {
		this.name=name;
		this.rollno=rollno;
		this.x=x;
		
	}
	public void display() {
		System.out.println(x.name+" "+x.age);
		System.out.println(name+" "+rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book("Adithya",21);
		Student obj1=new Student("Mennu",2,obj);
		obj1.display();

	}

}
