package it.mattiat;


import java.util.*;

public class Calendario {
    String nome, descrizione;
    static String[]eventi=new String[10];
    static Scanner calendarioObj = new Scanner(System.in);
    static int i=0;

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String[] getEventi() {
        return eventi;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setEventi(String[] eventi) {
        this.eventi = eventi;
    }

    public Calendario(String nome, String descrizione, String[] eventi) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.eventi = eventi;
    }

    public Calendario() {
    }
    public static void AddEvent() {
        System.out.println("Quanti eventi vuoi aggiungere?");
        int NVolte = calendarioObj.nextInt();
        int j = 0;
        if (NVolte > 0) {
            do {
                System.out.println("Inserisci nome");
                String nome = calendarioObj.next();
                eventi[j] = nome;
                j++;
                System.out.println("Inserisci descrizione");
                String descrizione = calendarioObj.next();
                eventi[j] = descrizione;
                j++;
                System.out.println("Inserisci giorno");
                int giorno = calendarioObj.nextInt();
                eventi[j] = String.valueOf(giorno);
                j++;
                System.out.println("Inserisci mese");
                int mese = calendarioObj.nextInt();
                eventi[j] = String.valueOf(mese);
                j++;
                System.out.println("Inserisci anno");
                int anno = calendarioObj.nextInt();
                eventi[j] = String.valueOf(anno);
                j++;
                System.out.println("Hai aggiunto: " + nome + " " + descrizione + " " + giorno + " " + mese + " " + anno);
                i++;
            }
            while (i < NVolte);
            DeleteEvent();
        }
    else{
        System.out.println("Addio");
        }
    }
    static void DeleteEvent() {
        System.out.println("Quale evento vuoi togliere?");
        int Risp = calendarioObj.nextInt();
        if (i > 0)
        {
            System.out.println("Eliminato");
            EventView();
        }
        else{
            EventView();
      }
    }
    static void EventView(){
        System.out.println("I dati salvati finora: "+ Arrays.toString(eventi));
    }
}
