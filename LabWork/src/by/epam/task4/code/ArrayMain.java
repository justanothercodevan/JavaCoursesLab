package by.epam.task4.code;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mas1 = new int [] {8, 4, 7, 3, 9, 1};
		int [] mas2 = new int [] {11, 5, 4, 9, 8, 43};
		
		printArray(mas1);
		findSimple(mas1);
		printArray(mas2);
		findSimple(mas2);

	}
	
	public static void findSimple(int [] mas) {
		String answer = "Simples are: ";
		for (int i = 0; i < mas.length; i++) {
			boolean simple = false;
			if (mas[i] <= 1) {
				
			} else if (mas[i] == 2) {
				simple = true;
			} else {
				simple = true;
				for (int j = 2; j < mas[i]; j++) {
					if (mas[i] % j == 0) {
						simple = false;
						break;
					}
				}
			}
			if (simple) {
				answer = answer + i + " ";				
			}
		}
		System.out.println(answer);			
	}
	
	public static void printArray(int[] mas) {
		System.out.print("Array is: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}
}
