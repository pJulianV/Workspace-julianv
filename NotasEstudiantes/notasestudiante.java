
package Notasestudiante;

public class notasestudiante {
	// Solicita los nombres de 5 estudiante y retorna un array con ellos
	public static String[] solicitarNombres() {
		String[] nombres = new String[5];
		java.util.Scanner scan = new java.util.Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
			nombres[i] = scan.nextLine();
		}
        scan.close();
		return nombres;
        
	}

	// Solicita las notas de los estudiante y retorna un array con ellas
	public static double[] solicitarNotas(String[] nombres) {
		double[] notas = new double[5];
		java.util.Scanner scan = new java.util.Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			while (true) {
				System.out.print("Ingrese la nota de " + nombres[i] + " (1.0 - 10.0): ");
				try {
					notas[i] = Double.parseDouble(scan.nextLine());
					if (notas[i] >= 1.0 && notas[i] <= 10.0) {
						break;
					} else {
						System.out.println("Error: La nota debe estar entre 1.0 y 10.0.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Error: Ingrese un número válido.");
				}
			}
		}
        scan.close();
		return notas;
	}

	// Calcula el promedio de las notas
	public static double calcularPromedio(double[] notas) {
		double suma = 0;
		for (double nota : notas) {
			suma += nota;
		}
		return suma / notas.length;
	}

	// Imprime el promedio y los estudiante por debajo del promedio
	public static void mostrarestudiantePorDebajoDelPromedio(String[] nombres, double[] notas, double promedio) {
		System.out.printf("Promedio del curso: %.2f\n", promedio);
		System.out.println("estudiante por debajo del promedio:");
		boolean alguno = false;
		for (int i = 0; i < nombres.length; i++) {
			if (notas[i] < promedio) {
				System.out.printf("%s: %.2f\n", nombres[i], notas[i]);
				alguno = true;
			}
		}
		if (!alguno) {
			System.out.println("Ningún estudiante está por debajo del promedio.");
		}
	}

	public static void main(String[] args) {
		String[] nombres = solicitarNombres();
		double[] notas = solicitarNotas(nombres);
		double promedio = calcularPromedio(notas);
		mostrarestudiantePorDebajoDelPromedio(nombres, notas, promedio);
	}
}
