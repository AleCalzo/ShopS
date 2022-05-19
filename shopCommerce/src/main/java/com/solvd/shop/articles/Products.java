package com.solvd.shop.articles;
import com.solvd.shop.interfaces.Regards;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public abstract class Products implements Regards {
    private static final Logger LOG = LogManager.getLogger("");

    // Attributes
    private String name;
    private double costUnit;
    private int cantStock;
    private boolean available = false;
    public static int dimentionArray;

    public Products() {
    }
    public Products(String name, double costUnit, int cantStock,
                    boolean available) {
        this.name = name;
        this.costUnit = costUnit;
        this.cantStock = cantStock;
        this.available = available;

        dimentionArray++;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" + "Cost Unit: "
                + this.getCostUnit() + " €\n" + "In Stock: "
                + this.getCantStock() + "\n";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostUnit() {
        return this.costUnit;
    }

    public void setCostUnit(double costUnit) {
        this.costUnit = costUnit;
    }

    public int getCantStock() {
        return this.cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public boolean isAvailable() {
        if (getCantStock() > 0)
            this.available = true;
        return this.available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
