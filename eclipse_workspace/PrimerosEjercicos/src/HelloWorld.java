
public class HelloWorld {

	public static void main(String[] args) {
		holaMundo();
	}
	static void holaMundo(){
		//comentario de una linea
				/*
				 * esto es un comentario de varias lineas
				 */
				System.out.print("Hola mundo!");
				System.out.print("Hola mundo!");
				System.out.println("Hola mundo! con println cambio de linea");
				System.out.print("Hola mundo!");
				/*
				 * Declarando algunas variables a continuacion
				 */
				int ano=2016;
				String nombre="Asier";
				int anoNac=1985;
				boolean mayorDedad=true;
				int edad=ano-anoNac;
				System.out.print(nombre);
				System.out.print(anoNac);
				System.out.println(mayorDedad);
				System.out.println("Hola "+nombre+" tienes "+edad+" años");
	}
}
