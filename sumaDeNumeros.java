import java.util.Scanner; //Tenemos que importar este paquete para poder usar la clase Scanner

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Lo primero que tenemos que conocer es que la clase Scanner nos permite leer contenido 
		 * insertado por consola de una forma sencilla. 
		 * Lo que tenemos que hacer es crear un Scanner sobre el elemento de consola que es el 
		 * System.in.
		 */
		Scanner reader = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.println("Introduce el número 1:");
		/*
		 * A partir de ese momento cada vez que queramos que el usuario nos de una entrada por
		 * teclado, en nuestro caso un número deberemos de llamar al método .nextInt()
		 */
		numero1 = reader.nextInt();
		System.out.println("Introduce el número 2:");
		numero2 = reader.nextInt();
		int suma=numero1+numero2;
        
        //impresion de resultados 
		System.out.println("La suma de los dos número es: "+suma);
	
	}

}