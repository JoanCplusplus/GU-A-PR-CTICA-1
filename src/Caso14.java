
import java.util.Scanner;
public class Caso14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el número: ");
		float n = sc.nextFloat();
		 
		System.out.println("------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------");
		System.out.println("Sumatoria: " + ((n*(n+1))/2));
		
	}

}
