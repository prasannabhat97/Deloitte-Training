import java.util.Scanner;

public class evenOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number=Integer.parseInt(s.next());
		if(number%2==0) {
			System.out.println("Enterd no "+number+" is Even ");
		}
		else {
			System.out.println("Enterd no "+number+" is Odd ");
		}
	}
}
