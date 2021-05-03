package cdm1.RobertoAbad;

/**
 * @author RobertoAbad
 */

import java.util.*;

public class Matriz {
	Scanner sc = new Scanner(System.in);
	private int[][] m3;

	public Matriz() {

	}

	public void menu() {
		boolean fin = true;
		do {
			System.out.println("-----------------INTRODUCE------------------------");
			System.out.println("-- 1 Suma        2 Escala      3 multiplicacion --");
			System.out.println("-- 4 Transponer  5 Diagonal    6 simetria       --");
			System.out.println("-- 7 Potencia    8 Resta       9 salir          --");
			System.out.println("--------------------------------------------------");
			int opcion = sc.nextInt();
			int[][] m1;
			int[][] m2;
			int[][] m3 = null;

			switch (opcion) {

			/**
			 * Este caso es la SUMA de Matrices m1 + m2 = m3
			 */

			case 1:
				boolean repetir = false;
				do {
					m1 = crearMatriz(1);
					m2 = crearMatriz(1);
					if (m1.length == m2.length && m1[0].length == m2[0].length) {
						repetir = true;
						m3 = suma(m1, m2);
						System.out.println("\nSUMA");
						imprimir(m3);
					}
				} while (!repetir);
				
				break;
				
			/**
			 * Este caso escala la matriz num*m1 = m3
			 */

			case 2:

				System.out.println("Introduce el numero al que quieres escalar");
				int num1 = sc.nextInt();

				m3 = crearMatriz(num1);
				System.out.println("\nESCALADO");
				imprimir(m3);

				break;

			/**
			 * Multiplica dos matrices m1*m2 = m3
			 */

			case 3:
				
				break;

			/**
			 * cambia las filas a colunas A = At
			 */

			case 4:
				transpuesta();
				System.out.println("\nTRANSPONER");
				imprimir(m3);

				break;

			/**
			 * Obtienes el array de la diagonal
			 */

			case 5:
				
				break;

			/**
			 * Nos muestra si el array es simetrico
			 */

			case 6:
				
				break;

			/**
			 * Potencia de una raiz cuadrada m1e2 = m2
			 */

			case 7:
				
				break;

			/**
			 * Resta 2 matrices m1 - m2 = m1 +(m2 multiplicacion(-1))
			 */

			case 8:

				boolean repetir8 = false;
				do {
					m1 = crearMatriz(1);
					m2 = crearMatriz(-1);
					if (m1.length == m2.length && m1[0].length == m2[0].length) {
						repetir8 = true;
						m3 = suma(m1, m2);
						System.out.println("\nRESTA");
						imprimir(m3);
					}
				} 
				while (!repetir8);
				
				break;

			/**
			 * Nos permite salir del programa
			 */

			case 9:

				fin = false;
				
				break;
			}
		} 
		while (fin != false);
		System.out.println("Hasta luego");
	}

	/**
	 * aqui se crean las matrices
	 */
	public int[][] crearMatriz(int num1) {
		int num = num1;
		int filas = 0;
		int columnas = 0;
		System.out.println("Introduce cuantas filas quieres");
		filas = sc.nextInt();
		System.out.println("Introduce cuantas columnas quieres");
		columnas = sc.nextInt();
		int m[][] = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce de la [" + i + "][" + j + "]");
				m[i][j] = sc.nextInt() * num;
			}
		}
		return m;
	}

	/**
	 * Aqui hacemos la transpuesta
	 */
	public int[][] transpuesta() {
		int filas = 0;
		int columnas = 0;
		System.out.println("Introduce cuantas filas quieres");
		filas = sc.nextInt();
		System.out.println("Introduce cuantas columnas quieres");
		columnas = sc.nextInt();
		int m1[][] = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce de la [" + i + "][" + j + "]");
				m1[i][j] = sc.nextInt();
				int [][]m3= new int[m1[0].length][m1.length];
				m3[i][j]=m1[j][i];
			}
		}
		return m3;
		
	}

	/**
	 * Aqui creamos la suma
	 */

	public int[][] suma(int[][] m1, int[][] m2) {
		int m3[][] = new int[m1.length][m1[0].length];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m3;
	}

	/**
	 * Aqui imprimimos los resultados
	 */
	public void imprimir(int[][] m3) {
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3[i].length; j++) {
				System.out.print(m3[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
