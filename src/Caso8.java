
import java.util.Scanner;
public class Caso8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado: ");
		float l = sc.nextFloat();
		
		System.out.println("------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------");
		System.out.println("�rea del cuadrado: " + Math.pow(l, 2));
		System.out.println("Per�metro: " + l*4);
	}

}
