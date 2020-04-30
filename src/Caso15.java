
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese la cantidad: ");
		float  c = sc.nextFloat();
		System.out.print("Ingrese el precio: ");
		float p = sc.nextFloat();
		float i = c*p;
		
		System.out.println("-------------------");
		System.out.println("RESULTADOS");
		System.out.println("-------------------");
		System.out.println("El import es: " + df.format(i));
		System.out.println("El cambio en dolares es: " + df.format(i/3.24));
		System.out.println("El cambio en euros es: " + df.format(i/3.75));
	}

}
