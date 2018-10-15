package by.epam.task5.code;

public class Basket {
	private Ball [] balls;
	private int index = 0;
	
	public Basket(int size) {
		balls = new Ball [size];
	};
	
	public void addBall(Ball ball) {
		balls[index] = ball;
		index++;
	}
	
	public double countTotalWeight() {
		double sum = 0.0;
		if (balls.length != 0) {
			for (int i = 0; i < balls.length; i++) {
				sum+=balls[i].getWeight();
			}
		}		
		return sum;		
	}
	
	public int countNumberOfBallsWithSomeColor (String color) {
		int count = 0;
		if (balls.length != 0) {
			for (int i = 0; i < balls.length; i++) {
				if (balls[i].getColor().equals("blue")) {
					count+=1;
				}
			}
		}
		return count;
	}

}
