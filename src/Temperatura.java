public enum Temperatura {
    CALDO("Caldo"),
    FREDDO("Freddo");

    private final String valore;

    Temperatura(String valore) {
        this.valore = valore;
    }

    public String getValore() {
        return this.valore;
    }
}
