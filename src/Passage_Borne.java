import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.time.LocalDate;

public class Passage_Borne {
    private LocalDate date_passage;
    private int Tarif;
    private Borne_Manuelle borne1;
    private Véhicule véhicule;
    private Borne_Automatique borne2;
    private Borne_Telepeage borne3;
    public Passage_Borne(LocalDate date_passage, int Tarif, Borne_Manuelle obj, Véhicule véhicule ){
        this.date_passage=date_passage;
        this.Tarif=Tarif;
        this.borne1=new Borne_Manuelle(obj);
        this.véhicule=new Véhicule(véhicule);

    }
    public Passage_Borne(LocalDate date_passage, int Tarif, Borne_Automatique obj, Véhicule véhicule){
        this.date_passage=date_passage;
        this.Tarif=Tarif;
        this.borne2=new Borne_Automatique(obj);
        this.véhicule=new Véhicule(véhicule);
    }
    public Passage_Borne(LocalDate date_passage, int Tarif, Borne_Telepeage obj, Véhicule véhicule){
        this.date_passage=date_passage;
        this.Tarif=Tarif;
        this.borne3=new Borne_Telepeage(obj);
        this.véhicule=new Véhicule(véhicule);

    }



    public void stock_passage(int i ){

        if(i==1){
            System.out.println("passage stocker, Le Mode de Paiement : Carte Bancaire , et Montant:"+this.Tarif+  "je l'envoie ce soir au superviseur ");
        } else if (i==2) {
            System.out.println("passage stocker, Le Mode de Paiement : Carte Abonnement, et Montant:"+this.Tarif+  "je l'envoie ce soir au superviseur ");
        } else if (i==3) {
            System.out.println("passage stocker, Le Mode de Paiement : Par Monnaie , et Montant:"+this.Tarif+  "je l'envoie ce soir au superviseur ");
        } else if(i==4){
            System.out.println("passage stocker, Le Mode de Paiement : Badge,  je l'envoie ce soir au superviseur ");
        } else if (i==5) {
            System.out.println("passage stocker, Le Mode de Paiement : Carte Gratuit, je l'envoie ce soir au superviseur ");
        }
    }


}
