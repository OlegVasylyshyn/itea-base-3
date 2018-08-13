package week4.day2.nuclearstation;

public class Test {

    public static void main(String[] args) {

        testNuclearStation(new UnsafeNuclearStation() {
            @Override
            public void work() {
                System.out.println("Boom..");
            }
        });

//        testNuclearStation(new SafeMethodNuclearStation() {
//            @Override
//            public void work() {
//                System.out.println("Boom..");
//            }
//        });
//
//        testNuclearStation(new SafeClassNuclearStation() {
//            @Override
//            public void work() {
//                System.out.println("Boom..");
//            }
//        });

    }

    private static void testNuclearStation(final NuclearStation nuclearStation) {
        // can't reassign
//        nuclearStation = new UnsafeNuclearStation();

        final int k = 10;
//        k = 5;

        nuclearStation.work();
    }

}
