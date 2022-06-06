import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Skolko golosov u Zhaparova= ");
		Scanner in1 = new Scanner(System.in);
		double num1 = in1.nextDouble();
		System.out.print("Skolko golosov u Tashieva= ");
		Scanner in2 = new Scanner(System.in);
		double num2 =in2.nextDouble();
		System.out.print("Skolko golosov u Toktogazieva= ");
		Scanner in3 = new Scanner(System.in);
		double num3 =in3.nextDouble();
		in1.close();
		in2.close();
		in3.close();
		if ((num1 == num2) || (num1 == num3)) {
			if (num1 > num2 && num1 > num3) {
				System.out.println("Taschiev i Toktogayiev proigrali ");
			} else if (num2 > num3 && num2 > num1) {
				System.out.println("Zaparov i Toktogayiev proigrali ");
			} else if (num3 > num1 && num3 > num2) {
				System.out.println("Zaparov i Taschiev proigrali ");;
			} else { 
			System.out.println("Neobchodim vtoroi tur,");
			if (num1 < num2 && num1 < num3) {
				System.out.println("a v pervom ture Zhaparova proigral ");
			} else if (num2 < num3 && num2 < num1) {
				System.out.println("a v pervom ture Taschiev proigral ");
			} else {
				System.out.println("a v pervom ture Toktogayiev proigral ");;
			}
			}
		}
		else {
		if (num1 < num2 && num1 < num3) {
			System.out.println("Zhaparova proigral ");
		} else if (num2 < num3 && num2 < num1) {
			System.out.println("Taschiev proigral ");
		} else {
			System.out.println("Toktogayiev proigral ");;
		}
		}
	}

}
