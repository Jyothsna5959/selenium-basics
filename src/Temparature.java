import java.util.Scanner;

public class Temparature {

	public static void main(String[] args) {
		float  fr = 0,cent;
		float temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temparature");
		cent = sc.nextFloat();
		cent=(float) (5.0/9.0*(fr-32));
		System.out.println("centigrades:"+cent);


	}

}
