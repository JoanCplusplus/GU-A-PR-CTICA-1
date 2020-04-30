
import java.util.Scanner;
public class Caso20
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el valor de venta: ");
		float v = sc.nextFloat();
		
		System.out.println("----------------------");
		System.out.println("RESULTADO");
		System.out.println("----------------------");
		System.out.println("Incremento: " + (v+(v*0.42)));
	}

}
