package helloworld;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the letter");
		String str1=obj.next();
		if(str1.charAt(0)=='a' ||str1.charAt(0)=='e' ||str1.charAt(0)=='i' ||str1.charAt(0)=='o' ||str1.charAt(0)=='u')
		{
			System.out.println("Vowel");
		}
		else if (str1.charAt(0)=='y')
		{
			System.out.println("sometime it is vowel and sometime it is consonant");
		}
		else
		{
			System.out.println("consonent");
		}

	}

}
