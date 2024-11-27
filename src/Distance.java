import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		float km, m, cm, ft, inch;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the kilometere");
		km= input.nextFloat();
		m = km * 1000;
		cm = m * 100;
		inch = cm / 2.54f;
		ft = inch / 12;
		System.out.println("kilometers:"+km);
		System.out.println("meters:"+m);
		System.out.println("centimeters:"+cm);
		System.out.println("inches:"+inch);
		System.out.println("feett:"+ft);

	}

}
