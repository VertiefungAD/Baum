/**
 * Created by Denis on 10.11.2016.
 */
public class Testklasse {
    public static void main(String[] args) {
        if (Test.test1()) {
            System.out.println("Beinhaltete Zahlen wurden nicht gefunden!");
        }
        if (Test.test2()) {
            System.out.println("Nicht beinhaltete Zahlen wurden fälschlicherweise gefunden!");
        }
        if (Test.test3()) {
            System.out.println("Die Größe stimmt nicht!");
        }
    }

    private static class Test {
        public static boolean test1() {
            boolean test1 = true;

            Baum testBaum1 = new Baum();
            testBaum1.add(8);
            testBaum1.add(4);
            testBaum1.add(12);
            testBaum1.add(2);
            testBaum1.add(6);
            testBaum1.add(10);
            testBaum1.add(14);
            testBaum1.add(1);
            testBaum1.add(3);
            testBaum1.add(5);
            testBaum1.add(7);
            testBaum1.add(9);
            testBaum1.add(11);
            testBaum1.add(13);
            testBaum1.add(15);

            System.out.println("Baum 1 erstellt");
            if (!testBaum1.contains(12)) test1 = false;
            if (!testBaum1.contains(5)) test1 = false;
            System.out.println("Baum 1 geprüft");
            return test1;
        }

        public static boolean test2() {
            boolean test2 = true;

            Baum testBaum2 = new Baum();
            testBaum2.add(8);
            testBaum2.add(4);
            testBaum2.add(12);
            testBaum2.add(2);
            testBaum2.add(6);
            testBaum2.add(10);
            testBaum2.add(14);
            testBaum2.add(1);
            testBaum2.add(3);
            testBaum2.add(5);
            testBaum2.add(7);
            testBaum2.add(9);
            testBaum2.add(11);
            testBaum2.add(13);
            testBaum2.add(15);
            System.out.println("Baum 2 erstellt");
            if (!testBaum2.contains(16)) test2 = false;
            if (!testBaum2.contains(55)) test2 = false;
            System.out.println("Baum 2 geprüft");
            return test2;
        }

        private static boolean test3() {
            boolean test3 = true;

            Baum testBaum3 = new Baum();
            testBaum3.add(8);
            testBaum3.add(4);
            testBaum3.add(12);
            testBaum3.add(2);
            testBaum3.add(6);
            testBaum3.add(10);
            testBaum3.add(14);
            testBaum3.add(1);
            testBaum3.add(3);
            testBaum3.add(5);
            testBaum3.add(7);
            testBaum3.add(9);
            testBaum3.add(11);
            testBaum3.add(13);
            testBaum3.add(15);
            System.out.println("Size geprüft: "+testBaum3.size());

            if (testBaum3.size() != 15) test3 = false;

            return test3;
        }

    }
}
