package by.epam.task1.code;

import java.util.Scanner;

public class MainFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите x: ");
		x = sc.nextDouble();
		
		System.out.println("Введите y: ");
		y = sc.nextDouble();
		sc.close();		
		
		System.out.println("Answer is: " + countFormula(x,y));		
		
		
	}
	
	public static double countFormula(double x, double y) {
		double answer = (1 + Math.pow(Math.sin(x+y),2)) / (2 + Math.abs(x - 2*x/(1 + Math.pow(x,2)*Math.pow(y,2))));
		
		return answer;
	}

}
