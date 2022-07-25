package nuova.cartella;

public class Squadra {
    private String nome;
    private String stadio;
    private int trofei;
    private int vittorie;
    private int pareggi;
    private int sconfitte;
    private int punti;
    private int gol;
    
 Squadra(String n,String s){
        this.nome=n;
        this.stadio=s;
    }
public String getNomeSquadra(){
        return this.nome;
    }
public void setTrofei(int n){
    trofei=n;
}
public void setVittorie(int n){
    this.vittorie=n;
}
public void setPareggi(int n){
    this.pareggi=n;
}
public void setSconfitte(int n){
    this.sconfitte=n;
}
public void setPunti(int n){
    this.punti=n;
}
public void setGol(int n){
    this.gol=n;
}
public String getStadio(){
    return this.stadio;
}
public int getTrofei(){
    return this.trofei;
}
public int getVittore(){
    return this.vittorie;
}
public int getPareggi(){
    return this.pareggi;
}
public int getSconfitte(){
    return this.sconfitte;
}
public int getPunti(){
    return this.punti;
}
public int getGol(){
    return this.gol;
}

}
