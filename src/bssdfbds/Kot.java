package bssdfbds;

public class Kot {

    private static Kot kot;
    private String imie;

    private Kot(){
    }

    public static Kot getInstance(){
        if(kot == null) {
           kot = new Kot();
        }
        return new Kot();
    }

    public void setImie(String imie){
        this.imie = imie;
    }


}
