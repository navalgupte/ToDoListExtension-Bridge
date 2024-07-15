package org.example;

public class OrnamentedList extends BaseList {
    private char itemType;

    public char getItemType() {
        return itemType;
    }

    public void setItemType(char itemType) {
        if(itemType > ' ') {
            this.itemType = itemType;
        }
    }

    @Override
    public String get(int index) {
        return itemType + " " + super.get(index);
    }
}
