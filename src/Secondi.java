public class Secondi {

    private String nome,descrizione;
    private double prezzo;
    private String[] ingredienti;
    private String cottura;
    private String categoriaAlimentazione;

    public Secondi (String nomeDelPiatto,String descrizione,double costo,String[] ingredienti ,String cottura,String categoriaAlimentazione){
        this.nome = nomeDelPiatto;
        this.descrizione = descrizione;
        this.prezzo = costo;
        this.ingredienti = ingredienti;
        this.cottura = cottura;
        this.categoriaAlimentazione = categoriaAlimentazione;

    }

    public Secondi (String nomeDelPiatto,String descrizione,double costo,String[] ingredienti ,String cottura){
        this.nome = nomeDelPiatto;
        this.descrizione = descrizione;
        this.prezzo = costo;
        this.ingredienti = ingredienti;
        this.cottura = cottura;
        this.categoriaAlimentazione = "";

    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String[] getIngredienti() {return ingredienti;}

    private String StringIngredienti (){
        String output = "";
        for(int c = 0; c< ingredienti.length;c++){
            if(c != ingredienti.length-1)output += ingredienti[c] + " ,";
            else output += ingredienti[c] + ".\n";

        }
        return output;
    }

    public void setIngredienti(String[] ingredienti) {this.ingredienti = ingredienti;}

    public double getPrezzo() {return prezzo;}

    public void setPrezzo(double prezzo) {this.prezzo = prezzo;}

    public String getDescrizione() {return descrizione;}

    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}

    public String getCottura() {return cottura;}

    public void setCottura(String cottura) {this.cottura = cottura;}

    public String getCategoriaAlimentazione() {return categoriaAlimentazione;}

    public void setCategoriaAlimentazione(String categoriaAlimentazione) {this.categoriaAlimentazione = categoriaAlimentazione;}

    public void showInfoPlate (){
        if(categoriaAlimentazione.equals(null)){
            System.out.println(nome + ": " + descrizione + "\nIngredienti: " +"\n"+StringIngredienti()
                    +"Cottura: "+cottura+"\nPrezzo: " + prezzo + "€");
        } else{
            System.out.println(nome + ": " + descrizione + "\nIngredienti: " +"\n"+StringIngredienti()+
                    "Cottura: "+cottura+"\nAdatto ad una dieta: "+categoriaAlimentazione  +"\nPrezzo: " + prezzo + "€");
        }
    }

    @Override
    public String toString (){
        if(categoriaAlimentazione.equals("")) {
            return nome + ": " + descrizione + "\nIngredienti: " + "\n" + StringIngredienti() +
                    "Cottura: " + cottura + "\nAdatto ad una dieta: "+categoriaAlimentazione  +"\nPrezzo: " + prezzo + "€";
        }else{
            return nome + ": " + descrizione + "\nIngredienti: " + "\n" + StringIngredienti() +
                    "Cottura: " + cottura + "\nPrezzo: " + prezzo + "€";

        }
    }






}
