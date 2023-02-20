public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4) ,
    STATION_WAGON("Station Wagon", "Auto grande",4),
    HATCHBACK("Hatchback", "Auto Compacto",4),
    PICKUP("Pickup", "Camioneta",4),
    COUPE("Coupé", "Auto Pequeño",2),
    CONVERTIBLE("Convertible", "Auto Deportivo",2),
    FURGON("Furgon", "Auto utilitario",4);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }


}
