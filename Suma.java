public class Suma{
    private int a,b,resultado;
    public int sumar(){
    resultado = this.a + this.b;
    return resultado;
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

    @Override
    public String toString() {
        return "Suma [a=" + a + ", b=" + b + ", resultado=" + resultado + "]";
    }
}