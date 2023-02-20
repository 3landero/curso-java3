import java.util.Arrays;

class ClaseAutomovil implements Comparable<ClaseAutomovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Tanque tanque;
    private Persona propietario;
    private Rueda[] ruedas=new Rueda[5];

    private int indiceRuedas;
    private TipoAutomovil tipo;

    private static Color colorPatente = Color.VERDE;

    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAXIMA_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    public ClaseAutomovil()
    {
        this.id = ++ultimoId;
        //this.ruedas= new Rueda[5];
    }

    public ClaseAutomovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public ClaseAutomovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    ;

    public ClaseAutomovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public ClaseAutomovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public ClaseAutomovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona propietario, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.propietario = propietario;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        ClaseAutomovil.colorPatente = colorPatente;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {

        if (tanque == null) {
            this.tanque = new Tanque();
        }

        return tanque;

    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }


    public ClaseAutomovil addRueda(Rueda unaRueda) {
        /* este metodo me parecioel mas interesante
        pues para que funcione debe tener inicializado el array
        de this. ruedas, mas alla de haber sido declarado
        ademas si queremos iniciarlo dentro de este metodo o desde la creacion de la variable o en el contructor, tambien se puede
        si queremos que el metodo se pueda encadenar podemos como en este caso hacerlo un metodo que retorne una misma instancia de la clase*/

        if (indiceRuedas < ruedas.length){
            ruedas[indiceRuedas++] = unaRueda;
        }
        return this;
    }

    public String detalles() {

        String detalle = "auto.id =" + this.id +
                "\nfabricante = " + this.getFabricante() +
                "\nauto = " + this.getModelo();

        if (this.getTipo() != null) {
            detalle += "\ntipo =" + this.getTipo().getNombre();
        }

        detalle += "\ncolor = " + this.getColor() +
                "\ncolorPatente =" + colorPatente.getColor() +
                "\nmotor = " + this.motor.getCilindrada();

        return detalle;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.modelo + " esta acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarYFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar();
    }

    public float calculaConsumo(int km, float porcentajeGas) {
        return km / (this.tanque.getCapacidad() * porcentajeGas);
    }

    public float calculaConsumo(int km, int porcentajeGas) {
        return km / (this.tanque.getCapacidad() * (porcentajeGas / 100));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ClaseAutomovil)) {
            return false;
        }

        ClaseAutomovil a = (ClaseAutomovil) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return  id + ": " + fabricante + ' ' +" " + modelo ;
    }


    @Override
    public int compareTo(ClaseAutomovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}



