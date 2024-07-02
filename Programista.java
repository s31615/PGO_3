
public class Programista extends Pracownik {
    private Technologia technologia;

    public Programista(String nazwisko, Technologia technologia) {
        super(nazwisko, "Programista");
        this.technologia = technologia;
    }

    public Technologia getTechnologia() {
        return technologia;
    }
}
