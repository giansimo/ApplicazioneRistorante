import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Antipasti extends Portata {
    private boolean isVegano;

    public Antipasti() {}

    @JsonCreator
    public Antipasti(
            @JsonProperty("nome") String nome,
            @JsonProperty("descrizione") String descrizione,
            @JsonProperty("prezzo") double prezzo,
            @JsonProperty("ingredienti") String[] ingredienti,
            @JsonProperty("isVegano") boolean isVegano) {
        super(nome, descrizione, prezzo, ingredienti);
        this.isVegano = isVegano;
    }

    @JsonProperty("isVegano")
    public boolean isVegano() {
        return isVegano;
    }

    public void setVegano(boolean vegano) {
        isVegano = vegano;
    }

    @Override
    public TipologiaPortata getTipologiaPortata() {
        return TipologiaPortata.ANTIPASTI;
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

