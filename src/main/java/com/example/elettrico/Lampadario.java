package com.example.elettrico;

public class Lampadario {


    private Lampadina[] lampadine;

    private Lampadina lampadina;


    public final boolean SPENTA = true;
    public final boolean ACCESSA = false;

    private int numeroLampadine;


    /*
    metodo creato dal prof
     */
    private boolean isPosizioneOccupata(int index) {

        return lampadine[index] != null;
    }

    public Lampadario() {
        this.lampadine = new Lampadina[4];

    }

    public void accendere() {
        //ciclo per accedere e spegnere
        if (SPENTA) {


            for (Lampadina lampadina : lampadine) {
                lampadina.accensione();

            }

        }

    }

    /*
 metodo creato dal prof
  */
    public void spegnere() {
        if (ACCESSA) {

            for (Lampadina lampadina : lampadine) {

                if (lampadina != null) {
                    lampadina.spegnimento();
                }

            }

        }

    }

    /*
  metodo creato dal prof
   */
    public void accendere1() {
        for (Lampadina lampadina1 : lampadine) {
            //se lampadina1 è diverso da null...
            if (lampadina1 != null) {
                //accendi la lampadina

                lampadina.accensione();
            }
        }
    }



      /*
    metodo creato dal prof
     */

    public void spegnere1() {
        for (Lampadina lampadina1 : lampadine) {
            if (lampadina1 != null) {

                lampadina.spegnimento();
            }
        }
    }

    /*
    metodo creato dal prof
    per aggiungere una lampadina abbiamo bisogno
      prima di tutto della lampadina in sè e
      poi della sua posizione!!!
     */
    public void aggiungere(Lampadina lampadina, int index) {

        System.out.println(String.format("\n aggiunta lampadina alla posizione %d", index));
        if (!isPosizioneOccupata(index)) {

            lampadine[index] = lampadina;
        }
    }


    /*
    metodo creato dal prof,
     per togliere una lampadina abbiamo bisogno
      prima di tutto della lampadina in sè e
      poi della sua posizione!!!
     */
    public Lampadina togliere(Lampadina lampadina, int index) {


        Lampadina l = null;
        if (isPosizioneOccupata(index)) {
            l = lampadine[index];
            lampadine[index] = null;
        }

        return l;
    }

    public void add(Lampadina lampadina1) {

        numeroLampadine++;
        if (numeroLampadine > 4) {

            System.out.println("Ci sono già quattro lampadine!");
        }
        lampadine = new Lampadina[]{lampadina1};


    }


    public void remove(Lampadina lampadina1) {

        for (int i = 0; i < lampadine.length; i++) {
            numeroLampadine--;


        }

        System.out.println(String.format("Numero lampadine: %d", numeroLampadine));


    }


}
