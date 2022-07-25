package nuova.cartella;

public class Calciatore {
    private String nome;
    private String cognome;
    private int eta;
    private String ruolo;
    private int presenze;
    private int gol;
    private Squadra squadra;              ////////

    Calciatore(String n,String c,int e,String r){
        nome=n;
        cognome=c;
        eta=e;
        ruolo=r;
    }
    public void setPresenze(int p){
        this.presenze=p;
    }
    public void setGol(int g){
        this.gol=g;
    }
    public void setSquadra(String name_team,String name_stadium){
        this.squadra=new Squadra(name_team,name_stadium);
    }

    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public int getEta(){
        return this.eta;
    }
    public String getRuolo(){
        return this.ruolo;
    }
    public int getPresenze(){
        return this.presenze;
    }
    public int getGol(){
       return this.gol;
    }
    public String getSquadra(){          ////////
        return this.squadra.getNomeSquadra();
    }

    public void bioCalciatore(){
        System.out.println("\n"+"Biografia di "+ nome+" "+cognome);
        System.out.println("Nome: "+nome);
        System.out.println("Cognome: "+cognome);
        System.out.println("Eta': "+eta);
        System.out.println("Ruolo: "+ruolo);
        System.out.println("Presenze: "+presenze);
        System.out.println("Gol: "+gol);
        System.out.println("Squadra attuale: "+squadra.getNomeSquadra());
    }
}