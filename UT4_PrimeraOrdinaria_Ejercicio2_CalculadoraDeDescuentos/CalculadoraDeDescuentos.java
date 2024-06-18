
import java.util.Scanner;

public class CalculadoraDeDescuentos {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //precO=Precio original
        //des=desc
        //precFi=Precio final
        double precO, desc, precFi;
        int tipoCliente; // 1 para clientes habituales, 2 para clientes esporádicos

        System.out.println("Ingrese el precio original del producto: ");
        precO = sc.nextDouble();

        System.out.println("Ingrese el tipo de cliente (1 para habituales, 2 para esporádicos): ");
        tipoCliente = sc.nextInt();

        if (tipoCliente == 1) {
            desc = 0.15; // 15% de desc para clientes habituales
        } else {
            desc = 0.05; // 5% de desc para clientes esporádicos
        }

        precFi = precO - (precO * desc);

        System.out.println("El precio final con descuento es: " + precFi);

        sc.close();
    }
}
