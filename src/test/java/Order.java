public class Order {
    //-------------------ATTRIBUTES----------------------------
    private double totalPrice;
    private double weight;
    private double volume;
    private int quantity;
    private double width;
    private double height;
    private double depth;
    private String adress;
    private boolean delipvaryRequested;

    //-----------------GETTERS/SETTERS-------------------------
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isDelipvaryRequested() {
        return delipvaryRequested;
    }

    public void setDelipvaryRequested(boolean delipvaryRequested) {
        this.delipvaryRequested = delipvaryRequested;
    }
}
