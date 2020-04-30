
import java.util.Scanner;
public class Caso11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre: ");
		String n = sc.nextLine();
		
		System.out.println("------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------");
		System.out.println("Número de caracteres: " + n.length());
	}

}
