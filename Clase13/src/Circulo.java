public class Circulo extends Figura{

     private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
     double calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

}
