
import java.util.Scanner;
public class Caso4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer número: ");
		float n1 = sc.nextFloat();
		System.out.print("Ingrese segundo número: ");
		float n2 = sc.nextFloat();
		
		System.out.println("------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------");
		System.out.println("Suma: " + (n1+n2));
		System.out.println("Resta: " + (n1-n2));
		System.out.println("Producto: " + (n1*n2));
		System.out.println("División: " + (n1/n2));
		System.out.println("Resto entero: " + (n1%n2));
	}

}
