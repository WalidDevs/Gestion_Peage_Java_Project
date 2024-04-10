import java.time.LocalDate;
import java.util.Objects;

public class Borne_Telepeage extends Borne{
    private Personne pers;
    public Borne_Telepeage(String type_Borne,String nom,String Adresse,String Adresse_mail, LocalDate date,int numero,String role){
        super(type_Borne);
        this.pers=new Personne(nom,Adresse,Adresse_mail,date,numero,role);
    };
    public Borne_Telepeage(Borne_Telepeage obj ){
        super(obj.Type_borne);
    }

    public void Fonctionnement(Véhicule v ){
        boolean état_paiement=false;
         if(v.get_Type()!="voiture"){
            System.out.println(" vous n'avez pas le droit dans cette Borne type de véhicule  incompatible ");
            System.exit(0);
        }
        int ta=0;
        super.boucle_amont.détection_amont();
        System.out.println(v.get_Matricule());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        super.barriere_amont.ouvrir();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        super.barriere_amont.fermer();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        this.pers.servir();
        int chh=Main.choix_paiement(super.Type_borne);// choisir le mode de paiement
        if(v.get_Type()=="voiture" && chh==4 || chh==5){
            int rep=0;
            while(true){
                System.out.println("veuillez payer en utilisant votre Badge ou carte gratuit ");
                int tarif =Main.in.nextInt();
                if (tarif==1){ // 1 badge ou carte grauit  inseré , 0 badge ou carte gratuit non inséré
                    ta=tarif;
                    System.out.println("paiement accépté a bientot "); état_paiement=true;break;
                }else{
                    ++rep;
                    if (rep==3){
                        pers.lever_alarme();
                        super.alarme.turn_on();état_paiement=false;break;
                    }
                    System.out.println("veuillez inserer votre badge  , attention au bout de la troisiemme tentative je lance une alarme ");

                }

            }

        }
        if(état_paiement){
            super.barriere_avale.ouvrir();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            super.feu_vert.allumer_feu();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            super.boucle_avale.detection_avale();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            super.barriere_avale.fermer();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            super.feu_vert.éteindre_feu();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            super.feu_rouge.allumer_feu();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}

            Passage_Borne p=new Passage_Borne(LocalDate.now(),ta,this,v);
            p.stock_passage(chh);// on enreigstre les details du passage (paiement, date , heure , tarif , voiture ...)
        }




    };


}
