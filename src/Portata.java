import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "tipo")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Antipasti.class, name = "Antipasti"),
        @JsonSubTypes.Type(value = Bevande.class, name = "Bevande"),
        @JsonSubTypes.Type(value = Dessert.class, name = "Dessert"),
        @JsonSubTypes.Type(value = Primi.class, name = "Primi"),
        @JsonSubTypes.Type(value = Secondi.class, name = "Secondi")
})
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

    @JsonProperty("nome")
    protected String getNome() {
        return nome;
    }

    @JsonProperty("descrizione")
    protected String getDescrizione() {
        return descrizione;
    }

    @JsonProperty("prezzo")
    protected double getPrezzo() {
        return prezzo;
    }

    @JsonProperty("ingredienti")
    protected String[] getIngredientiArray() {
        return ingredienti;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
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

    @JsonIgnore
    public abstract TipologiaPortata getTipologiaPortata();

    // Funzione che restituisce il titolo della sezione del menù
    public String getTitleIfNewSection(Portata portataPrecedente) {
        if (this.getClass() != portataPrecedente.getClass()) {
            return "\n\n" + getTipologiaPortata().getValue() + " -----\n\n";
        }

        return "";
    }

    //Funzione che restituisce i dettagli di ciascuna portata non comuni alle altre portate.
    //La stringa restituita viene stampata nel toString
    @JsonIgnore
    protected abstract String getAttributiNonComuni();

    @JsonIgnore
    public abstract String getColor();

    @Override
    public String toString() {
        return getColor() + nome + ": " + descrizione + "\n\n" +
                getAttributiNonComuni() +
                "Ingredienti: " + getIngredienti() + "\n" +
                "Prezzo: " + String.format("%.2f", prezzo) + "€\u001B[0m";
    }


}
