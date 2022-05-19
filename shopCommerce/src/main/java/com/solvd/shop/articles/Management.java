package com.solvd.shop.articles;
import com.solvd.shop.exceptions.InvalidProduct;
import com.solvd.shop.exceptions.InvalidStock;
import com.solvd.shop.interfaces.Regards;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Management implements Regards {

    private static final Logger LOG = LogManager.getLogger("");
    private Products products[] = null;
    private double cashier;

    public Management()  { }

    public Management(Products[] products) throws InvalidProduct{

        this.products = products;
    }

    public Products[] UploadProducts() {

        return products;
    }

    public void showProducts (Products[] products)  {
        for (int i = 0; i < products.length; i++) {
            LOG.debug(products[i]+"n-------n");
        }
    }
    public void showProductsName(Products[] products) throws InvalidProduct {

        for (int i = 0; i < products.length; i++) {
            LOG.debug(i+1 +" "+products[i].getName()+"n");
        }
        LOG.debug("n------------n");
    }
    public double buyProduct(Products[] products, int num, int numberOfUnits) throws InvalidStock{
        if (products[num-1].isAvailable()) {
            if (products[num-1].getCantStock() >= numberOfUnits){
                LOG.debug("Success Buy!!n");
                products[num -1].setCantStock(products[num -1].getCantStock()-numberOfUnits);
                return cashier+=numberOfUnits*products[num-1].getCostUnit();
            } else {LOG.debug("No product available");}
        } else {LOG.debug("No product available");}
        return cashier;
    }
    public double showCashier() {
        LOG.debug("Total is $ ");
        cashier=Math.round(cashier*100);
        return cashier/100;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}
