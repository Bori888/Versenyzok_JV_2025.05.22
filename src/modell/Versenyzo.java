package modell;

public class Versenyzo {
    private String nev;
    private String email;
    private double atlag;
    private int elsoDb;

    public Versenyzo(String sor) {
        String[] adatok = sor.split(" ");
        nev = adatok[0];
        email = adatok[1];
        atlag = Double.parseDouble(adatok[2]);
        elsoDb = Integer.parseInt(adatok[3]);
    }

    public Versenyzo(String nev, String email, double atlag, int elsoDb) {
        this.nev = nev;
        this.email = email;
        this.atlag = atlag;
        this.elsoDb = elsoDb;
    }

    public String getNev() {
        return nev;
    }

    public String getEmail() {
        return email;
    }

    public double getAtlag() {
        return atlag;
    }

    public int getElsoDb() {
        return elsoDb;
    }

    @Override
    public String toString() {
        return "Versenyzo{" + "nev=" + nev + ", email=" + email + ", atlag=" + atlag + ", elsoDb=" + elsoDb + '}';
    }
    
    
}
