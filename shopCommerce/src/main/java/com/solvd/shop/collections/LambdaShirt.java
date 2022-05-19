package com.solvd.shop.collections;

import java.util.*;
import java.util.List;

public class LambdaShirt {

    public Object order;

    public void order (){

        List<String> list = new ArrayList<>();
        list.add("Small");
        list.add("Medium");
        list.add("Large");
        list.add("Extra Large");

        Collections.sort(list, new Comparator <String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        }

    }

