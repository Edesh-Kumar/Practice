package OOPS.encapsulation;

public class PrivateCar {
    private String model;
    public double price;
    private int key;
    public void start(int key){
        if(this.key==key) System.out.println("Vroom....Vroom....");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
