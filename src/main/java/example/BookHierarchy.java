package example;

import java.util.ArrayList;
import java.util.List;

public class BookHierarchy {
    public static void main(String[] args) {
        // Tạo dữ liệu mẫu
        List<BookItem> bookItems = fetchSampleData();
        // Xây dựng cấu trúc cây
        List<BookItem> hierarchy = buildHierarchy(bookItems);
        // Hiển thị cấu trúc cây
        printHierarchy(hierarchy, 0);
    }

    static List<BookItem> fetchSampleData() {
        List<BookItem> bookItems = new ArrayList<>();
        bookItems.add(new BookItem(1, "Shelf_A"));
        bookItems.add(new BookItem(2, "Box_A1"));
        bookItems.add(new BookItem(3, "Book_A11"));
        bookItems.add(new BookItem(3, "Book_A12"));
        bookItems.add(new BookItem(4, "Book_A121"));
        bookItems.add(new BookItem(4, "Book_A122"));
        bookItems.add(new BookItem(1, "Shelf_B"));
        bookItems.add(new BookItem(2, "Box_B1"));
        bookItems.add(new BookItem(3, "Book_B11"));
        return bookItems;
    }

    // Hàm xây dựng cấu trúc cây từ danh sách các BookItem
    static List<BookItem> buildHierarchy(List<BookItem> bookItems) {
        List<BookItem> hierarchy = new ArrayList<>();
        List<BookItem> stack = new ArrayList<>();

        for (BookItem item : bookItems) {
            int level = item.level;

            // Loại bỏ các mục không phải là cha của mục hiện tại khỏi stack
            while (!stack.isEmpty() && stack.get(stack.size() - 1).level >= level) {
                stack.remove(stack.size() - 1);
            }

            // Nếu stack không rỗng, mục hiện tại là con của mục trên cùng trong stack
            if (!stack.isEmpty()) {
                stack.get(stack.size() - 1).addChild(item);
            } else {
                hierarchy.add(item);
            }

            // Thêm mục hiện tại vào stack
            stack.add(item);
        }
        return hierarchy;
    }

    // Hàm hiển thị cấu trúc cây
    static void printHierarchy(List<BookItem> hierarchy, int indent) {
        for (BookItem item : hierarchy) {
            for (int i = 0; i < indent; i++) {
                System.out.print("  ");
            }
            System.out.println(item.itemName);
            printHierarchy(item.children, indent + 1);
        }
    }
}
