import java.util.Scanner;
public class CalcularMedia {

	public static void main(String[] args) {
		//definir una constante con el numero de asignaturas
		final int NUM_ASIG_ALUM=3;
		
		//crear clase Scanner para recoger los datos
		Scanner sc=new Scanner(System.in);
		// definir una var para guardar la nota de programacion
		float notaPrograma;
		//definir una var para guardar la nota de bbdd
		float notaBbdd;
		//definir una var para guardar la nota de leng marcas
		float notaLmarcas;
		//pedir las notas al usuario
		System.out.println("Introduce tus notas...");
		System.out.print("Programacion:");
		notaPrograma=sc.nextInt();
		System.out.print("Bases de datos:");
		notaBbdd=sc.nextInt();
		System.out.print("Lenguaje de marcas:");
		notaLmarcas=sc.nextInt();
		
		//iniciar las var con las notas que vas a sacar
		//notaPrograma=9.99f;
		//notaBbdd=8.99f;
		//notaLmarcas=9.50f;
		
		
		//definir una var para calcular la media
		float notaMedia=(notaPrograma+notaBbdd+notaLmarcas)/NUM_ASIG_ALUM;
		//escribe tu media por consola
		System.out.print(notaMedia);
	}

}
