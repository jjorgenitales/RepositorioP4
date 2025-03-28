package P4;

import java.util.Scanner;

public class Resta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num1 = sc.nextInt();
		System.out.println("Escribe por cual lo vas a restar");
		int num2 = sc.nextInt();
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
	}

}
