import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.
        Suma sum = new Suma(); // Crear un objeto Suma.

        // Solicitar al usuario que ingrese los dos números.
        System.out.println("Ingresa el primer numero: ");
        sum.setA(sc.nextInt()); // Leer el primer número y asignarlo a 'a' mediante el método setA.

        System.out.println("Ingresa el segundo numero: ");
        sum.setB(sc.nextInt()); // Leer el segundo número y asignarlo a 'b' mediante el método setB.

        System.out.println(sum.sumar()); // Imprimir la suma de los dos números.
        System.out.println(sum.toString()); // Imprimir la representación en cadena del objeto Suma.

        sum.getA();public class Suma{
    private int a,b,resultado; // Definición de variables de instancia para los números a sumar y el resultado.

    public int sumar(){ // Método para sumar los números a y b.
        resultado = this.a + this.b; // Realiza la suma y guarda el resultado en la variable de instancia resultado.
        return resultado; // Devuelve el resultado de la suma.
        sum.getB();
    }
}
