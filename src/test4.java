import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Skolko golosov u Zhaparova= ");
		Scanner in1 = new Scanner(System.in);
		int num1 = in1.nextInt();
		System.out.print("Skolko golosov u Tashieva= ");
		Scanner in2 = new Scanner(System.in);
		int num2 =in2.nextInt();
		System.out.print("Skolko golosov u Toktogazieva= ");
		Scanner in3 = new Scanner(System.in);
		int num3 =in3.nextInt();
		in1.close();
		in2.close();
		in3.close();
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("Zhaparova proigral ");
		} else if (num2 <= num3 && num2 <= num1) {
			System.out.println("Taschiev proigral ");
		} else {
			System.out.println("Toktogayiev proigral ");;
		}
	}

}
