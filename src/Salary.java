import java.util.Scanner;

public class Salary {
 
 
	public static void main(String[] args) {
		float basicsalary, dallowance,rentallowance;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter basic salary");
        basicsalary=input.nextFloat();
        dallowance=0.4f*basicsalary;
        rentallowance=0.2f*basicsalary;
        System.out.println("Gross Salary:"+(basicsalary+dallowance+rentallowance));
        
	}

}
