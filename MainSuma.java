import java.util.Scanner;
public class MainSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Suma sum = new Suma();
        
        System.out.println("Ingresa el primer numero: ");
        sum.setA(sc.nextInt());

        System.out.println("Ingresa el segundo numero: ");
        sum.setB(sc.nextInt());

        System.out.println(sum.sumar());
        System.out.println(sum.toString());

        sum.getA();
        sum.getB();
    }
}