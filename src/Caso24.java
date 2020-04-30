
import java.util.Scanner;
public class Caso24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Monto 1: ");
		float m1 = sc.nextFloat();
		
		System.out.print("Monto 2: ");
		float m2 = sc.nextFloat();
		
		System.out.print("Monto 3: ");
		float m3 = sc.nextFloat();
		
		float x = (float)((m1/5)+(m2*0.2));
		float y = (float)(((m3+(m3*0.6))/2));
		float z = (float)((m1+m2+m3)-((m1+m2+m3)*0.08));
		
		System.out.println("--------------------------");
		System.out.println("RESULTADOS");
		System.out.println("---------------------------");
		System.out.println("RPTA 1: " + x);
		System.out.println("RPTA 2: " + y);
		System.out.println("RPTA 3: " + z);
	}

}
