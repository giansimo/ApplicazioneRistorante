//Questo enum serve per dare un ordine alle portate nel menu

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
