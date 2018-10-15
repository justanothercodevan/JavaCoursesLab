package by.epam.task5.code;

public class ClassesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basket basket = new Basket (4);
		basket.addBall(new Ball("red", 4.0));
		basket.addBall(new Ball("blue", 3.0));
		basket.addBall(new Ball("pink", 2.0));
		basket.addBall(new Ball("blue", 3.2));
		
		System.out.print("Number of blue balls: ");
		System.out.println(basket.countNumberOfBallsWithSomeColor("blue"));
		System.out.print("Total weight is: ");
		System.out.println(basket.countTotalWeight());
	}

}
