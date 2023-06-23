package primer_Proyecto2023;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        double num1, num2, total;
        String sel = null;
        Scanner tec = new Scanner(System.in);
        System.out.println("Seleccione la opción deseada:");
        System.out.println("+\n-\n* \n/ ");
        sel = tec.next();
        switch (sel) {
            case "+":
                System.out.println("Usted ha escogido la opción de suma. Por favor, ingrese los valores:");
                System.out.println("Ingrese un número:");
                num1 = tec.nextDouble();
                System.out.println("Ingrese otro número:");
                num2 = tec.nextDouble();
                total = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + total);
                break;
            case "-":
                System.out.println("Usted ha escogido la opción de resta. Por favor, ingrese los valores:");
                System.out.println("Ingrese un número:");
                num1 = tec.nextDouble();
                System.out.println("Ingrese otro número:");
                num2 = tec.nextDouble();
                total = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + total);
                break;
            case "*":
                System.out.println("Usted ha escogido la opción de multiplicación. Por favor, ingrese los valores:");
                System.out.println("Ingrese un número:");
                num1 = tec.nextDouble();
                System.out.println("Ingrese otro número:");
                num2 = tec.nextDouble();
                total = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + total);
                break;
            case "/":
                System.out.println("Usted ha escogido la opción de división. Por favor, ingrese los valores:");
                System.out.println("Ingrese un número:");
                num1 = tec.nextDouble();
                System.out.println("Ingrese otro número:");
                num2 = tec.nextDouble();
                total = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + total);
                break;
        }
    }
}
