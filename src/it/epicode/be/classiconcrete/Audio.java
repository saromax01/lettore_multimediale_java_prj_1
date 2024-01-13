package it.epicode.be.classiconcrete;

import it.epicode.be.elementoriproducibileastratto.ElementoRiproducibile;
import it.epicode.be.enterface.RegolazioneVolume;

public class Audio extends ElementoRiproducibile implements RegolazioneVolume {
    private int volume;


    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
        this.volume = volume;
    }

    @Override
    public void esegui() {
        play();
    }
    public void play() {
        System.out.println("riproduzione in corso:"+ " "+ getTitolo()+ "- Durata"+" "+ durata + " " + "minuti");
        // Ripete la stampa del titolo concatenato a una sequenza di punti esclamativi di lunghezza pari al volume
        for(int i = 0; i < durata; i++) {
            for(int j = 0; j < volume; j++) {
                System.out.println("!");
            }
            System.out.println();
        }

    }

    @Override
    public int alzaVolume() {

        return volume ++;
    }

    @Override
    public int abbassaVolume() {
        if (volume > 0) {
            --volume;
        }
        return volume;
    }

}
