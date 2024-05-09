public class Suma{
    private int a,b,resultado; // Definición de variables de instancia para los números a sumar y el resultado.

    public int sumar(){ // Método para sumar los números a y b.
        resultado = this.a + this.b; // Realiza la suma y guarda el resultado en la variable de instancia resultado.
        return resultado; // Devuelve el resultado de la suma.
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    // Metodos getters y setters

    @Override
    public String toString() { // Método toString para representar el objeto Suma como una cadena de texto.
        return "Suma [a=" + a + ", b=" + b + ", resultado=" + resultado + "]"; // Devuelve una cadena con los valores de a, b y resultado.
    }
}