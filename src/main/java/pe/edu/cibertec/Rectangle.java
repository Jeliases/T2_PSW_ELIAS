package pe.edu.cibertec;

public class Rectangle {

    private double widht;
    private double height;


    public Rectangle (double widht, double height){

        if(widht <= 0 || height <= 0) {
            throw new IllegalArgumentException("Las dimensiones deben ser mayores a 0 ");

        }

        this.widht = widht;
        this.height = height;
    }

    public double area (){

        return widht * height;
    }

    public  boolean isSquare(){

        return widht == height;
    }
    public double getWidht() { return widht;}
    public  double getHeight() {return height;}
}
