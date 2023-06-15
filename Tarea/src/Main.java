import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un cuadrado");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("4. Calcular área de un triángulo");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Test.calcularAreaCirculo(radio);
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case 2:
                    System.out.println("Ingrese el lado del cuadrado:");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = Test.calcularAreaCuadrado(lado);
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;
                case 3:
                    System.out.println("Ingrese la base del rectángulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double altura = scanner.nextDouble();
                    double areaRectangulo = Test.calcularAreaRectangulo(base, altura);
                    System.out.println("El área del rectángulo es: " + areaRectangulo);
                    break;
                case 4:
                    System.out.println("Ingrese la base del triángulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = Test.calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
