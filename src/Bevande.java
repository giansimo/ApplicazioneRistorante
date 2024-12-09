public class Bevande extends Portata{

    private Temperatura temperatura;
    private boolean alcolico;

    public Bevande(String nome,String descrzione,double prezzo,String[]ingredienti,Temperatura temperatura, boolean alcolico){
        super(TipologiaPortata.BEVANDE,nome,descrzione,prezzo,ingredienti);
        this.temperatura = temperatura;
        this.alcolico    = alcolico;
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
    protected String elementiNonComuni() {
        return "Temperatura: " + temperatura.getValore() + "\nAlcolico: " + (alcolico ? "alcolico": "non alcolico") + "\n";
    }
}

