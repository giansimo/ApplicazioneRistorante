public class Primi {

    //Attributi
    private String nomePiatto;
    private String descrizione;
    private int prezzo;
    private String[] ingredienti;
    private String tipoDiCottura;

    //Costruttore
    public Primi(String nomePiatto, String descrizione, int prezzo, String[] ingredienti, String tipoDiCottura){
        this.nomePiatto = nomePiatto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
        this.tipoDiCottura = tipoDiCottura;
    }

        // Setter and Getter

    public String getNomePiatto() {
        return nomePiatto;
    }

    public void setNomePiatto(String nomePiatto) {
        this.nomePiatto = nomePiatto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String[] getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String[] ingredienti) {
        this.ingredienti = ingredienti;
    }

    public String getTipoDiCottura() {
        return tipoDiCottura;
    }

    public void setTipoDiCottura(String tipoDiCottura) {
        this.tipoDiCottura = tipoDiCottura;
    }

    //Metodo Privato
    private String stringIngredienti(){
        String output = "";
        for(String e : ingredienti){
            output += e + " ,";
        }
        return output;
    }

    //Sovrascrizione di toString
    @Override
    public String toString(){
        return "Nome del piatto : "+ nomePiatto
                + "\n\nDescrizione del piatto : "+ descrizione
                + "\n\nIngredienti : "+ stringIngredienti()
                + "\n\nPrezzo del piatto : "+ prezzo + "$"
                + "\n\nTipo di cottura : "+ tipoDiCottura;
    }
}
