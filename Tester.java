
public class Tester extends Pracownik {
    private String specjalizacja;

    public Tester(String nazwisko, String specjalizacja) {
        super(nazwisko, "Tester");
        this.specjalizacja = specjalizacja;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }
}
