import java.util.Scanner;

public class Profit {

	public static void main(String[] args) {
		float sp = 2000,cp,profit =500;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the selling price");
        cp=sc.nextFloat();
        cp=sp-profit;
        cp=cp/15;
        System.out.println("cost Price:"+cp);

        

	}

}
