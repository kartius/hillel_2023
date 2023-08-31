package edu.hillel.lesson9.without_generics;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }


    public static void main(String[] args) {

        List strings = new ArrayList<>();

        Box box = new Box();
        box.setItem(Integer.valueOf(5));

        box.setItem(new String("fdgfdgfdg"));


        if (box.getItem() instanceof Integer) {
            final Integer item1 = (Integer) box.getItem();
        } else if (box.getItem() instanceof String) {
            final String item1 = (String) box.getItem();
        }
        else {
            System.out.println("Can't cast because type is "+ box.getItem().getClass());
        }
    }
}
