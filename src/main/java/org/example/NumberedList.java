package org.example;

public class NumberedList extends BaseList {
    @Override
    public String get(int index) {
        return (index + 1) + ". " + super.get(index);
    }
}
