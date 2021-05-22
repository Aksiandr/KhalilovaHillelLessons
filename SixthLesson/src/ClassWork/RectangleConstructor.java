package ClassWork;

public class RectangleConstructor {

    private double weight;
    private double height;

    public RectangleConstructor(double weight, double height){
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculatePerimeter(double weight, double height){
        return 2 * (weight + height);
    }
}
