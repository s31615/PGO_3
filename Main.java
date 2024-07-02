
public class Main {
    public static void main(String[] args) {
     
        Technologia technologia = new Technologia("Java");
        Programista programista = new Programista("Jan Kowalski", technologia);
        Tester tester = new Tester("Anna Nowak", "Automatyzacja testów");
        Manager manager = new Manager("Piotr Wiśniewski");
        
        
        Cel cel = new Cel("Ukończenie projektu");
        
        
        Program program = new Program("System zarządzania", cel);
        

        manager.dodajPracownika(programista);
        manager.dodajPracownika(tester);
        
        
        System.out.println("Program: " + program.getNazwa());
        System.out.println("Cel: " + program.getCel().getOpis());
        
        System.out.println("Manager: " + manager.getNazwisko());
        System.out.println("Pracownicy:");
        for (Pracownik pracownik : manager.getPracownicy()) {
            System.out.println(" - " + pracownik.getNazwisko() + " (" + pracownik.getStanowisko() + ")");
        }
    }
}
