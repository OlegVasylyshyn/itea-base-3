package week4.day2.nuclearstation;

public interface NuclearStation {
    void work();
}

class UnsafeNuclearStation implements NuclearStation {
    @Override
    public void work() {
        System.out.println("WORK..");
    }
}

class SafeMethodNuclearStation implements NuclearStation {
    @Override
    final public void work() {
        System.out.println("WORK..");
    }
}

final class SafeClassNuclearStation implements NuclearStation {
    @Override
    public void work() {
        System.out.println("WORK..");
    }
}

//class A extends SafeClassNuclearStation {
//
//}