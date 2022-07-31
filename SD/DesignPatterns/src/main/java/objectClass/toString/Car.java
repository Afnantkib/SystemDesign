package objectClass.toString;

public class Car {
    String name;
    int price;
    int speed;

    public Car(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
