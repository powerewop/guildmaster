/**
 * Created by Gleb on 17.11.2016.
 */
public class Town {
    private int size;
    private String name;

    private void setSize(int size){
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getSize(){
        return size;
    }

    public String getName() {
        return name;
    }

    public Town(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public Town(String name) {
        this.name = name;
    }
}
