package clasesdivididas;
public class main {
    public static void ScannerUno() {
        System.out.println("Ingrese el valor:");
        Todos.numero1 = Todos.teclado.nextInt();
    }

    public static void ScannerDos() {
        System.out.println("Ingrese el primer valor:");
        Todos.numero1 = Todos.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        Todos.numero2 = Todos.teclado.nextInt();
    }

    public static void ScannerTres() {
        System.out.println("Ingrese el primer valor:");
        Todos.numero1 = Todos.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        Todos.numero2 = Todos.teclado.nextInt();
        System.out.println("Ingrese el tercer valor:");
        Todos.numero3 = Todos.teclado.nextInt();
    }

    public static void ScannerCinco() {
        System.out.println("Ingrese el primer valor:");
        Todos.numero1 = Todos.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        Todos.numero2 = Todos.teclado.nextInt();
        System.out.println("Ingrese el tercer valor:");
        Todos.numero3 = Todos.teclado.nextInt();
        System.out.println("Ingrese el cuarto valor:");
        Todos.numero4 = Todos.teclado.nextInt();
        System.out.println("Ingrese el quinto valor:");
        Todos.numero5 = Todos.teclado.nextInt();
    }

    public static void ScannerSeis() {
        System.out.println("Ingrese el primer valor:");
        Todos.numero1 = Todos.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        Todos.numero2 = Todos.teclado.nextInt();
        System.out.println("Ingrese el tercer valor:");
        Todos.numero3 = Todos.teclado.nextInt();
        System.out.println("Ingrese el cuarto valor:");
        Todos.numero4 = Todos.teclado.nextInt();
        System.out.println("Ingrese el quinto valor:");
        Todos.numero5 = Todos.teclado.nextInt();
        System.out.println("Ingrese el sexto valor:");
        Todos.numero6 = Todos.teclado.nextInt();
    }

    public static void ScannerUnoD() {
        System.out.println("Ingrese el valor:");
        Todos.numero1D = Todos.teclado.nextDouble();
    }

    public static void ScannerTresD() {
        System.out.println("Ingrese el primer valor:");
        Todos.numero1D = Todos.teclado.nextDouble();
        System.out.println("Ingrese el segundo valor:");
        Todos.numero2D = Todos.teclado.nextDouble();
        System.out.println("Ingrese el tercer valor:");
        Todos.numero3D = Todos.teclado.nextDouble();
    }

    public static void ScannerCuatroD() {
        System.out.println("Ingrese el primer valor (x1):");
        Todos.numero1D = Todos.teclado.nextDouble();
        System.out.println("Ingrese el segundo valor (y1):");
        Todos.numero2D = Todos.teclado.nextDouble();
        System.out.println("Ingrese el tercer valor (x2):");
        Todos.numero3D = Todos.teclado.nextDouble();
        System.out.println("Ingrese el cuarto valor (y2):");
        Todos.numero4D = Todos.teclado.nextDouble();
    }

    public static void ScannerChar() {
        System.out.print("Ingrese una letra: ");
        Todos.letra = Todos.teclado.next().charAt(0);
    }
}
    private static void displayMenu() {
        System.out.println("Ingrese un ejercicio del 1 al 30:");
        System.out.println("1. Calcular la distancia recorrida");
        System.out.println("2. Calcular el promedio de 3 notas");
        System.out.println("3. Calcular el puntaje final");
        System.out.println("4. Calcular el puntaje final de partidos ganados, perdidos y empatados en un torneo");
        System.out.println("5. Calcular la planilla de un trabajador");
        System.out.println("6. Hacer el cálculo de los 3 lados de un triángulo");
        System.out.println("7. Calcular el número de CDs necesarios para hacer una copia de seguridad");
        System.out.println("8. Obtener la distancia entre el punto A y B");
        System.out.println("9. Saber si una persona debe sacar su CUIL");
        System.out.println("10. Calcular la edad de dos hermanos y decir la diferencia de edad y quién es mayor");
        System.out.println("11. Cálculo de la producción promedio de una empresa");
        System.out.println("12. Leer tres números enteros diferentes y determinar el número mayor");
        System.out.println("13. Reconocer el tipo de triángulo por sus lados");
        System.out.println("14. Ingresar los números del 1 al 10 y mostrar su equivalente en números romanos");
        System.out.println("15. Calcular si las ventas realizadas durante un mes por un vendedor merecen bonificación");
        System.out.println("16. Ingresar los números del 1 al 5 y mostrar su vocal equivalente");
        System.out.println("17. Leer un número entero de dos cifras y mostrar el número de decenas y centenas");
        System.out.println("18. Leer un número entero, si es diferente de cero, determinar si es par");
        System.out.println("19. Contener los primeros diez números pares");
        System.out.println("20. Calcular el sueldo promedio de un grupo de personas");
        System.out.println("21. Solicitar la edad de 200 personas y mostrar cuántos mayores y menores de edad hay");
        System.out.println("22. Realizar sumas sucesivas con dos números enteros y mostrar su producto");
        System.out.println("23. Mostrar los 10 primeros números enteros excepto los pares");
        System.out.println("24. Mostrar los términos de la serie que sean menores a 1000");
        System.out.println("25. Solicitar ingresar letras hasta que entre una vocal");
        System.out.println("26. Términos de la serie Fibonacci menores a 100000");
        System.out.println("27. Solicitar dos números enteros y un operador aritmético y mostrar el resultado");
        System.out.println("28. Solicitar 10 letras cualesquiera e indicar cuántas vocales y consonantes se ingresaron");
        System.out.println("29. Resultado de unas elecciones");
        System.out.println("30. Promedio de dos números");
        System.out.println("Seleccione 0 para salir");
    }

