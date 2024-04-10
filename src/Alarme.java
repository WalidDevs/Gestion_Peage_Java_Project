public class Alarme {
    private boolean état;
    public Alarme(){
        this.état=false;
    }
    public boolean turn_on(){
        this.état=true;
        System.out.println("alarme lever veuillez attendre un superviseur pour vous aider ");
        return this.état;
    }
    public boolean turn_off(){
        this.état=false;
        return this.état;
    }
}
