/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package nuova.cartella;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {





        Calciatore Totti=new Calciatore("Francesco",38,"Attaccante");
        Totti.setGol(22);
        Totti.setPresenze(30);
        Totti.setSquadra("Roma","Olimpico");
        System.out.println(Totti.getNome());
        System.out.println(Totti.getEta());
        System.out.println(Totti.getRuolo());
        System.out.println(Totti.getGol());
        System.out.println(Totti.getPresenze());
        System.out.println(Totti.getSquadra());

        


       




        
    }
}
