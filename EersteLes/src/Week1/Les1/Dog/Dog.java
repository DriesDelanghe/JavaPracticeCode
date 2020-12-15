package Week1.Les1.Dog;

public class Dog {

    private String Name;
    private String Sound;
    public Dog (String DogName, String DogSound){
        this.Name = DogName;
        this.Sound = DogSound;
    }
    public void Schrijf(){
        System.out.println(Name + " blaft als volgt: " + Sound);
    }
}
