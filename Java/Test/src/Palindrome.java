import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int number=0,rev=0,clone=0,temp;
		System.out.println("Enter a Number :");
		number=clone=Integer.parseInt(s.next());
		while(clone>0) {
			temp=clone%10;
			rev=(rev*10)+temp;
			clone/=10;
		}
		if(rev==number) {
			System.out.println("Number "+number+" is Palindrome ");
		}
		else {
			System.out.println("Number "+number+" is Not a Palindrome ");
		}
	}

}
