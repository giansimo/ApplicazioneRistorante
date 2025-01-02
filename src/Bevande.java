import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Bevande extends Portata{

    private Temperatura temperatura;
    private boolean alcolico;

    @JsonCreator
    public Bevande(@JsonProperty("nome") String nome,
                   @JsonProperty("descrizione") String descrizione,
                   @JsonProperty("prezzo") double prezzo,
                   @JsonProperty("ingredienti") String[] ingredienti,
                   @JsonProperty("temperatura") Temperatura temperatura,
                   @JsonProperty("alcolica") boolean alcolico){
        super(nome,descrizione,prezzo,ingredienti);
        this.temperatura = temperatura;
        this.alcolico = alcolico;
    }

    public boolean isAlcolico() {
        return alcolico;
    }

    public void setAlcolico(boolean alcolico) {
        this.alcolico = alcolico;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public TipologiaPortata getTipologiaPortata() {
        return TipologiaPortata.BEVANDE;
    }

    @Override
    protected String getAttributiNonComuni() {
        return "Temperatura: " + temperatura.getValore() + "\nAlcolico: " + (alcolico ? "alcolico": "non alcolico") + "\n";
    }

    @Override
    public String getColor() {
        return "\u001B[35m";
    }


}

