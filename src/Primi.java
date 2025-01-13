import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Primi extends Portata{

    //Attributi
    private String tipoDiCottura;

    @JsonCreator
    public Primi(
            @JsonProperty("nome") String nome,
            @JsonProperty("descrizione") String descrizione,
            @JsonProperty("prezzo") double prezzo,
            @JsonProperty("ingredienti") String[] ingredienti,
            @JsonProperty("tipoDiCottura") String tipoDiCottura){
        super(nome, descrizione, prezzo, ingredienti);
        this.tipoDiCottura = tipoDiCottura;
    }

    // Setter and Getter
    @JsonProperty("tipoDiCottura")
    public String getTipoDiCottura() {
        return tipoDiCottura;
    }

    public void setTipoDiCottura(String tipoDiCottura) {
        this.tipoDiCottura = tipoDiCottura;
    }

    @Override
    public TipologiaPortata getTipologiaPortata() {
        return TipologiaPortata.PRIMI;
    }

    @Override
    protected String getAttributiNonComuni() {
        return "Tipo di cottura: "+ tipoDiCottura+ "\n";
    }

    @Override
    public String getColor() {
        return "\u001B[33m";
    }

}

