/**
 * Created by Gleb on 17.11.2016.
 */
public class Geksagon {
    private int x, y, index;

    public int getX(){return x;}
    public int getY(){return y;}
    public int getIndex(){return index;}

    private void setX(int x){this.x = x;}
    private void setY(int y){this.y = y;}
    private void setIndex(int i){this.index = i;}

    public Geksagon(int x, int y, int index){
        setX(x);
        setY(y);
        setIndex(index);
    }

    public Geksagon(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Geksagon{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
