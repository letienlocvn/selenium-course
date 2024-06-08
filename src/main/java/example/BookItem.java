package example;

import java.util.ArrayList;
import java.util.List;

public class BookItem {
    int level;
    String itemName;
    List<BookItem> children;

    BookItem(int level, String itemName) {
        this.level = level;
        this.itemName = itemName;
        this.children = new ArrayList<>();
    }

    void addChild(BookItem child) {
        this.children.add(child);
    }
}
