public class Primi extends Portata{

    //Attributi
    private String tipoDiCottura;

    //Costruttore
    public Primi(String nome, String descrizione, int prezzo, String[] ingredienti, String tipoDiCottura){
        super(nome, descrizione, prezzo, ingredienti);
        this.tipoDiCottura = tipoDiCottura;
    }

        // Setter and Getter
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

