package it.epicode.be.elementomultimedialeastratto;

public  abstract class ElementoMultimediale {
    protected String Titolo;

    public ElementoMultimediale(String titolo) {
        this.Titolo = titolo;
    }

    public String getTitolo() {
        return Titolo;
    }


    public void metodoMostraDettagli() {
        System.out.println("Titolo"+ " " + Titolo);
    }
    public abstract  void  esegui();
}
