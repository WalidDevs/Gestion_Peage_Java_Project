import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;



public class Main {
    public static int choix;
    public static int choix_paiement(String type_borne){
     if(type_borne=="manuelle" || type_borne=="automatique"){
            while(true){



        System.out.printf("\t --------------------------------\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t |\t 1.Carte Bancaire       \t|\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t |\t 2.Carte Abonnement     \t|\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t |\t 3.Paiement Par Monnaie \t|\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
        System.out.printf("\t -------------------------------\t\n");
        System.out.printf("\t \t\tchoix:\t\t");
        choix=in.nextInt();
        if(choix==1){
            System.out.println("vous avez choisit le Paiement par Carte Bancaire");break;
        }else if(choix==2){
            System.out.println("vous avez choisit le Paiement par Carte d'abonnement");break;
        }else if(choix==3){
            System.out.println("vous avez choisit le Paiement par Monnaie");break;
        } else{
            System.out.println("votre choix est érroné veuillez resaisir ");
        }
    }}else {
         while(true){



             System.out.printf("\t --------------------------------\n");
             System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             //System.out.printf("\t |\t 1.Carte Bancaire       \t|\n");
             //System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             //System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");

             //System.out.printf("\t |\t 2.Carte Abonnement     \t|\n");
             System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             System.out.printf("\t |\t 4.Paiement Par Badge \t\t|\n");
             System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             System.out.printf("\t | 5.Paiement Par Carte Gratuit |\n");
             System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
             System.out.printf("\t -------------------------------\t\n");
             System.out.printf("\t \t\tchoix:\t\t");
             choix=in.nextInt();
             if(choix==1){
                 System.out.println("vous avez choisit le Paiement par Par badge");break;
             }else if(choix==2){
                 System.out.println("vous avez choisit le Paiement par Carte d'abonnement");break;
             }else if(choix==3){
                 System.out.println("vous avez choisit le Paiement par Monnaie");break;
             }else if(choix==4){
                 System.out.println("vous avez choisit le Paiement Par badge ");break;
             } else if (choix==5){
                 System.out.println("vous avez choisit le paiement par Carte gratuit ");break;

             } else{
                 System.out.println("votre choix est érroné veuillez resaisir ");
             }
         }
     }
    return choix;
    }
    
    public static int choix_borne(){
        int choix_bornee;
        while(true){
            System.out.println("veuillez choisir le type de borne que vous voulez ");



            System.out.printf("\t --------------------------------\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t |\t 1.Borne Manuelle      \t\t|\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t |\t 2.Borne Télépeage     \t\t|\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t |\t 3.Borne Automatique \t\t|\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t |\t\t\t\t\t\t\t\t|\n");
            System.out.printf("\t -------------------------------\t\n");
            System.out.printf("\t \t\tchoix:\t\t");
            choix_bornee=in.nextInt();
            if(choix_bornee==1){
                System.out.println("vous avez choisit la Borne Manuelle");break;
            } else if (choix_bornee==2) {
                System.out.println("vous avez choisit la borne télépeage");break;
            } else if (choix_bornee==3) {
                System.out.println("vous avez choisit la borne Automatique");break;
                
            }else {
                System.out.println("choix invalide veuillez choisir une autre fois ");
            }

        }
        return choix_bornee;
    }


    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {

        Listes_des_Bornes.Liste_des_bornes(choix_borne(),"voiture","AAA-000-A1");
    }
}
