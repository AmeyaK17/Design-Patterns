package Builder;

public class SwimmingPool {
    private int depth;
    private boolean isHeated;

    public SwimmingPool(int depth, boolean isHeated){
        this.depth = depth;
        this.isHeated = isHeated;
    }

    @Override
    public String toString(){
        return "Swimming pool has depth = " + depth + " and is heated = " + isHeated;
    }
}
