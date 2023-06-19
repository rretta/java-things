public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(){

    };

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("TITULAR: " + titular);
        System.out.println("CANTIDAD: " + cantidad);

    };

    public void ingresar(double cantidad){
        if(cantidad >= 0){
            this.cantidad += cantidad;
        }

    }


    public void retirar(double cantidad){
        this.cantidad -= cantidad;
    }

}
