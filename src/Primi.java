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
    protected String elementiNonComuni() {
        return "Tipo di cottura: "+ tipoDiCottura+ "\n";
    }
}

