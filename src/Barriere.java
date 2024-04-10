public class Barriere {
    private String type;
    private boolean état;
    public Barriere(String s){
        this.type=s;
        this.état=false;
    };
    public void ouvrir(){
        System.out.println("véhicule approche de la boucle"+this.type);
        this.état=true;
        System.out.println("Barriere "+this.type+ " ouvert");
    }
    public void fermer(){
        System.out.println("véhicule a passé la boucle"+this.type);
        this.état=false;
        System.out.println("je ferme la barriere"+this.type);
    }
}
