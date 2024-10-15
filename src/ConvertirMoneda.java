import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultaMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión al día de hoy " + "es de\n1 "+monedaBase+ " = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad de "+monedaBase+" que desea convertir");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+ " = " +cantidadConvertida+" "+ monedas.target_code());
    }

        public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura) {
            System.out.println("Ingrese el código (eur usd ars cop, etc.) de la moneda a cambiar" );
            String monedaBase = lectura.nextLine().toUpperCase();
            System.out.println("Ingrese el código de la moneda que desea obtener");
            String monedaObjetivo = lectura.nextLine().toUpperCase();
            convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
