
import java.util.Scanner;

public class Main_Cone {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio do cone: ");
		float Z = sc.nextFloat();
		
		System.out.print("Informe a altura do cone: ");
		float R = sc.nextFloat();
		
		System.out.print("Informe o tipo de tinta desejado, tipo 1, 2 ou 3: ");
		int tipo_tinta = sc.nextInt();
		
		Cone cone = new Cone(R, Z, tipo_tinta);
		System.out.println(cone);
		
		sc.close();
	}	
}