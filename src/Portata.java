public abstract class Portata {

    private TipologiaPortata tipologiaPortata;
    private String nome, descrizione;
    private double prezzo;
    private String[] ingredienti;

    public Portata() {}

    public Portata(TipologiaPortata tipologiaPortata, String nome, String descrizione, double prezzo, String[] ingredienti) {
        this.tipologiaPortata = tipologiaPortata;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

    public TipologiaPortata getTipologiaPortata() {
        return tipologiaPortata;
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

    protected String[] getIngredienti() {
        return ingredienti;
    }

    protected void setIngredienti(String[] ingredienti) {
        this.ingredienti = ingredienti;
    }

    //Funzione che restituisce una stringa contenente l'elenco degli ingredienti dell'istanza
    private String elencoIngredienti() {
        String list = "";
        for (int i = 0; i < ingredienti.length - 1; i++) {
            list += ingredienti[i] + ", ";
        }
        list += ingredienti[ingredienti.length - 1] + ".";
        return list;
    }

    //Funzione che restituisce i dettagli di ciascuna portata non comuni alle altre portate.
    //La stringa restituita viene stampata nel toString
    protected abstract String elementiNonComuni();

    @Override
    public String toString() {
        return nome + ": " + descrizione + "\n\n" +
                elementiNonComuni() +
                "Ingredienti: " + elencoIngredienti() + "\n" +
                "Prezzo: " + String.format("%.2f", prezzo) + "€";
    }
}
