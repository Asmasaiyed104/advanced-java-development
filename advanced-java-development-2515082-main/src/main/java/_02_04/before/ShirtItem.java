package _02_04.before;

import _02_04.before.ClothingItem;

public class ShirtItem extends ClothingItem {

    @Override
    int getPrice() {
        return 10;
    }

    @Override
    String getName() {
        return "Shirt";
    }
}
