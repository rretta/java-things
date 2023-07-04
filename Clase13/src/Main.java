/*Crea una clase base llamada "Figura" con métodos para calcular el área y el perímetro
  de una figura geométrica genérica.
  Luego, crea clases derivadas como "Triangulo", "Rectangulo" y "Circulo",
  que hereden de la clase base y sobreescriban los métodos para calcular el área
  y el perímetro según su forma específica. Crea instancias de las diferentes figuras
  y muestra sus áreas y perímetros.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("***************************************");
            System.out.println("*        Menú de opciones            *");
            System.out.println("*                                     *");
            System.out.println("* 1. Crear triángulo                 *");
            System.out.println("* 2. Crear rectángulo                *");
            System.out.println("* 3. Crear círculo                   *");
            System.out.println("* 4. Salir                           *");
            System.out.println("*                                     *");
            System.out.println("***************************************");
            System.out.print("Seleccione una opción: ");
            int seleccion = scanner.nextInt();


        switch (seleccion) {
            case 1:
                System.out.println("*        Ingrese lados del triángulo          *");
                System.out.println("Lado 1: ");
                double lado1 = scanner.nextDouble();
                System.out.println("Lado 2: ");
                double lado2 = scanner.nextDouble();
                System.out.println("Lado 3: ");
                double lado3 = scanner.nextDouble();
                Figura triangulo = new Triangulo(lado1, lado2, lado3);
                System.out.println("Área: " + String.format("%.2f",triangulo.calcularArea()));
                System.out.println("Perímetro: " + String.format("%.2f",triangulo.calcularPerimetro()));
                break;
            case 2:
                System.out.println("* Ingrese la base y la altura del rectángulo: *");
                System.out.println("Base: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.println("Altura: ");
                double alturaRectangulo = scanner.nextDouble();
                Figura rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                System.out.println("Área: " + rectangulo.calcularArea());
                System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
                break;
            case 3:
                System.out.println("Ingrese el radio del círculo:");
                double radioCirculo = scanner.nextDouble();
                Circulo circulo = new Circulo();
                circulo.setRadio(radioCirculo);
                System.out.println("Área: " + String.format("%.2f",circulo.calcularArea()));
                System.out.println("Perímetro: " + String.format("%.2f",circulo.calcularPerimetro()));
                break;
            case 4:
                System.out.println("Terminando ejecución");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Opción inválida.");
                break;
        }
        }
    }
}
