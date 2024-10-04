import com.laura.compras.modelos.Compras;
import com.laura.compras.modelos.TarjetaCredito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el limite de la targeta: ");
        double limite = sc.nextDouble();

        TarjetaCredito tarjetaCompra = new TarjetaCredito(limite);

        int serguiComprando = 1;

        while (serguiComprando == 1) {
            System.out.println("Ingresa el nombre de la compra: ");
            String nombre = sc.next();

            System.out.println("Ingresa el valor de la compra: ");
            double valor = Double.valueOf(sc.next());

            Compras compra = new Compras(nombre, valor);
            boolean compraRealizada = tarjetaCompra.registrarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra Realizada!");
                System.out.println("Escriba 0 para salir y 1 para continuar comprando");
                serguiComprando = sc.nextInt();
            }else {
                System.out.println("Saldo insuficiente!");
                serguiComprando = 0;
            }
        }

        tarjetaCompra.mostrarCompras();
        System.out.println("Saldo disponible: $" + tarjetaCompra.getSaldo());
    }
}