
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese la cantidad de horas trabajadas: ");
		float f = sc.nextFloat();
		
		System.out.print("Ingrese la tarifa por hora: ");
		float t = sc.nextFloat();
		
		float s = f*t;
		
		float b = s*5/100;
		
		float x = s+b;
		
		System.out.println("----------------------------------");
		System.out.println("RESULTADO");
		System.out.println("----------------------------------");
		System.out.println("Sueldo: " + s);
		System.out.println("Bono: " + b);
		System.out.println("Total: " + x);
		System.out.println("Total en dólares: " + x/3.24);
		
	}

}
