package com.java8.features.comparators;

import java.util.*;

public class Client {

    public static void main(String[] args) {

        StockOrder order1 = new StockOrder(100,2);
        StockOrder order2 = new StockOrder(10,29);
        StockOrder order3 = new StockOrder(75,70);
        StockOrder order4 = new StockOrder(300,1);
        StockOrder order5 = new StockOrder(55,67);
        StockOrder order6 = new StockOrder(35,101);
        StockOrder order7 = new StockOrder(10,901);
        StockOrder order8 = new StockOrder(23,666);

        ///Sort using comparable interface
      /*  List<StockOrder> stockOrders = Arrays.asList(order1,order2,order3,order4,order5,order6,order7,order8);

        System.out.println("============= Before Sorting ==============");
        System.out.println(stockOrders);

        Collections.sort(stockOrders);

        System.out.println("============= After Sorting ==============");
        System.out.println(stockOrders);

        System.out.println("========================================================================");

        System.out.println("====================== Comparator Example  ============================");
*/
        //Sort using comparators
        /*List<StockOrder> stockOrders2 = Arrays.asList(order1,order2,order3,order4,order5,order6,order7,order8);

        System.out.println("============= Before Sorting ==============");
        System.out.println(stockOrders2);

        Collections.sort(stockOrders2, new StockPriceComparator());

        System.out.println("============= After Stock Price Sorting ==============");
        System.out.println(stockOrders2);

        Collections.sort(stockOrders2, new StockQuantityComparator());

        System.out.println("============= After Stock Quantity Sorting ==============");
        System.out.println(stockOrders2);

        Collections.sort(stockOrders2, new StockTotalPriceComparator());

        System.out.println("============= After Stock Total Cost Sorting ==============");
        System.out.println(stockOrders2);*/



        // Java 8 based sorting
        List<StockOrder> stockOrders3 = Arrays.asList(order1,order2,order3,order4,order5,order6,order7,order8);


        System.out.println("============= JAVA 8 based sorting ==============");


        System.out.println("============= Before Cost based sorting ==============");
        System.out.println(stockOrders3);


        Collections.sort(stockOrders3 , Comparator.comparingInt(StockOrder::getTotalPrice));

        System.out.println("============= After Cost based sorting ==============");
        System.out.println(stockOrders3);


        Collections.sort(stockOrders3 , Comparator.comparingInt(StockOrder::getQuantity));

        System.out.println("============= After Quantity based sorting ==============");
        System.out.println(stockOrders3);


        Collections.sort(stockOrders3 , Comparator.<StockOrder>naturalOrder());

        System.out.println("============= After Natural order  based sorting ==============");
        System.out.println(stockOrders3);

        Collections.sort(stockOrders3 , Comparator.<StockOrder>reverseOrder());

        System.out.println("============= After Reverse order  based sorting ==============");
        System.out.println(stockOrders3);


        List<StockOrder> stockOrders4 = Arrays.asList(order1,order2,order3,order4,null,order5,order6,order7,order8 , null);

        Collections.sort(stockOrders4, Comparator.nullsFirst(Comparator.<StockOrder>naturalOrder()));

        System.out.println("============= After Null First order  based sorting ==============");
        System.out.println(stockOrders4);


        Collections.sort(stockOrders4, Comparator.nullsLast(Comparator.<StockOrder>naturalOrder()));

        System.out.println("============= After Null Last order  based sorting ==============");
        System.out.println(stockOrders4);


        Collections.sort(stockOrders3, Comparator.comparingInt(StockOrder::getQuantity).thenComparing(Comparator.comparingInt(StockOrder::getPrice)));

        System.out.println("============= After then comparing order  based sorting ==============");
        System.out.println(stockOrders3);
    }
}
