import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=Integer.parseInt(s.next());
		System.out.println("Factorial of "+number+" = "+fact(number));
	}

	public static int fact(int number) {
		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		return number*fact(number-1);
	}
}
