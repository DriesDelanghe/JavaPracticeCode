public class TestVakantiehuis {
    public static void main(String[] args) {
        Vakantiehuis test1 = new Vakantiehuis(800,0.02,0.05,
                                                12,2);

        System.out.println(test1.reserveer(10,2));
    }
}
