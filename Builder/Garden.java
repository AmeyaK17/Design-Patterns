package Builder;

public class Garden {
    private int area;
    private boolean hasFountain;

    public Garden(int area, boolean hasFountain){
        this.area = area;
        this.hasFountain = hasFountain;
    }

    @Override
    public String toString(){
        return "Garden has area = " + area + " and has fountain = " + hasFountain;
    }
}
