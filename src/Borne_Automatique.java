import java.time.LocalDate;

public class Borne_Automatique extends Borne{
    private Personne pers;
    public Borne_Automatique(String type_Borne, String nom, String Adresse, String Adresse_mail, LocalDate date, int numero, String role){
        super(type_Borne);

        this.pers=new Personne(nom,Adresse,Adresse_mail,date,numero,role);
    };
    public Borne_Automatique(Borne_Automatique obj ){
        super(obj.Type_borne);
        this.pers=new Personne(obj.pers.get_nom(),obj.pers.get_adresse(), obj.pers.get_adresse_mail(),obj.pers.get_Date(),obj.pers.get_Numéro(),obj.pers.get_role());
    }

    public void Fonctionnement(Véhicule v){
        boolean état_paiement=false;
        if(v.get_Type()!="voiture"){
            System.out.println(" vous n'avez pas le droit dans cette Borne type de véhicule  incompatible ");
            System.exit(0);
        }
        int ta=0;
        super.boucle_amont.détection_amont();
        System.out.println(v.get_Matricule());
        System.out.println("type de véhicule: "+v.get_Type());
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
        if(v.get_Type()=="voiture"){
            int rep=0;
            while(true){
                System.out.println("veuillez payer le tarif des voiture : 30 Euro");
                int tarif =Main.in.nextInt();
                if (tarif==30){
                    ta=tarif;
                    System.out.println("paiement accépté a bientot "); état_paiement=true;break;
                }else{
                    rep++;
                    if (rep==3){
                        pers.lever_alarme();
                        super.alarme.turn_on();état_paiement=false;break;
                    }
                    System.out.println("veuillez payer le montant exact ou Veuillez insérer une pièce de monnaie valide., attention au bout de la troisiemme tentative je lance une alarme ");

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

            Passage_Borne  x=new Passage_Borne(LocalDate.now(),ta,this,v);
            x.stock_passage(chh);// on enreigstre les details du passage (paiement, date , heure , tarif , voiture ...)
        }



    };

}
