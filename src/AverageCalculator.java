import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class AverageCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double Firstmark;
		double Secondmark;
		double Thirdmark;
		double Fourthmark;
		double Fifthmark;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		double Average;
		
		System.out.print("mark one: ");
		Firstmark = userInput.nextDouble();
		
		System.out.print("mark two: ");
		Secondmark = userInput.nextDouble();
		
		System.out.print("mark three: ");
		Thirdmark = userInput.nextDouble();
		
		System.out.print("mark four: ");
		Fourthmark = userInput.nextDouble();
		
		System.out.print("mark fife: ");
		Fifthmark = userInput.nextDouble();
		
		Average = (Firstmark + Secondmark + Thirdmark + Fourthmark + Fifthmark)/5;
		System.out.println("mark one:" + Firstmark);
		System.out.println("mark two:" + Secondmark);
		System.out.println("mark three:" + Thirdmark);
		System.out.println("mark four:" + Fourthmark);
		System.out.println("mark fife:" + Fifthmark);
		
		System.out.println("Average" + Average );
		userInput.close();
		
		
	}

}
