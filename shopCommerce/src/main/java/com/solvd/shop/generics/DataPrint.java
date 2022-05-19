package com.solvd.shop.generics;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataPrint <E>{
    private static final Logger LOG = LogManager.getLogger("");

    private E dataPrint;

    public DataPrint (E dataToPrint){
        this.dataPrint=dataToPrint;
    }
    public void print (){
        LOG.debug("Thank you for stopping bye"+ getClass().getName());
    }
}
