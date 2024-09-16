package Singleton;

public class DoubleCheckedLockingSingleton {
    // Volatile keyword ensures visibility of changes to variables across threads
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance(){
        if(instance == null){

            // lock applied on DoubleCheckedLockingSingleton class
            synchronized (DoubleCheckedLockingSingleton.class) {
                if(instance == null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Double Checked Locking Singleton instance accessed.");
    }
}
