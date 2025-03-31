package P4;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num1 = sc.nextInt();
		System.out.println("Escribe por cual lo vas a multiplicar");
		int num2 = sc.nextInt();
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}

}
