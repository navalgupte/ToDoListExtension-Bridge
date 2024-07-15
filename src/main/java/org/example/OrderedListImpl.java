package org.example;

import java.util.ArrayList;

/*
    OrderedListImpl Class - Implements ListImpl, stores list entries in an ArrayList object.
 */

public class OrderedListImpl implements ListImpl {
    private ArrayList items = new ArrayList();

    public void addItem(String item) {
        if(!items.contains(item)) {
            items.add(item);
        }
    }

    @Override
    public void addItem(String item, int index) {
        if(!items.contains(item)) {
            items.add(index, item);
        }
    }

    @Override
    public void removeItem(String item) {
        items.remove(item);
    }

    @Override
    public boolean supportsOrdering() {
        return true;
    }

    @Override
    public int getNumberOfItems() {
        return items.size();
    }

    public String getItem(int index) {
        if(index < items.size()) {
            return (String) items.get(index);
        }
        return null;
    }
}
