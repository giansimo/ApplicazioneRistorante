public class Antipasti extends Portata{
    private boolean isVegano;

    public Antipasti() {}

    public Antipasti(String nome, String descrizione, double prezzo, String[] ingredienti, boolean isVegano) {
        super(TipologiaPortata.ANTIPASTI, nome, descrizione, prezzo, ingredienti);
        this.isVegano = isVegano;
    }

    public boolean isVegano() {
        return isVegano;
    }

    public void setVegano(boolean vegano) {
        isVegano = vegano;
    }

    @Override
    protected String elementiNonComuni() {
        return "Vegano: " + ((isVegano) ? "Si" : "No") + ".\n";
    }
}

