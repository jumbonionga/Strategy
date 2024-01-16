public class Main {
    public static void main(String[] args) {
        String puntoInicio = "Inicio", puntoFinal="Final";
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta(puntoInicio, puntoFinal);

        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta(puntoInicio,puntoFinal);

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta(puntoInicio,puntoFinal);

    }
}