 public class TestArray {
        public static void main(String[] args) {
            ArrayStrings a1 = new ArrayStrings();
            a1.setLijstNamen(new String[]{"Ann", "Gert", "Erik", "Bart", "Frederik"});
            a1.setListPassword(new int[]{123,321,456,654,789});
            a1.drukAf();
            a1.login();
        }
}
