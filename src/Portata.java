public abstract class Portata {

    private String nome, descrizione;
    private double prezzo;
    private String[] ingredienti;

    public Portata() {}

    public Portata(String nome, String descrizione, double prezzo, String[] ingredienti) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

    public abstract TipologiaPortata getTipologiaPortata();

    // Funzione che restituisce il titolo della sezione del menù
    public String getTitleIfNewSection(Portata portataPrecedente) {
        if (this.getClass() != portataPrecedente.getClass()) {
            return "\n\n" + getTipologiaPortata().getValue() + " -----\n\n";
        }

        return "";
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getDescrizione() {
        return descrizione;
    }

    protected void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    protected double getPrezzo() {
        return prezzo;
    }

    protected void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    protected String getIngredienti() {
        String list = "";
        for (int i = 0; i < ingredienti.length - 1; i++) {
            list += ingredienti[i] + ", ";
        }
        list += ingredienti[ingredienti.length - 1] + ".";
        return list;
    }

    protected void setIngredienti(String[] ingredienti) {
        this.ingredienti = ingredienti;
    }

    //Funzione che restituisce i dettagli di ciascuna portata non comuni alle altre portate.
    //La stringa restituita viene stampata nel toString
    protected abstract String getAttributiNonComuni();

    @Override
    public String toString() {
        return getColor() + nome + ": " + descrizione + "\n\n" +
                getAttributiNonComuni() +
                "Ingredienti: " + getIngredienti() + "\n" +
                "Prezzo: " + String.format("%.2f", prezzo) + "€\u001B[0m";
    }

    public abstract String getColor();


}
