//Streams in Java
import java.util.ArrayList;
import java.util.Scanner;
class Student
{
	int rollno;
	String name;
	int marks;
	Student(int rollno,String name,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
}
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> al=new ArrayList<>();
		ArrayList<Integer> filteredMarks=new ArrayList<>();
		System.out.print("Enter the number of students: ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter the Student's Roll No: ");
			int rollno=sc.nextInt();
			System.out.print("Enter the Student's Name: ");
			String name=sc.nextLine();
			//sc.next();
			System.out.print("Enter the Student's Marks: ");
			int marks=sc.nextInt();
			al.add(new Student(rollno,name,marks));
		}
		System.out.println(al);
	}
}
