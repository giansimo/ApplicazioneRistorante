public class Dessert extends Portata {

    private Temperatura temperatura;

    public Dessert() {}

    public Dessert(String nome, String descrizione, double prezzo, String[] ingredienti, Temperatura temperatura) {
        super(nome, descrizione, prezzo, ingredienti);
        this.temperatura = temperatura;
    }

    @Override
    public String getTipologiaPortata() {
        return "DESSERT";
    }

    @Override
    protected String getAttributiNonComuni() {
        return "Temperatura: " + temperatura.getValore() + "\n";
    }

    @Override
    public String getColor() {
        return "\u001B[36m";
    }

}

