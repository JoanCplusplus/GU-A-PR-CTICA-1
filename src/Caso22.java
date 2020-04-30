
import java.util.Scanner;
public class Caso22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre del alumno: ");
		String a = sc.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		float b = sc.nextFloat();
		
		System.out.print("Ingrese nota 2: ");
		float c = sc.nextFloat();
		
		System.out.print("Ingrese nota 3: ");
		float d = sc.nextFloat();
		
		System.out.println("----------------------------");
		System.out.println("RESULTADOS");
		System.out.println("----------------------------");
		System.out.println("Promedio: " + ((b*0.2)+(c*0.3)+(d*0.5)));		
	}

}
