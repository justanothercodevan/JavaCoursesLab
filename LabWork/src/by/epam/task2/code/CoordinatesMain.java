package by.epam.task2.code;

import java.util.Scanner;

public class CoordinatesMain {

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
		
		String output = String.format("Is point with coordinates %f, %f belongs to area? Answer is: %s ", x,y,checkCoordinates(x, y));
		System.out.println(output);
		
		

	}
	
	public static String checkCoordinates(double x, double y) {
		String answer = "false";
		
		if (y >= 0 && y <= 5) {
			if (x >= -4 && x <= 4) {
				answer = "true";
			}			
		}
		
		if (y < 0 && y >= -3) {
			if (x >= -6 && x <= 6) {
				answer = "true";
			}		
		}
		
		
		return answer;
		
	}

}
