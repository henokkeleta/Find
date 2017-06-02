import java.util.Scanner;
public class AddEm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum =0;
		System.out.println("Enter the numbers to be added");
		Scanner sc = new Scanner(System.in);
		while(count<3)
		{ 
		 int number =sc.nextInt();
		 sum=sum+number;
		 count++;
		}
		System.out.println("The result is :"+" "+sum);

	}

}
