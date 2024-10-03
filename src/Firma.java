import java.util.ArrayList;

public class Firma {
    private ArrayList<Pracownik> pracownicyFirmy = new ArrayList<>();

    public Firma(ArrayList<Pracownik> pracownicy) {
        this.pracownicyFirmy = pracownicy;
    }

    public Firma() {
    }

    public void dodajPracownika(Pracownik pracownik){
        pracownicyFirmy.add(pracownik);
    }

    public double obliczKosztWyplaty(){
        double koszt = 0;
        for (int i = 0; i < pracownicyFirmy.size() ; i++) {
            koszt = koszt +pracownicyFirmy.get(i).getWyplata();
        }
        return koszt;
    }
}