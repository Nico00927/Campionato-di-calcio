package nuova.cartella;

public class Calciatore {
    private String nome;
    private int eta;
    private String ruolo;
    private int presenze;
    private int gol;
    private Squadra squadra;              ////////

    Calciatore(String n,int e,String r){
        nome=n;
        eta=e;
        ruolo=r;
    }
    public String getNome(){
        return this.nome;
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
    public void setPresenze(int p){
        this.presenze=p;
    }
    public void setGol(int g){
       this. gol=g;
    }
    public void setSquadra(String name_team,String name_stadium){
        this.squadra=new Squadra(name_team,name_stadium);
    }

}
