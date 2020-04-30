
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Número de aprobados: ");
		int a = sc.nextInt();
		
		System.out.print("Número de desaprobados: ");
		int d = sc.nextInt();
		
		System.out.print("Número de retirados: ");
		int r = sc.nextInt();
		
		float x = a+d+r;
		
		System.out.println("------------------------------");
		System.out.println("RESULTADOS");
		System.out.println("------------------------------");
		System.out.println("Aprobados: " + df.format((a*100)/x) + "%");
		System.out.println("Desaprobados: " + df.format((d*100)/x) + "%");
		System.out.println("Retirados: " + df.format((r*100)/x) + "%");
		
	}
}
