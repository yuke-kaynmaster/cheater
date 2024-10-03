import java.util.ArrayList;

public class Kierownik extends Pracownik{
    ArrayList<Pracownik> pracownicy = new ArrayList<>();

    public Kierownik(String imie, String nazwisko, double wyplata, String stanowisko) {
        super(imie, nazwisko, wyplata, stanowisko);
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public void dajPodwyzke(int procent) {
        setWyplata(getWyplata()*(1+procent/100));
        for (int i = 0; i < pracownicy.size(); i++) {
            System.out.println(pracownicy.get(i));
            pracownicy.get(i).setPodwyzka((procent));
            System.out.println(pracownicy.get(i));
        }
    }
}
