import java.util.Random;
import java.util.Scanner;

public class SecretNo {
   static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String choice="";
		int secretNumber = (1+r.nextInt(999));
		System.out.println("Guess my secret number ,any Integer number between 0 and 999 ");
		
		do{ 
			
			int input= scan.nextInt();
			if(input==secretNumber)
			{   
				dashes();
				System.out.println();
				System.out.println("you guessed right! try again? enter Y/N");
				choice = scan.next();
				dashes();
				
			}
			else if(input >secretNumber){
				dashes();
				System.out.println();
				System.out.println("you guessed too high!try again? enter Y/N");
				choice = scan.next();
				dashes();
				
			}
			else{ 
				dashes();
				System.out.println();
				System.out.println("you guessed too Low!try again? enter Y/N");
				choice = scan.next();
				dashes();
			
			}
			
			 
			 if(choice.equalsIgnoreCase("N"))
			 { 
				 System.out.println("Have a nice day!");
			 }
		}while(choice.equalsIgnoreCase("y"));
			
		}
		
		public static void dashes()
		{ 
			System.out.println("------------------------------");
		}

	}