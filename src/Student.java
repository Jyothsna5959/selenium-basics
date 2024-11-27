import java.util.Scanner;
public class Student
{
	public static void main(String[]args) 
	{
		int m1 = 78,m2 = 98,m3 = 86,m4 = 75,m5 = 90,total;
		float per;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the total subjects");
		per= input.nextFloat();
		total=m1+m2+m3+m4+m5;
        per=total/5;
        System.out.println("toatal Percentage:"+per);

	}
	
}
