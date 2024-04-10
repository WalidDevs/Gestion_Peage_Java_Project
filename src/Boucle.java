public class Boucle {
    private String Type;
    private boolean état;

    public Boucle(String Type){
        this.Type=Type;
        this.état=false;
    }
    public void détection_amont(){
        this.état=true;
        System.out.println("véhicule approche je detecte le matricule ");
    }
    public void detection_avale(){
        this.état=false;
        System.out.println("véhicule a traversé la boucle avale fermer la barriere  ");
    }

}
