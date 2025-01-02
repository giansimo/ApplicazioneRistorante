import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Dessert extends Portata {

    private Temperatura temperatura;

    public Dessert() {}

    @JsonCreator
    public Dessert(
            @JsonProperty("nome") String nome,
            @JsonProperty("descrizione") String descrizione,
            @JsonProperty("prezzo") double prezzo,
            @JsonProperty("ingredienti") String[] ingredienti,
            @JsonProperty("temperatura") Temperatura temperatura) {
        super(nome, descrizione, prezzo, ingredienti);
        this.temperatura = temperatura;
    }

    @Override
    public TipologiaPortata getTipologiaPortata() {
        return TipologiaPortata.DESSERT;
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

