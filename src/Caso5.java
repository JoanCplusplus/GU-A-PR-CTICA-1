
import java.util.Scanner;
public class Caso5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		float n1 = sc.nextFloat();
		System.out.print("Ingrese segundo n�mero: ");
		float n2 = sc.nextFloat();
		
		System.out.println("------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------");
		System.out.println("Promedio: " + ((n1+n2)/2));
		System.out.println("Aumento: " + (n1+(n1*0.2)));
		System.out.println("Disminuci�n: " + (n2-(n2*0.3)));
	}

}
