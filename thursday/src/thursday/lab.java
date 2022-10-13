package thursday;
import java.util.Scanner;
public class lab {

	public static void main(String[] args)
	{
		System.out.println("Enter your Please enter your roll number to see which group you belong to");
		
		int num=sc.nextInt();
		
		if(num%4==1)
		{
			System.out.println("Sapphire");
		}
		else if(num%4==2) {
			System.out.println("Pearl");
		}
		else if(num%4==3) {
			System.out.println("Ruby");
		}
		else if(num%4==4)
		{
			System.out.println("Emerald");
		}
		else 
		{
			System.out.println("YOU DO NOT BELONGS TO ANY GROUP");
		}

        }
	}

