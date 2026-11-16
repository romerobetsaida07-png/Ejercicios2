package App;

public class ValidarEntero1 {
    public String valor = "";

    public void asignar(String valor) {
        this.valor = valor;
    }
    public boolean esEntero() {
        try {
            Integer.parseInt(this.valor.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public String estado() {
        if (this.esEntero()) {
            return "\"" + this.valor + "\" es un número entero válido";
        } else {
            return "\"" + this.valor + "\" NO es un número entero";
        }
    }
    public static void main(String[] args) throws Exception {
        ValidarEntero1 numero = new ValidarEntero1();

        numero.asignar("25");
        System.out.println(numero.estado());

        numero.asignar("-7");
        System.out.println(numero.estado());

        numero.asignar("3.14");
        System.out.println(numero.estado());

        numero.asignar("hola");
        System.out.println(numero.estado());
    }
}
