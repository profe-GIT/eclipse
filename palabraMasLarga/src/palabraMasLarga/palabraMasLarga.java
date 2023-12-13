package palabraMasLarga;

import java.util.Scanner;
import java.util.Arrays;

public class palabraMasLarga {
/* esto es un comentario */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i, c=0;
		String cadena, palabra="", mostrar = null;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase");

		cadena= teclado.nextLine();
        cadena+=" ";

        for(i=0;i<cadena.length();i++){
            palabra=palabra+cadena.charAt(i);
            if(cadena.charAt(i)==' '){
                if(palabra.length()-1>c){
                    c=palabra.length()-1;
                    mostrar=palabra.trim();
                }
                palabra="";
            } 
        }
        System.out.println("La palabra de mayor longitud es: "+mostrar);
        System.out.println("Su longitud es: "+c);
        
        int cantidadA =0;
        String[] frase= cadena.split("");
        for (int contador = 0; contador <= cadena.length()-1   ;contador++) {
        	//if ((frase[contador].toLowerCase).equals("a")){
        		cantidadA++;
        		System.out.println(frase[contador].toLowerCase))
        	}
        }*/
		/*Scanner teclado = new Scanner(System.in);
		 System.out.println("de cuantos filas quieres el vector");
		 int filas = teclado.nextInt();
		 System.out.println("de cuantos columnas quieres el vector");
		 int columnas = teclado.nextInt();
		 String[][] vector = new String[filas][columnas];
		 teclado.close();
		 for (int contador = 0 ; contador <= vector.length-1;contador++) {
			 for (int contador2 = 0 ; contador2 <= vector[0].length-1;contador2++)  
				 Arrays.fill([contador][contador2],"o");
		 } 
		// for (int cuenta = 0; cuenta <= vector.length-1;cuenta++)
		//	 Arrays.fill(vector[cuenta],"o");
		 for (int contador = 0 ; contador <= vector.length-1;contador++) {
			 for (int contador2 = 0 ; contador2 <= vector[0].length-1;contador2++) {  
				 	System.out.print(vector[contador][contador2]);
			 }
			 System.out.println(" ");
		 } */
		 // se definen constantes para representar el
	    // contenido de las celdas
	    final int VACIO = 0;
	    final int MINA = 1;
	    final int TESORO = 2;
	    final int INTENTO = 3;
	    
	    
	    int x;
	    int y;
	    int[][] cuadrante = new int[5][4];
	    
	    // inicializa el array
	    for(x = 0; x < 4; x++) {
	      for(y = 0; y < 3; y++) {
	        cuadrante[x][y] = VACIO;
	      }
	    }
	    // coloca la mina
	    int minaX = (int)(Math.random() * 5);
	    int minaY = (int)(Math.random() * 4);
	    cuadrante[minaX][minaY] = MINA;
	    
	    // coloca el tesoro
	    int tesoroX;
	    int tesoroY;
	    do {
	      tesoroX = (int)(Math.random() * 5);
	      tesoroY = (int)(Math.random() * 4);
	    } while ((minaX == tesoroX) && (minaY == tesoroY));
	    cuadrante[tesoroX][tesoroY] = TESORO;
	    
	    // juego
	    System.out.println("¡BUSCA EL TESORO!");
	    boolean salir = false;
	    String c = "";
	    do {
	      // pinta el cuadrante
	      for(y = 3; y >= 0; y--) {
	        System.out.print(y + "|");  
	        for(x = 0; x < 5; x++) {
	          if (cuadrante[x][y] == INTENTO) {
	            System.out.print("X ");
	          } else {
	            System.out.print("  ");
	          }
	        }
	        System.out.println();
	      }
	      System.out.println("  ----------\n  0 1 2 3 4\n");

	      // pide las coordenadas  
	      System.out.print("Coordenada x: ");
	      x = Integer.parseInt(System.console().readLine());
	      System.out.print("Coordenada y: ");
	      y = Integer.parseInt(System.console().readLine());
	      
	      // mira lo que hay en las coordenadas indicadas por el usuario
	      switch(cuadrante[x][y]) {
	        case VACIO:
	          cuadrante[x][y] = INTENTO;
	          break;
	        case MINA:
	          System.out.println("Lo siento, has perdido.");
	          salir = true;
	          break;
	        case TESORO:
	          System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!"); 
	          salir = true;
	          break;
	        default:
	      }
	    } while (!salir);

	    // pinta el cuadrante
	    for(y = 3; y >= 0; y--) {
	      System.out.print(y + " ");
	      for(x = 0; x < 5; x++) {
	        switch(cuadrante[x][y]) {
	          case VACIO:
	            c = "  ";
	            break;
	          case MINA:
	            c = "* ";
	            break;
	          case TESORO: 
	            c = "€ ";
	            break;
	          case INTENTO:
	            c = "X ";
	            break;
	          default:
	        }
	        System.out.print(c);
	      }
	      System.out.println();    
	    }
	    System.out.println("  ----------\n  0 1 2 3 4\n");
		
	}

}
