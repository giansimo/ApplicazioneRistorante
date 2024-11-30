public class Dessert extends Portata {

    private Temperatura temperatura;

    public Dessert() {}

    public Dessert(String nome, String descrizione, double prezzo, String[] ingredienti, Temperatura temperatura) {
        super(nome, descrizione, prezzo, ingredienti);
        this.temperatura = temperatura;
    }

    @Override
    protected String elementiNonComuni() {
        return "Temperatura: " + temperatura.getValore() + "\n";
    }
}

