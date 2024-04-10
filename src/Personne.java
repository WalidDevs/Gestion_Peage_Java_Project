import java.time.LocalDate;


public class Personne {
    private static int id;
    private String Nom_Complet;
    private String Adresse;
    private String Adresse_mail;
    private LocalDate date_naissance;
    private int Numéro_Téléphone;
    private Role role;
    public Personne(String nom,String Adresse,String Adresse_mail,LocalDate date,int numero,String role){
        this.id++;
        this.Nom_Complet=nom;
        this.Adresse_mail=Adresse;
        this.date_naissance=date;
        this.Numéro_Téléphone=numero;
        this.role=new Role(role);
    }
    public Personne(Personne obj){
        this.id++;
        this.Nom_Complet=obj.Nom_Complet;
        this.Adresse_mail=obj.Adresse_mail;
        this.date_naissance=obj.date_naissance;
        this.Numéro_Téléphone=obj.Numéro_Téléphone;
        this.role=new Role(obj.role);
    }
    public String get_role(){
        return role.get_role();
    }
    public String get_nom() {
        return Nom_Complet;
    }

    public void set_nom(String nom_Complet) {
        this.Nom_Complet = nom_Complet;
    }


    public String get_adresse() {
        return Adresse;
    }

    public void set_adresse(String adresse) {
        this.Adresse = adresse;
    }


    public String get_adresse_mail() {
        return Adresse_mail;
    }

    public void set_adresse_mail(String adresse_mail) {
        this.Adresse_mail = adresse_mail;
    }


    public LocalDate get_Date() {
        return date_naissance;
    }

    public void set_Date(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }


    public int get_Numéro() {
        return Numéro_Téléphone;
    }

    public void set_Numéro(int numéro_Téléphone) {
        this.Numéro_Téléphone = numéro_Téléphone;
    }
    public void servir(){
        System.out.println("Bonjour veuillez choisir votre moyen de paiement");
    }
    public void lever_alarme(){
        System.out.println("je leve une alarme ");
    }

}
