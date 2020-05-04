package TH_Class_Shape;

public class Shape {
    // tạo ra 2 thuộc tính:
    private  String color = "green";
    private  boolean filled = true;
    // tạo ra contructor không tham số

    public Shape(){
    }

    public Shape(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    }
// tạo phương thức get và set

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                +getColor()
                +" and "
                +(isFilled() ? "filled" : " Not filled");
    }
}
