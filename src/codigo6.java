//genera 20 numeros al azar de los cuales dara la eleccion de elegir numeros multiplos de 5 y 7, los cuales los encerrara en corchetes
import java.util.Scanner;
public class codigo6 {
	 public static void main(String[] args) {
		 int[] n = new int[20];//definir de manera correcta la variable

	    for (int i = 0; i < 20; i++) {//definir el i++ correcto
	      n[i] = (int)(Math.random() * 381) + 20;//definir correcta la variable
	      System.out.print(n[i] + " ");//falta el out y definit la variable
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");//definir el salto despues de imprimir
	    System.out.print("(1 – los múltiplos de 5, (2 – los múltiplos de 7: ");//correccion del enunciado
	    
	    Scanner scanner = new Scanner(System.in);
	    int opcion = Integer.parseInt(scanner.nextLine());//cerrar el system console

	    int multiplo = (opcion == 1) ? 5 : 7;//organizar el acomodo

	    System.out.println("\nNúmeros resaltados: ");
	    for (int num : n) {//definir el tipo de valor y borrar el each
	      if (num % multiplo == 0) {// definir correctamente el cambio de variable
	        System.out.print("[" + num + "] ");// definir correctamente el cambio de variable
	      } else {//cerrar 
	        System.out.print(num + " ");//definir correctamente la variable y la impression
	      }
	    }
	    scanner.close();
	    }
	}
