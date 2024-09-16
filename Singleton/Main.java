package Singleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.showMessage();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.showMessage();

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.showMessage();

        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
        doubleCheckedLockingSingleton.showMessage();
    }
}
