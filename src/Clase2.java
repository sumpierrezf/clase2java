import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para verificar si es primo: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        //EJERCICIO 2
        System.out.print("Ingrese el primer número: ");
        Integer numA = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        Integer numB = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        Integer numC = scanner.nextInt();

        // Llamada a la función para comparar tres num y mostrar el num mas grande
        Integer maximo = maximoEntre3num(numA, numB, numC);
        System.out.println("El máximo entre los tres números es: " + maximo);

        //EJERCICIO 3
        String texto1 = "Hola";
        String texto2 = "Hola mundo";

        //COMPARO LAS CADENAS
        if (cadenasDeTextoDistintas(texto1, texto2)) {
            System.out.println("Las cadenas son distintas.");
        } else {
            System.out.println("Las cadenas coinciden.");
        }
    }
    //FUNCION para calcular si el num es primo
    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= numero/2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
    //FUNCION para comparar tres num y hallar el mas grande
    static Integer maximoEntre3num(Integer numA, Integer numB, Integer numC){
        if (numA.compareTo(numB) > 0 && numA.compareTo(numC) > 0) {
            return numA;
        } else if (numB.compareTo(numA) > 0 && numB.compareTo(numC) > 0) {
            return numB;
        } else {
            return numC;
        }
    }

    //FUNCION PARA COMPARAR LOS TEXTOS
    static boolean cadenasDeTextoDistintas(String texto1, String texto2) {
        return !texto1.equals(texto2);
    }

}
