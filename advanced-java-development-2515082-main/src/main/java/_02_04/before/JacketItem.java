package _02_04.before;

import _02_04.before.ClothingItem;

public class JacketItem extends ClothingItem {

    @Override
    int getPrice() {
        return 25;
    }

    @Override
    String getName() {
        return "Jacket";
    }
}
