public enum TipologiaPortata {
    ANTIPASTI("ANTIPASTI"),
    PRIMI("PRIMI"),
    SECONDI("SECONDI"),
    DESSERT("DESSERT"),
    BEVANDE("BEVANDE");

    private String value;

    TipologiaPortata(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
