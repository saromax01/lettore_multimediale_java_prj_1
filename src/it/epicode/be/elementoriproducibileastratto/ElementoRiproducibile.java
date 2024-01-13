package it.epicode.be.elementoriproducibileastratto;

import it.epicode.be.elementomultimedialeastratto.ElementoMultimediale;

public  abstract class ElementoRiproducibile extends ElementoMultimediale {
    protected int durata;
    protected  int volume;

    public ElementoRiproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

  public abstract void esegui();
}
