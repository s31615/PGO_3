
import java.util.ArrayList;
import java.util.List;

public class Manager extends Pracownik {
    private List<Pracownik> pracownicy;

    public Manager(String nazwisko) {
        super(nazwisko, "Manager");
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }
}
