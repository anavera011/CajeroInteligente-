import java.util.Scanner;

public class CajeroInteligente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] compras = { 12000, 25000, 8000, 35000, 15000 };

        int cantidad_compras = 0;
        int total_ventas = 0;
        int compras_grandes = 0;
        for (int i = 0; i < compras.length; i++) {
            total_ventas = total_ventas + compras[i];
            cantidad_compras++;
            if (compras[i] > 20000) {
                compras_grandes++;
            }
        }
        double promedio = (double) total_ventas / cantidad_compras;

        System.out.println("===RESUMEN DE VENTAS");
        System.out.println("Cantidad de compras: " + cantidad_compras);
        System.out.println("Dinero recaudado: " + total_ventas);
        System.out.println("Compras superiores a $20.000: " + compras_grandes);
        System.out.println("El promedio compras es: " + promedio);
    }
}