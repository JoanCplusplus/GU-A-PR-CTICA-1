
import java.util.Scanner;
public class Caso13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String n = sc.nextLine();
		
		System.out.print("Ingrese apellido: ");
		String a = sc.nextLine();
		
		System.out.println("------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------");
		System.out.println("Alumno: " + n.concat(" " + a));
		
	}

}
