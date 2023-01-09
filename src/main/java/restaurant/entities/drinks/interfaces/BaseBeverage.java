package restaurant.entities.drinks.interfaces;

import static restaurant.common.ExceptionMessages.INVALID_COUNTER;
import static restaurant.common.ExceptionMessages.INVALID_NAME;

public abstract class BaseBeverage implements Beverages{

    private String name;
    private int counter;
    private double price;
    private String brand;

    public BaseBeverage(String name, int counter, double price, String brand) {
        setName(name);
        this.counter = counter;
        this.price = price;
        this.brand = brand;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(INVALID_NAME);
        }
        this.name = name;
    }

    public void setCounter(int counter) {
        if (counter <= 0) {
            throw new IllegalArgumentException(INVALID_COUNTER);
        }
        this.counter = counter;
    }
    

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getCounter() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getBrand() {
        return null;
    }
}
