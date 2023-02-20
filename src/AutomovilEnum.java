public class AutomovilEnum {
    public static void main(String[] args) {

        ClaseAutomovil gol = new ClaseAutomovil("VW", "Gol", Color.AZUL);

        gol.setFabricante("VW");
        gol.setModelo("Gol");
        gol.setMotor( new Motor( 1.6,TipoMotor.BENCINA));
        gol.setTipo(TipoAutomovil.SEDAN);

        ClaseAutomovil jetta = new ClaseAutomovil("Volkswagen", "Jetta Clasico", Color.ROJO);
        jetta.setMotor( new Motor(4.1, TipoMotor.BENCINA));
        jetta.setTipo(TipoAutomovil.SEDAN);

        System.out.println("jetta = " + jetta);

        TipoAutomovil tipoJetta = jetta.getTipo();
        System.out.println(tipoJetta.getNombre());
        System.out.println(tipoJetta.getNumeroPuertas());

        switch (tipoJetta){
            case CONVERTIBLE->
                System.out.println("El automovil es deportivo y descapotable de 2 puertas");

            case COUPE ->
                System.out.println("Automovil pequeño de 2 puertas y deportivo");

            case FURGON ->
                System.out.println("Vehiculo de transporte utilitario");

            case HATCHBACK->
                System.out.println("Vehiculo peque{o y muy divertido para las nuevas generaciones");

            case PICKUP->
                System.out.println("Camioneta de doble cabina");

            case SEDAN->
                System.out.println("Es un automovil mediano");

            case STATION_WAGON->
                System.out.println("Es un automovil familiar con maletero muy amplio");

        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil tipo : tipos) {
            System.out.println(tipo.getNombre());

        }


    }
}