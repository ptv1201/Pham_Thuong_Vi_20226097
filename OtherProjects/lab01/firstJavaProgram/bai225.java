package firstJavaProgram;
	import java.util.Scanner;
	public class bai225 {
	public static void main(String[] args) {
	try(Scanner input = new Scanner(System.in)) {
	System.out.print("number 1: ");
	double num1 = input.nextDouble();
	System.out.print("number 2: ");
	double num2 = input.nextDouble();
	double sum = num1 + num2;
	double difference = num1 - num2;
	double product = num1 * num2;
	double quotient = num1/num2;
	System.out.print(" sum = "+sum+"\n difference = "+difference+"\n product = "+product+"\n quotient = "+quotient);
	}
	}
	}

