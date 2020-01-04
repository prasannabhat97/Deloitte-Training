
import java.util.Scanner;

public class SortedArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] arr;
		System.out.println("Enter the number of inputs : ");
		int input=Integer.parseInt(s.next());
		arr=new String[input];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<input;i++) {
			arr[i]=s.next();
		}
		
		for(int i=0;i<input;i++) {
			for(int j=0;j<input-i-1;j++) {
				if(Integer.parseInt(arr[j])>Integer.parseInt(arr[j+1])) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array !! ");
		System.out.println();
		for(int i=0;i<input;i++) {
			System.out.println(arr[i]);
		}
	}
}
