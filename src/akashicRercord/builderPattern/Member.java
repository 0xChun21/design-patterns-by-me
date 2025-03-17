package akashicRercord.builderPattern;

import akashicRercord.decoratorPattern.OriginalBook;
import akashicRercord.observerPattern.INotifyObserver;
import customDS.MyList;

public class Member implements INotifyObserver {
    private String name;
    private String email;
    private String phone;
    private MyList<OriginalBook> listBorrowedBook;

    protected Member(String name, String email, String phone, MyList<OriginalBook> listBorrowedBook) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.listBorrowedBook = listBorrowedBook;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public MyList<OriginalBook> getListBorrowedBook() {
        return listBorrowedBook;
    }

    public void setListBorrowedBook(OriginalBook book) {
        this.listBorrowedBook.add(book);
    }

    @Override
    public void update(String message) {

    }
}
