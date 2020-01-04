
public class Fibonocci {
	public static void main(String[] args) {
		int first=0;
		int second=1;
		int third=0;
		System.out.println(first);
		for(int i=0;i<9;i++) {
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
	}
}
