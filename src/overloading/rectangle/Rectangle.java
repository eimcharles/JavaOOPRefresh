package overloading.rectangle;

public class Rectangle {

    private int lenght;
    private int width;

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
