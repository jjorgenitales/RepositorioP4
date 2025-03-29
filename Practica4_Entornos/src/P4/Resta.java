package P4;

import java.util.Scanner;

public class Resta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num1 = sc.nextInt();
		System.out.println("Escribe por cual lo vas a sumar");
		int num2 = sc.nextInt();
		int suma = num1+num2;
		System.out.println(num1+" + "+num2+" = "+suma);
		System.out.println("Escribe por cual lo vas a restar");
		int num3 = sc.nextInt();
		int resta = suma-num3;
		System.out.println(suma+" - "+num3+" = "+resta);
	}

}
