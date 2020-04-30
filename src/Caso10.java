
import java.util.Scanner;
public class Caso10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el radio: ");
		float r = sc.nextFloat();
		
		System.out.println("------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------");
		System.out.println("Área: " + (3.1416*(Math.pow(r, 2))));
		System.out.println("Perímetro: " + ((2*3.1416)*r));
	}

}
