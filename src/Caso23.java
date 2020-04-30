
import java.util.Scanner;
public class Caso23
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del producto: ");
		String n = sc.nextLine();
		
		System.out.println("Ingrese el precio: ");
		float p = sc.nextFloat();
		
		System.out.println("Ingrese la cantidad: ");
		int c = sc.nextInt();
		
		float i = p*c;
		float IGV = (float) (i*0.18);
		float d = (float) (i*0.08);
		float t = i-d+IGV;
		
		System.out.println("------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------");
		System.out.println("Importe: " + i);
		System.out.println("IGV: " + IGV);
		System.out.println("Descuento: " + d);
		System.out.println("Total: "+ t);
	}

}
