package akashicRercord;

import customDS.ArrayListCustom;

import java.awt.print.Book;

public class Member {
    private String type;
    private ArrayListCustom<Book> borrowedBooks = new ArrayListCustom<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayListCustom<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayListCustom<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
