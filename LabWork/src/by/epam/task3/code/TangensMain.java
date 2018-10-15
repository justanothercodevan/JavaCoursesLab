package by.epam.task3.code;

import java.util.Scanner;

public class TangensMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int h;
		double [] mas = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите a: ");
		a = sc.nextInt();
		
		System.out.println("Введите b: ");
		b = sc.nextInt();
		
		System.out.println("Введите h: ");
		h = sc.nextInt();
		sc.close();
		
		if(checkInput(a, b, h)) {
			mas = countTangenses(a, b, h, mas);
			printTable(a, h, mas);
			
		}

	}
	
	public static boolean checkInput(int a, int b, int h) {
		boolean status = false;
		if (b < a) {
			System.out.println("b < a!!!");
		} else if (h == 0) {
			System.out.println("h equals 0!!!");
		} else {
			status = true;
		}
		return status;
	}
	
	public static double [] countTangenses(int a, int b, int h, double [] mas) {
		int size = (b - a) / h;
		System.out.println("Size: " + size);
		if (size != 0) {
			mas = new double[size];
			
			for (int i = 0; i < mas.length; i++) {
				mas [i] = Math.tan(a);
				a+=h;			
			}
			
			return mas;
		} else {
			return new double[0];
		}
		
	}
	
	public static void printTable(int arg, int increment, double [] mas) {
		System.out.println("--------------------------------------------");
		System.out.println("Value\t||\tTangens");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.println(arg + "\t||\t" + mas[i]);
			arg+=increment;
		}
		System.out.println("--------------------------------------------");
	}

}
