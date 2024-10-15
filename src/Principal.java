import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion=0;
        while (opcion !=8) {
            System.out.println("******************************\n"+
                    "Bienvenido al sistema de conversión de monedas\n\n" +
                    "Ingrese la transacción que desea realizar\n\n" +
                    "1- Dolar (usd) a Peso Argentino (ars)\n"+
                    "2- Peso Argentino (ars) a Dolar (usd)\n"+
                    "3- Dolar (usd) a Real Brasilero (brl)\n"+
                    "4- Real Brasilero (brl) a Dolar (usd)\n"+
                    "5- Dolar (usd) a Peso Chileno (clp)\n"+
                    "6- Peso Chileno (clp) a Dolar (usd)\n"+
                    "7- Conversion de otras monedas\n"+
                    "8- Salir.");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "CLP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,lectura);
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        }
    }
}