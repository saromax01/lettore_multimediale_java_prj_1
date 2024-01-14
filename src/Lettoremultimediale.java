import it.epicode.be.classiconcrete.Audio;
import it.epicode.be.classiconcrete.Immagine;
import it.epicode.be.classiconcrete.Video;
import it.epicode.be.elementomultimedialeastratto.ElementoMultimediale;
import it.epicode.be.enterface.RegolazioneLuminosa;
import it.epicode.be.enterface.RegolazioneVolume;

import java.util.Scanner;

public class Lettoremultimediale {
    public static void main(String[] args) {

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("inserisci il tipo di elemento: (1 Immagine, 2 Audio , 3 Video  )");
            Scanner scanner = new Scanner(System.in);
            int SceltaTipo = scanner.nextInt();


            System.out.println(" scegli il Titolo:");
            String titolo = scanner.next();
            switch (SceltaTipo) {
                case 1 :
                    System.out.println("inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Immagine( titolo,  luminosita);
                    break;
                case 2 :
                    System.out.println("inserisci la durata:");
                    int durata = scanner.nextInt();
                    System.out.println("inserisci il volume:");
                    int volume = scanner.nextInt();
                    elementi[i] = new Audio(titolo, durata, volume);
                    break;
                case 3 :
                    System.out.println("inserisci la luminosità");
                    int luminositaVideo = scanner.nextInt();
                    System.out.println("inserisci la durata");
                    int durataVideo = scanner.nextInt();
                    System.out.println("inserisci il volume");
                    int volumeVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo,durataVideo,volumeVideo,luminositaVideo);
                    break;
                default:
                    System.out.println("scegli tra uno degli elementi disponibili!");
                    i --;
                    break;
            }
            while (true) {
                System.out.println("Inserisci il numero dell'elemento da eseguire (1-5) o 0 per terminare: ");
                Scanner scanner2 = new Scanner(System.in);
                int sceltaEsecuzione = scanner2.nextInt();
                if (sceltaEsecuzione == 0) {
                    System.out.println("sessione terminata3");
                    break;
                }
                if (sceltaEsecuzione >= 1 && sceltaEsecuzione <= 5 ) {
                    ElementoMultimediale elementoScelto = elementi[sceltaEsecuzione -1];
                    System.out.println("Elemento in Esecuzione...1");
                    eseguiElemento(elementoScelto);

                    if (elementoScelto instanceof RegolazioneLuminosa) {
                        System.out.println("Vuoi cambiare la Luminosità? ( 1 alza, 2 abbassa, 3 avanti)");
                        int sceltaLumos = scanner2.nextInt();
                        if (sceltaLumos == 1) {
                            ((RegolazioneLuminosa) elementoScelto).alzaLuminosita();
                        } else if (sceltaLumos == 2) {
                            ((RegolazioneLuminosa) elementoScelto).abbassaLuminosita();
                        } else if (sceltaLumos == 3) {
                            System.out.println(" avanti...");
                        }
                        else {
                            System.out.println("scelta non valida!");
                        }
                }
                    if (elementoScelto instanceof RegolazioneVolume) {
                        System.out.println("Vuoi abbassare o alzare il volume? (1 alza, 2 abbassa, 3 avanti) ");
                        int sceltaVolume = scanner2.nextInt();
                        if (sceltaVolume == 1) {
                            ((RegolazioneVolume) elementoScelto).alzaVolume();
                            System.out.println("elemento modificato con successo!, eseguilo per vederne le modifiche applicate.");
                        }
                        else if (sceltaVolume == 2) {
                            ((RegolazioneVolume) elementoScelto).abbassaVolume();
                            System.out.println("elemento modificato con successo!, eseguilo per vederne le modifiche applicate.");
                        } else if (sceltaVolume == 3) {
                            System.out.println("avanti...");
                            System.out.println("elemento modificato con successo!, eseguilo per vederne le modifiche applicate.");
                        }
                        else {
                            System.out.println("scelta non valida!");
                        }
                    }
                    else {
                        System.out.println("numero non valido, si prega di riprovare.");
                    }

                }

            }

        }

    }
    private static void eseguiElemento(ElementoMultimediale elemento) {
        elemento.esegui();
    }

}
