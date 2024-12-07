public enum TipologiaPortata {
    BEVANDE("Bevade"),
    ANTIPASTI("Antipasti"),
    PRIMI("Primi"),
    SECONDI("Secondi"),
    DESSERT("Dessert");

    private String tipologia;

    TipologiaPortata(String portata) {
        this.tipologia = portata;
    }

    public String getTipologia() {
        return tipologia;
    }
}
