
public class Program {
    private String nazwa;
    private Cel cel;

    public Program(String nazwa, Cel cel) {
        this.nazwa = nazwa;
        this.cel = cel;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Cel getCel() {
        return cel;
    }
}
