public class AutomovilRelaciones {
    public static void main(String[] args) {

        Persona conductorGol = new Persona("Luci", "Martinez");
        Motor motorGol = new Motor(1.6,TipoMotor.BENCINA);
        ClaseAutomovil gol = new ClaseAutomovil("VW", "Gol", Color.AZUL);

        Rueda[] ruedasGol = new Rueda[5];
        for (int i = 0; i < ruedasGol.length; i++) {
            ruedasGol[i] = new Rueda("Yokohama",16,7.5);
        }

        gol.setFabricante("VW");
        gol.setModelo("Gol");
        gol.setMotor(motorGol);
        gol.setTipo(TipoAutomovil.SEDAN);
        gol.setTanque(new Tanque(50));
        gol.setPropietario(conductorGol);
        gol.setRuedas(ruedasGol);



        Persona mouse = new Persona("Mickey", "Mouse");
        ClaseAutomovil jetta = new ClaseAutomovil("Volkswagen", "Jetta Clasico", Color.ROJO);
        jetta.setMotor(new Motor(2.5,TipoMotor.DIESEL));
        jetta.setTipo(TipoAutomovil.SEDAN);
        jetta.setTanque(new Tanque(70));
        jetta.setPropietario(mouse);
        Rueda[] ruedasJetta =  new Rueda[5];
        jetta.setRuedas(ruedasJetta);

        for (int i=0; i < ruedasJetta.length; i++) {
            jetta.addRueda(new Rueda("Michelin", 18, 10.5));
        }


        Motor motorNissan = new Motor(2.1,TipoMotor.BENCINA);
        Persona chano = new Persona("Luciano","Santiz");



        ClaseAutomovil nissan = new ClaseAutomovil("Nissan","Sentra", Color.VERDE, motorNissan);
        nissan.setTanque(new Tanque(60));
        nissan.setPropietario(chano);
        //nissan.setRuedas(ruedasNissan);
        Rueda[] ruedasNissan = new Rueda[5];
        for (int i = 0; i< ruedasNissan.length; i++){
            nissan.addRueda(new Rueda("Pirelli",14,11.5));
        }

        Persona lupis = new Persona("Guadalupe", "Sanchez");
        ClaseAutomovil nissan2 = new ClaseAutomovil("Nissan","Sentra", Color.VERDE, new Motor(4.0,TipoMotor.DIESEL));
        Rueda[] nuedasNissan2 = {
                new Rueda("Goodyear",14,11.5),
                new Rueda("Goodyear",14,11.5),
                new Rueda("Goodyear",14,11.5),
                new Rueda("Goodyear",14,11.5),
                new Rueda("Goodyear",14,11.5),
        };

        nissan2.setTanque(new Tanque(50));
        nissan2.setPropietario(lupis);

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

        for (Rueda rueda: gol.getRuedas()) {
            System.out.println(rueda.getFabricante() + " " + rueda.getAncho() + " " + rueda.getAro());
        }




    }
}