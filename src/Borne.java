public  abstract class Borne {
    protected  static int id_borne=0;
    protected String Type_borne;

    protected Alarme alarme;
    protected Feu feu_rouge;
    protected Feu feu_vert;
    protected Boucle boucle_amont;
    protected  Boucle boucle_avale;
    protected Barriere barriere_amont;

    protected Barriere barriere_avale;
    public Borne(String type){
        this.id_borne++;
        this.Type_borne=type;
        alarme=new Alarme();
        feu_rouge=new Feu("rouge");
        feu_vert=new Feu("vert");
        boucle_amont=new Boucle("amont");
        boucle_avale=new Boucle("avale");
        barriere_amont=new Barriere("amont");
        barriere_avale=new Barriere("avale");
    }
    public Borne(Borne obj ){
        this.id_borne++;
        this.Type_borne=obj.Type_borne;
        alarme=new Alarme();
        feu_rouge=new Feu("rouge");
        feu_vert=new Feu("vert");
        boucle_amont=new Boucle("amont");
        boucle_avale=new Boucle("avale");
    }

    public abstract void  Fonctionnement(Véhicule vehicule);
}
