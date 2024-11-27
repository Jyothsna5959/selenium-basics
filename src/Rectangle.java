import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		int  length = 24,breadth = 30,radius = 3,area1,perimeter;
		float area2,circum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the breadth,length of the rectangle");
		area1=sc.nextInt();
		area1=breadth*length;
		perimeter=2*(length+breadth);
		System.out.println("Enter the raids of the circle");
		area2=sc.nextFloat();
		circum=sc.nextFloat();
		area2=3.1416f*radius*radius;
		circum= (2f*(3.1416f)*radius);
		System.out.println("rectangle area:"+area1);
		System.out.println("rectangle perimerter:"+perimeter);
		System.out.println("circle area:"+area2);
		System.out.println("circle circumfferance:"+circum);
		
		
		
		

		
		
		
	}
}
