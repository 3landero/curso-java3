import java.util.Arrays;

public class AutomovilArreglos{
    public static void main(String[] args) {

        //----- Gol --------------------------------
        Persona conductorGol = new Persona("Luci", "Martinez");
        Motor motorGol = new Motor(1.6,TipoMotor.BENCINA);
        ClaseAutomovil gol = new ClaseAutomovil("VW", "Gol", Color.AZUL);

        gol.setFabricante("VW");
        gol.setModelo("Gol");
        gol.setMotor(motorGol);
        gol.setTipo(TipoAutomovil.SEDAN);
        gol.setTanque(new Tanque(50));
        gol.setPropietario(conductorGol);

        //------ Jetta --------------------------------
        Persona mouse = new Persona("Mickey", "Mouse");
        ClaseAutomovil jetta = new ClaseAutomovil("Volkswagen", "Jetta Clasico", Color.ROJO);
        jetta.setMotor(new Motor(2.5,TipoMotor.DIESEL));
        jetta.setTipo(TipoAutomovil.SEDAN);
        jetta.setTanque(new Tanque(70));
        jetta.setPropietario(mouse);


        //---- Suzuki --------------------------------
        Persona lupis = new Persona("Guadalupe", "Sanchez");
        ClaseAutomovil suzuki = new ClaseAutomovil("Suzuki","Vitara", Color.VERDE, new Motor(4.0,TipoMotor.DIESEL));

        suzuki.setTanque(new Tanque(50));
        suzuki.setPropietario(lupis);

        //----- Audi ----------------------------------
        ClaseAutomovil audi = new ClaseAutomovil("Audi","A3");
        audi.setPropietario(new Persona("Jenna", "Jameson"));
        audi.setTanque(new Tanque(56));

        ClaseAutomovil[] autos = new ClaseAutomovil[4];
        autos[0] = gol;
        autos[1] = jetta;
        autos[2] = suzuki;
        autos[3] = audi;

        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

    }
}