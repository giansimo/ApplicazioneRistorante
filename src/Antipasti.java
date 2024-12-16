public class Antipasti extends Portata{
    private boolean isVegano;

    public Antipasti() {}

    public Antipasti(String nome, String descrizione, double prezzo, String[] ingredienti, boolean isVegano) {
        super(nome, descrizione, prezzo, ingredienti);
        this.isVegano = isVegano;
    }

    public boolean isVegano() {
        return isVegano;
    }

    public void setVegano(boolean vegano) {
        isVegano = vegano;
    }

    @Override
    public String getTipologiaPortata() {
        return "ANTIPASTI";
    }

    @Override
    protected String getAttributiNonComuni() {
        return "Vegano: " + ((isVegano) ? "Si" : "No") + ".\n";
    }

    @Override
    public String getColor() {
        return "\u001B[31m";
    }

}

