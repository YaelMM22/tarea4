package primer_Proyecto2023;

import java.util.Scanner;

public class Promedio {
    Scanner leer = new Scanner(System.in);
    double num;
    double suma = 0.0;
    int n;

    public Promedio(int n) {
        this.n = n;
    }

    public void agregarNumero() {
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el " + i + " número: ");
            num = leer.nextDouble();
            suma += num;
        }
    }

    public double calcularPromedio() {
        if (n > 0) {
            return suma / n;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("¿Cuántas variables vamos a considerar?: ");
        int n = leer.nextInt();

        Promedio promp = new Promedio(n);
        promp.agregarNumero();

        System.out.println("Promedio: " + promp.calcularPromedio());
    }
}