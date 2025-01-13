import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Secondi extends Portata{

    private String cottura;
    private String categoriaAlimentazione;

    @JsonCreator
    public Secondi (
            @JsonProperty("nome") String nome,
            @JsonProperty("descrizione") String descrizione,
            @JsonProperty("prezzo") double prezzo,
            @JsonProperty("ingredienti") String[] ingredienti,
            @JsonProperty("cottura") String cottura,
            @JsonProperty("categoriaAlimentazione") String categoriaAlimentazione){
        super(nome, descrizione,prezzo,ingredienti);
        this.cottura = cottura;
        this.categoriaAlimentazione = "Nessuna Categoria";

    }

    @JsonProperty("cottura")
    public String getCottura() {return cottura;}

    public void setCottura(String cottura) {this.cottura = cottura;}

    @JsonProperty("categoriaAlimentazione")
    public String getCategoriaAlimentazione() {return categoriaAlimentazione;}

    public void setCategoriaAlimentazione(String categoriaAlimentazione) {this.categoriaAlimentazione = categoriaAlimentazione;}


    @Override
    public TipologiaPortata getTipologiaPortata() {
        return TipologiaPortata.SECONDI;
    }

    @Override
    protected String getAttributiNonComuni() {
        return "Cottura: "+ cottura + "\n"+ "Categoria Alimentazione: "+ categoriaAlimentazione+ "\n";
    }

    @Override
    public String getColor() {
        return "\u001B[32m";
    }
}
