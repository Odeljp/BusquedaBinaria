import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        
        System.out.print("Ingrese el número que desea buscar: ");
        int numero = scanner.nextInt();

        int resultado = busquedaBinaria(arreglo, numero);

        if (resultado == -1) {
            System.out.println("El número no se encuentra en el arreglo.");
        } else {
            System.out.println("El número se encuentra en la posición: " + resultado);
        }
        
        scanner.close();
    }

    public static int busquedaBinaria(int[] arreglo, int numero) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arreglo[medio] == numero) {
                return medio;
            }

            if (arreglo[medio] < numero) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }
}