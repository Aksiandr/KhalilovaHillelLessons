public enum Ball {

    BASKETBALL(23, "Basketball", 120, "Rubber"),
    FOOTBALL(20, "Football", 420, "Skin"),
    VOLLEYBALL(18, "Volleyball", 230, "EcoSkin"),
    BASEBALL(18, "Baseball", 180, "EcoSkin"),
    TENNIS(9, "Tennis", 90, "EcoSkin");

    double size;
    String sportKind;
    double price;
    String material;

    Ball(double size, String sportKind, double price, String material) {
        this.size = size;
        this.sportKind = sportKind;
        this.price = price;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public String getSportKind() {
        return sportKind;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", sportKind='" + sportKind + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
