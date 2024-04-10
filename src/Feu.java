public class Feu {
    private String Type;
    private boolean état;

    public Feu(String type){
        this.Type=type;
        this.état=false;
    }
    public boolean allumer_feu(){
        this.état=true;
        System.out.println("feu "+this.Type+" allumer");
        return this.état;
    }
    public boolean éteindre_feu(){
        this.état=false;
        System.out.println("feu "+this.Type+" éteint");
        return this.état;
    }
}
