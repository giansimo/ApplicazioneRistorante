public class Secondi {

    private String nome,descrizione;
    private double prezzo;
    private String[] ingredienti;
    private String cottura;
    private String categoriaAlimentazione;

    Secondi (String nomeDelPiatto,String descrizione,double costo,String[] ingredienti ,String cottura,String categoriaAlimentazione){
        this.nome = nomeDelPiatto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
        if(verificaCottura(cottura))this.cottura = cottura;
        if(verificaCategoriaAlimentazione(categoriaAlimentazione))this.categoriaAlimentazione = categoriaAlimentazione;
    }

    Secondi (String nomeDelPiatto,String descrizione,double costo,String[] ingredienti ,String cottura){
        this.nome = nomeDelPiatto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
        if(verificaCottura(cottura))this.cottura = cottura;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String[] getIngredienti() {return ingredienti;}
    private String StringIngredienti (){
        String output = "";
        for(String single : ingredienti){
            output += single + " ,\n";
        }
        return output;
    }

    public void setIngredienti(String[] ingredienti) {this.ingredienti = ingredienti;}

    public double getPrezzo() {return prezzo;}

    public void setPrezzo(double prezzo) {this.prezzo = prezzo;}

    public String getDescrizione() {return descrizione;}

    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}

    public String getCottura() {return cottura;}

    public void setCottura(String cottura) {if(verificaCottura(cottura))this.cottura = cottura;}

    public String getCategoriaAlimentazione() {return categoriaAlimentazione;}

    public void setCategoriaAlimentazione(String categoriaAlimentazione) {
        if(verificaCategoriaAlimentazione(categoriaAlimentazione))this.categoriaAlimentazione = categoriaAlimentazione;
    }

    public void showInfoPlate (){
        if(categoriaAlimentazione != null){
        System.out.println(nome + ": " + descrizione + "\nIngredienti: " +"\n"+StringIngredienti()+
                "Cottura: "+cottura+"\nAdatto ad una dieta: "+categoriaAlimentazione  +"\nPrezzo: " + prezzo + "€");
        } else{
            System.out.println(nome + ": " + descrizione + "\nIngredienti: " +"\n"+StringIngredienti()
                    +"Cottura: "+cottura+"\nPrezzo: " + prezzo + "€");
        }
    }

    @Override
    public String toString (){
        if(categoriaAlimentazione != null) {
            return nome + ": " + descrizione + "\nIngredienti: " + "\n" + StringIngredienti() +
                    "Cottura: " + cottura + "\nPrezzo: " + prezzo + "€";
        }else{
            return nome + ": " + descrizione + "\nIngredienti: " + "\n" + StringIngredienti() +
                    "Cottura: " + cottura + "\nAdatto ad una dieta: "+categoriaAlimentazione  +"\nPrezzo: " + prezzo + "€";
        }
    }

    private boolean verificaCottura (String tipoDiCottura){
        boolean output = false;
        if((tipoDiCottura == "Al Sangue")||(tipoDiCottura == "Media")||(tipoDiCottura == "Ben Cotta"))output = true;
        else{System.out.println("il tipo di cottura è stato inserito in formato errato");}
        return output;
    }

    private boolean verificaCategoriaAlimentazione (String alimentazione){
        boolean output = false;
        if((alimentazione == "Onnivora")||(alimentazione == "Vegana")||(alimentazione == "vegetariana"))output = true;
        else{System.out.println("il tipo di dieta inserito in formato errato o non conosciuta");}
        return output;
    }




}
