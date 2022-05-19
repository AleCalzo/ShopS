package com.solvd.test;
import com.solvd.shop.collections.LambdaShirt;
import com.solvd.shop.exceptions.InvalidOption;
import com.solvd.shop.articles.*;
import com.solvd.shop.exceptions.InvalidData;
import com.solvd.shop.exceptions.InvalidStock;
import com.solvd.shop.generics.DataPrint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.shop.read.Read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.Scanner;

public class Test extends LambdaShirt{

   private static final Logger LOG = LogManager.getLogger("");

   public static void main(String[] args) throws InvalidOption, InvalidData, InvalidStock {


        LOG.debug("Welcome to the Store of GAMES, MUSIC, MOVIES AND SO MUCH MORE"+
        "\nThis Program simulates a Shop Store to get different articles"+
        "\nYou can see the articles only if they are available in the store"+
        "\nThe User can:"+
        "\nBuy existences products."+
        "\nAdd new products to the bin."+
        "\nCheck for the final bill.");

        boolean continuar = true;
        int readProduct, readQuantity;
       String hello = "Hi there";
       DataPrint <String>dataPrint = new DataPrint<>(hello);
        dataPrint.print();

        Products disco1 = new Music("Portishead", 18.53, 6, true, "Trip Hop");
        Products disco2 = new Music("Radiohead", 21.2, 20, true, "Rock");
        Products cine1  = new Cine("Hierro 3", 30.2, 5, true, "Kim Ki Duk");
        Products game = new VideoGame("Mario Bross", 35.11, 0, false, "Plataformas");
        Products comic = new Comics("Superman", 30.11, 5, true, "Jerry Siegel");
        Products book = new Books("Lord of the Ring", 50.11, 10, true, "J.R.R Tolkien");
        Products hat = new Hats("The Mask", 120.00, 5, true, "Versace");
        Products mask = new Mask("Batman", 10.00, 5, true, "Stan Lee");
        Products shirt = new Shirt("Simpsons", 18.00, 8, true, "Heroes");

       Products catalogue[] = new Products[Products.dimentionArray];


        Management management = new Management();

        catalogue[0] = disco1;
        catalogue[1] = disco2;
        catalogue[2] = cine1;
        catalogue[3] = game;
        catalogue[4] = comic;
        catalogue[5] = book;
        catalogue[6] = hat;
        catalogue[7] = mask;
        catalogue[8] = shirt;

        do {
        Scanner scanner=new Scanner(System.in);
        LOG.debug("What is you name?");
        try {
            String nameUser = scanner.nextLine();

        LOG.debug("Hi" + "\t" + nameUser + "\t Please enter an Option:"
        +"\n1. Show Products"
        +"\n2. Buy Products"
        +"\n3. Show Cashier"
        +"\nEXIT --> Press any other number"
        );
         throw new InvalidData("\"Insert only letters please\"");
        }catch (InvalidData e){
            LOG.debug(e);
        }
        try {
            switch (Read.datoInt()) {
                case 1:
                    management.showProducts(catalogue);
                    LOG.debug("¿Do you want to buy a product?, if yes press 5, if not press 6");
                    int resoult= 0;
                    int option1=5;
                    int option2=6;
                    switch (resoult){
                        case 5:
                            management.showProductsName(catalogue);
                            break;
                        case 6:
                            LOG.debug("Thank you for stop bye");
                            break;
                    }
                    LOG.debug("Thank you for stop bye");
                        break;


                case 2:
                    LOG.debug("¿What product would you like to buy?");
                    management.showProductsName(catalogue);
                    readProduct = Read.datoInt();
                    LOG.debug("¿How many products would you like to buy?");
                    readQuantity = Read.datoInt();
                    management.buyProduct(catalogue, readProduct, readQuantity);
                    break;
                case 3:
                    LOG.debug(management.showCashier() + " $");
                    break;
                default:

                    continuar = false;
            }
        }catch (InvalidOption e){
            LOG.debug("\"Invalid Option, please try again\"");
        }

        } while(continuar);

        LOG.debug("---- Thank you for stop by, see you next time!. ----");

   }


    public static void show(){
        try {
            Scanner scanner=new Scanner(System.in);
            LOG.debug("Hi, what is the name of your file?");
            String fileName= scanner.next();
            var reader = new FileReader("file.txt");
            LOG.debug("File Opened");
        }catch (FileNotFoundException e){
            LOG.debug("Sorry the file does not exist.");
        }


    DataPrint<String> c= new DataPrint<String>("");
    c.print();

    }
        @Override
                public void order(){
        LambdaShirt shirt = new LambdaShirt();
            final Object order = shirt.order;
   }
}