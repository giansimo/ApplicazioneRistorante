public class Primi {

    //Attributi
    private String nomePiatto;
    private String descrizione;
    private String[] ingredienti;
    private int prezzo;
    private int tipoDiCottura;

    //Costruttore
    public Primi(String nomePiatto, String descrizione, String[] ingredienti, int prezzo, int tipoDiCottura){
        this.nomePiatto = nomePiatto;
        this.descrizione = descrizione;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
        this.tipoDiCottura = tipoDiCottura;
    }

        // Setter and Getter
    public String getNomePiatto() {return nomePiatto;}

    public void setNomePiatto(String nomePiatto) {this.nomePiatto = nomePiatto;}

    public String getDescrizione() {return descrizione;}

    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}

    public String[] getIngredienti() {return ingredienti;}

    public void setIngredienti(String[] ingredienti) {this.ingredienti = ingredienti;}

    public int getPrezzo() {return prezzo;}

    public void setPrezzo(int prezzo) {this.prezzo = prezzo;}

    public int getTipoDiCottura() {return tipoDiCottura;}

    public void setTipoDiCottura(int tipoDiCottura) {this.tipoDiCottura = tipoDiCottura;}

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
        return "Nome del piatto "+ nomePiatto
                + "\nDescrizione del piatto "+ descrizione
                + "\nIngredienti "+ stringIngredienti()
                + "\nPrezzo del piatto "+ prezzo
                + "\nTipo di cottura "+ tipoDiCottura;
    }
}
