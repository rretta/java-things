public class Triangulo extends PoligonoRegular{


    private double lado1;
    private double lado2;
    private double lado3;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void getLados(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }





    //ChatGPT Ayudó:
    /*El valor NaN (Not a Number) se produce cuando se realiza una operación matemática inválida,
    como intentar calcular la raíz cuadrada de un número negativo o cuando se producen divisiones por cero.
    En el caso específico de la fórmula de Herón, si los lados del triángulo
    no cumplen con la desigualdad triangular, es posible que se obtenga un valor
    negativo o cero dentro de la raíz cuadrada, lo que resulta en NaN.

    Para evitar este problema, puedes agregar una validación para asegurarte de
    que los lados del triángulo sean válidos antes de calcular el área. Puedes realizar
    una verificación adicional antes de realizar el cálculo de la siguiente manera:
     */
    @Override
    public double calcularArea() {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
            System.out.println("* Los lados ingresados no forman un triángulo válido. *");
            return 0.0; // o un valor que indique que no se puede calcular el área
        }

        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        System.out.println(area);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }



}
