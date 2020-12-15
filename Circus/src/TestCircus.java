public class TestCircus {

    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int dag = 0;

        Clown c1 = new Clown("Enrique", 250);

        c1.setWerkt(false, 1);
        c1.setWerkt(false, 2);

        for (int i = 0; i < c1.getSchaterindices().length; i++) {
            if(c1.getWerkt(dag) != false){
                double decibel = Math.random() * (max - min + 1) + min;
                c1.setSchaterindices(decibel, i);
            }
            if(dag < 6){
                dag++;
            }else{
                dag =0;
            }
        }

        System.out.println(c1);
        System.out.println(c1.berekenJaarloon());
        System.out.println(c1.lachtoeslag());
        System.out.println(c1.hardsteGelachen());
        System.out.println(c1.jaarbonus());

    }

}
