package com.may.exceptions;

import java.util.ArrayList;

public class ListOfExceptions {

    private static Integer castedValue;

	public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");


        for(int i = 0; i < myList.size(); i++) {
            try {
                setCastedValue((Integer) myList.get(i));
            } catch(ClassCastException e ) {
                System.out.println(e);
            }
        }
    }

	public static Integer getCastedValue() {
		return castedValue;
	}

	public static void setCastedValue(Integer castedValue) {
		ListOfExceptions.castedValue = castedValue;
	}
}
