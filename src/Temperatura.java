public enum Temperatura {
    CALDO("Caldo"),
    FREDDO("Freddo"),
    TIEPIDO("Tiepido");

    private final String valore;

    Temperatura(String valore) {
        this.valore = valore;
    }

    public String getValore() {
        return this.valore;
    }
}
