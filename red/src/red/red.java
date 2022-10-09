package red;
import java.util.Scanner;
public class red {

	static final double pi=3.14;
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter value of side");
		Double a=obj.nextDouble();
		Double SquareArea=a*a;
		System.out.println("Area of Square is  "+SquareArea);
		

	}

}
