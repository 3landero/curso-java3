public enum Color {
    ROJO("Rojo"),
    NEGRO("Negro"),
    BLANCO("Blanco"),
    AZUL("Azul"),
    GRIS("Gris"),
    VERDE("Verde");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
