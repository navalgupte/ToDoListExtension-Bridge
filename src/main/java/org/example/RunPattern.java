package org.example;

public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Bridge Pattern");
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating OrderedListImpl object..");
        ListImpl implementation = new OrderedListImpl();
        System.out.println();
        System.out.println("Creating BaseList object..");
        BaseList listOne = new BaseList();
        listOne.setImplementor(implementation);
        System.out.println();
        System.out.println("Adding items to the list..");
        listOne.add("Meditate for 20 minutes");
        listOne.add("Workout for 60 minutes");
        listOne.add("Learn to program - Code for 60 minutes");
        listOne.add("Plan your meals");
        listOne.add("Rest");
        listOne.add("Plan for the upcoming week");
        System.out.println();
        System.out.println("Creating an OrnamentedList object..");
        OrnamentedList listTwo = new OrnamentedList();
        listTwo.setImplementor(implementation);
        listTwo.setItemType('*');
        System.out.println();
        System.out.println("Creating an NumberedList object..");
        NumberedList listThree = new NumberedList();
        listThree.setImplementor(implementation);
        System.out.println();
        System.out.println("Printing out first list (BaseList)..");
        for(int i = 0; i < listOne.count(); i++) {
            System.out.println("\t" + listOne.get(i));
        }
        System.out.println();
        System.out.println("Printing out second list (OrnamentedList)..");
        for(int i = 0; i < listTwo.count(); i++) {
            System.out.println("\t" + listTwo.get(i));
        }
        System.out.println();
        System.out.println("Printing out third list (NumberedList)..");
        for(int i = 0; i < listThree.count(); i++) {
            System.out.println("\t" + listThree.get(i));
        }
        System.out.println();
        System.out.println("---- ---- ---- ---- ----");
    }
}