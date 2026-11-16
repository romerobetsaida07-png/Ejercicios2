package App;

public class Circulo {
    public double radio = 0;

    public void asignarRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    public String estado() {
        return "Radio: " + this.radio + " | Área: " + String.format("%.2f", this.calcularArea());
    }

    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo();
        System.out.println(circulo.estado());

        circulo.asignarRadio(5);
        System.out.println(circulo.estado());

        circulo.asignarRadio(2.5);
        System.out.println(circulo.estado());
    }
}
