public class Secondi extends Portata{

    private String cottura;
    private String categoriaAlimentazione;

    public Secondi (String nome,String descrizione,double prezzo,String[] ingredienti ,String cottura,String categoriaAlimentazione){
        super(nome, descrizione, prezzo, ingredienti);
        this.cottura = cottura;
        this.categoriaAlimentazione = categoriaAlimentazione;

    }

    public Secondi (String nome,String descrizione,double prezzo,String[] ingredienti ,String cottura){
        super(nome, descrizione,prezzo,ingredienti);
        this.cottura = cottura;
        this.categoriaAlimentazione = "Nessuna Categoria";

    }

    public String getCottura() {return cottura;}

    public void setCottura(String cottura) {this.cottura = cottura;}

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
