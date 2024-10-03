public class Pracownik extends Osoba{
    private double wyplata;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, double wyplata, String stanowisko) {
        super(imie, nazwisko);
        this.wyplata = wyplata;
        this.stanowisko = stanowisko;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

    public void setPodwyzka(int procent) {
        this.wyplata = this.wyplata * (1 + (double) procent / 100);
    }
    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "wyplata=" + wyplata +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
