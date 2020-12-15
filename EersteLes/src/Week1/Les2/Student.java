package Week1.Les2;

public class Student {

    private String Naam;
    private String Voornaam;
    private String Postcode;

    //name constructor = name class
    public Student(String naam, String voornaam, String postcode) {
        this.Naam = naam;
        this.Voornaam = voornaam;
        this.Postcode = postcode;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Naam='" + Naam + '\'' +
                ", Voornaam='" + Voornaam + '\'' +
                ", Postcode='" + Postcode + '\'' +
                '}';
    }


}


