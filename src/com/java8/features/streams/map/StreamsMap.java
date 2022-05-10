package com.java8.features.streams.map;

import java.util.*;

public class StreamsMap {


    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("Jack" , "123" , "IT") ,
                new Employee("Dave" , "144" , "IT") ,
                new Employee("Enammuel" , "356" , "IT"),
                new Employee("Jhon" , "879" , "IT"));

        List<Employee> emptyList = Collections.EMPTY_LIST;

        System.out.println(Optional.ofNullable(null).orElse(Collections.EMPTY_LIST ));;

    }
}
