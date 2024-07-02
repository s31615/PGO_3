
public class Pracownik {
    private String nazwisko;
    private String stanowisko;

    public Pracownik(String nazwisko, String stanowisko) {
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }
}
