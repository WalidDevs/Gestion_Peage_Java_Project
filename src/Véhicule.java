public class Véhicule {
    private String type;
    private  String matricule;
    public Véhicule(String type,String matricule){
        this.type=type;
        this.matricule=matricule;
    }
    public Véhicule(Véhicule obj){
        this.type=obj.type;
        this.matricule= obj.matricule;

    }
    public String get_Type() {
        return type;
    }

    public void set_Type(String type) {
        this.type = type;
    }


    public String get_Matricule() {
        return matricule;
    }

    public void set_Matricule(String matricule) {
        this.matricule = matricule;
    }

}
