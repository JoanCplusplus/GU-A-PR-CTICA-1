
import java.util.Scanner;
public class Caso19
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1: ");
		float a = sc.nextFloat();
		
		System.out.print("Ingrese lado 2: ");
		float b = sc.nextFloat();
		
		System.out.print("Ingrese lado 3: ");
		float c = sc.nextFloat();
		
		System.out.println("---------------------------");
		System.out.println("RESULTADO");
		System.out.println("---------------------------");
		System.out.println("Perímetro del triángulo: " + (a+b+c));

	}
}