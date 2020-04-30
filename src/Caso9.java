
import java.util.Scanner;
public class Caso9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la altura: ");
		float a = sc.nextFloat();
		System.out.print("Ingrese la base: ");
		float b = sc.nextFloat();
		
		System.out.println("------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------");
		System.out.println("Área: " + b*a);
		System.out.println("Perímetro: " + ((b*2)+(a*2)));

	}

}
