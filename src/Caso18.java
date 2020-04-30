
import java.util.Scanner;
public class Caso18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la base: ");
		float b = sc.nextFloat();
		
		System.out.print("Ingrese la altura: ");
		float a = sc.nextFloat();
		
		System.out.println("---------------------------");
		System.out.println("RESULTADO");
		System.out.println("---------------------------");
		System.out.println("Área del triángulo: " + b*a);

	}

}
