package com.java8.features.comparators;

import java.util.*;

public class StockPriceComparator implements Comparator<StockOrder> {


    @Override
    public int compare(StockOrder o1, StockOrder o2) {
        return Integer.compare(o1.getPrice(),o2.getPrice());
    }
}
