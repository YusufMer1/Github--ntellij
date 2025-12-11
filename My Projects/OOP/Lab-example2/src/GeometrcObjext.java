import java.util.Date;

public class GeometrcObjext {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometrcObjext() {
    }

    public GeometrcObjext(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    Boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return color;
    }
}
