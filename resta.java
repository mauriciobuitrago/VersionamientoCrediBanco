import java.util.Scanner;

public class resta {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner leer = new Scanner(System.in);
            int resta,n2,n1;
            
    System.out.println("Ingrese un numero 1");
        n1 = leer.nextInt();

        System.out.println("Ingrese un numero 2");
        n2 = leer.nextInt();

        resta = n1 - n2;
    System.out.println("La resta es: " + resta);

}


}
