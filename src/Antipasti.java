public class Antipasti {
    private String nome, descrizione;
    private double prezzo;
    private String[] ingredienti;

    public Antipasti() {}

    public Antipasti(String nome, String descrizione, double prezzo, String[] ingredienti) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String[] getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String[] ingredienti) {
        this.ingredienti = ingredienti;
    }

    // Funzione che restituisce una stringa contenente l'elenco degli ingredienti dell'istanza
    private String elencoIngredienti() {
        if (ingredienti == null || ingredienti.length == 0) {
            return "Nessun ingrediente specificato";
        }
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < ingredienti.length - 1; i++) {
            list.append(ingredienti[i]).append(", ");
        }
        list.append(ingredienti[ingredienti.length - 1]);
        return list.toString();
    }

    @Override
    public String toString() {
        return nome + ": " + descrizione + "\n" +
                "\nIngredienti: " + elencoIngredienti() + ".\n" +
                "\nPrezzo: " + prezzo + "€";
    }
}

