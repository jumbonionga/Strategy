public class NavegadorGPS {
    private IRutaStrategy strategy;

    public NavegadorGPS(IRutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void setRutaStrategy(IRutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void calcularRuta(String puntoA, String puntoB) {
        System.out.println(strategy.calcularRuta(puntoA, puntoB));
    }
}
