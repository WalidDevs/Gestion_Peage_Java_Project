import java.time.LocalDate;

public class Listes_des_Bornes {
    public static void Liste_des_bornes(int i,String type_véhicule,String Matricule ){
        if(i==1){
            Borne b=new Borne_Manuelle("manuelle","jean","amiens","walidelalami05@gmail.com", LocalDate.of(2002,11,01),6960,"guichetier ");
            Véhicule v=new Véhicule(type_véhicule,Matricule);
            b.Fonctionnement(v);
        } else if (i==2) {
            Borne b=new Borne_Telepeage("Télepeage","mbappé","amiens","walidelalami05@gmail.com", LocalDate.of(2002,11,01),6960,"superviseur ");
            Véhicule v=new Véhicule(type_véhicule,Matricule);
            b.Fonctionnement(v);
        }else if (i==3){
            Borne b=new Borne_Automatique("automatique","giroud","amiens","walidelalami05@gmail.com", LocalDate.of(2002,11,01),6960,"superviseur ");
            Véhicule v=new Véhicule(type_véhicule,Matricule);
            b.Fonctionnement(v);
        }else{
            System.out.println("choix invalide ");
        }





    }
}
