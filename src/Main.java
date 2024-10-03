public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();
        Pracownik pracownikMax = new Pracownik("Max", "Sielski", 6400, "programista");
        Pracownik pracownikAsia = new Pracownik("Asia", "Basia", 16400, "programistka");
        Pracownik pracownikIsia = new Pracownik("Isia", "Kisia", 11400, "testerka");
        Kierownik kierownik = new Kierownik("Emilia", "Jakastam", 29500, "cos");

        firma.dodajPracownika(pracownikMax);
        firma.dodajPracownika(pracownikAsia);
        firma.dodajPracownika(pracownikIsia);
        firma.dodajPracownika(kierownik);

        kierownik.dodajPracownika(pracownikAsia);
        kierownik.dodajPracownika(pracownikMax);
        System.out.println(pracownikAsia);
        System.out.println(pracownikIsia);
        System.out.println(pracownikMax);
        System.out.println(kierownik);
        System.out.println(firma.obliczKosztWyplaty());
        kierownik.dajPodwyzke(10);
        System.out.println(firma.obliczKosztWyplaty());

        System.out.println(pracownikAsia);
        System.out.println(pracownikIsia);
        System.out.println(pracownikMax);
        System.out.println(kierownik);
    }
}