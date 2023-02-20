public class Automovil {
    public static void main(String[] args) {

        ClaseAutomovil gol = new ClaseAutomovil("VW", "Gol", Color.AZUL);

        Motor motorGol = new Motor(1.6,TipoMotor.BENCINA);

        gol.setFabricante("VW");
        gol.setModelo("Gol");
        gol.setMotor(motorGol);
        gol.setTipo(TipoAutomovil.SEDAN);
        gol.setTanque(new Tanque(50));

        System.out.println(ClaseAutomovil.VELOCIDAD_MAXIMA_CIUDAD);


        ClaseAutomovil jetta = new ClaseAutomovil("Volkswagen", "Jetta Clasico", Color.ROJO);
        jetta.setMotor(new Motor(2.5,TipoMotor.DIESEL));
        jetta.setTipo(TipoAutomovil.SEDAN);
        jetta.setTanque(new Tanque(70));

        Motor motorNissan = new Motor(2.1,TipoMotor.BENCINA);

        ClaseAutomovil nissan = new ClaseAutomovil("Nissan","Sentra", Color.VERDE, motorNissan);
        nissan.setTanque(new Tanque(60));

        ClaseAutomovil nissan2 = new ClaseAutomovil("Nissan","Sentra", Color.VERDE, new Motor(4.0,TipoMotor.DIESEL));
        nissan2.setTanque(new Tanque(50));
        ClaseAutomovil auto = new ClaseAutomovil();

        nissan.setTipo(TipoAutomovil.CONVERTIBLE);
        TipoAutomovil tipoNissan = nissan.getTipo();
        System.out.println("Tipo nissan: " + tipoNissan.getNombre());
        System.out.println("Num Puertas Nissan: "+ tipoNissan.getNumeroPuertas());



        System.out.println(nissan==nissan2);
        System.out.println(nissan.equals(nissan2));
        System.out.println(auto.equals(nissan));
        System.out.println(nissan2);


        System.out.println(gol.detalles());
        System.out.println("---------------------------");
        System.out.println(jetta.detalles());

        System.out.println("---------------------------");
        System.out.println(gol.acelerar(2500));
        System.out.println("---------------------------");
        System.out.println(jetta.frenar());

        System.out.println(gol.acelerarYFrenar(3000));
        System.out.println("---------------------------");

        System.out.println( jetta.calculaConsumo(300, 0.80F) );



    }
}