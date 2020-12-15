package Week1.Les1.Person;

public class Persoon {

    private String Name;
    private String FirstName;
    private String Adress;

    public Persoon(String NamePerson, String FirstNamePerson, String AdressPerson){
        this.Name = NamePerson;
        this.FirstName = FirstNamePerson;
        this.Adress = AdressPerson;
    }

    public void print() {
        System.out.println(FirstName + " " + Name + " woont in " + Adress);
    }
}
