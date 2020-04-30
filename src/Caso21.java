
import java.util.Scanner;
public class Caso21
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el valor del gasto: ");
		float g = sc.nextFloat();
		
		System.out.println("---------------------------");
		System.out.println("RESULTADO");
		System.out.println("---------------------------");
		System.out.println("Disminución: " + (g-(g*0.12)));
	}

}
