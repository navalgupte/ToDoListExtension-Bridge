package org.example;

/*
    ListImpl Class - Defines the general behavior of a To-Do list.
 */
public interface ListImpl {
    public void addItem(String item);
    public void addItem(String item, int index);
    public void removeItem(String item);
    public int getNumberOfItems();
    public String getItem(int index);
    public boolean supportsOrdering();
}
