public class BMI {

    private double gewicht;
    private double lengte;

    public BMI(double gewicht, double lengte) {
        this.gewicht = gewicht;
        this.lengte = lengte;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "gewicht=" + gewicht +
                ", lengte=" + lengte +
                '}';
    }

    public void berekenBMI(){
        double BMI = gewicht/(Math.pow(lengte, 2));
        System.out.println("BMI = " + BMI);

        if(BMI <= 18.5){
            System.out.println("ondergewicht");
        } else if(BMI <= 25){
            System.out.println("gezond gewicht");
        } else if(BMI <= 30){
            System.out.println("overgewicht");
        }else if(BMI <= 40){
            System.out.println("obesitas");
        }else{
            System.out.println("morbide obesitas");
        }
    }
}
