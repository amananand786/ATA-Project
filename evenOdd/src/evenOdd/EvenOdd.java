package evenOdd;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int i=sc.nextInt();
		if(i%2==0)
			System.out.println("even");
		else 
			System.out.println("odd");
		//main(true);
	}

}
