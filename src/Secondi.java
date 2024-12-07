public class Secondi extends Portata{

    private String cottura;
    private String categoriaAlimentazione;

    public Secondi (String nome,String descrizione,double prezzo,String[] ingredienti ,String cottura,String categoriaAlimentazione){
        super(TipologiaPortata.SECONDI, nome, descrizione, prezzo, ingredienti);
        this.cottura = cottura;
        this.categoriaAlimentazione = categoriaAlimentazione;

    }

    public Secondi (String nome,String descrizione,double prezzo,String[] ingredienti ,String cottura){
        super(TipologiaPortata.SECONDI, nome, descrizione,prezzo,ingredienti);
        this.cottura = cottura;
        this.categoriaAlimentazione = "Nessuna Categoria";

    }

    public String getCottura() {return cottura;}

    public void setCottura(String cottura) {this.cottura = cottura;}

    public String getCategoriaAlimentazione() {return categoriaAlimentazione;}

    public void setCategoriaAlimentazione(String categoriaAlimentazione) {this.categoriaAlimentazione = categoriaAlimentazione;}


    @Override
    protected String elementiNonComuni() {
        return "Cottura: "+ cottura + "\n"+ "Categoria Alimentazione: "+ categoriaAlimentazione+ "\n";
    }
}
