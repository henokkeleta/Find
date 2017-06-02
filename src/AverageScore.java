import java.util.Scanner;
public class AverageScore {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		String input="";
		System.out.println("Enter the scores, type x when you are done with yur entery");
		int count=0;
		while(!input.equalsIgnoreCase("x")){ 


			input = sc.next();
			if(input.equalsIgnoreCase("x"))
			{ 
				continue;
			}else{
				int number = Integer.parseInt(input);

				sum=sum+number;
			}

			count++;
		}
		double average1 = average(sum,count);
		System.out.println("The average score of is:"+" "+average1);
		sc.close();
	}
	public static double average(int sum1,int count)
	{ 
		int ave=sum1/count;
		return ave;
	}
}
