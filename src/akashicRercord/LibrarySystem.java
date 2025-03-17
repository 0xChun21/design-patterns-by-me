package akashicRercord;

import akashicRercord.builderPattern.Member;
import akashicRercord.builderPattern.MemberBuilder;
import akashicRercord.decoratorPattern.OriginalBook;
import akashicRercord.observerPattern.INotifyObserver;
import akashicRercord.observerPattern.ISubject;
import customDS.MyList;

public class LibrarySystem implements ISubject {

    MyList<INotifyObserver> observers = new MyList<>();
    @Override
    public void attachObserver(INotifyObserver notifyObserver) {

    }

    @Override
    public void detachObserver(INotifyObserver notifyObserver) {

    }

    @Override
    public void notifyObservers() {
        for (INotifyObserver ob : observers){
            ob.update("");
        }
    }

    public void borrowedBook(OriginalBook book, Member member){
            book.setAvailable(false);
            member.setListBorrowedBook(book);
    }
    public void display(MyList<OriginalBook> list){
        StringBuilder availableBooks = new StringBuilder("Danh sách các sách có sẵn:\n");
        StringBuilder borrowedBooks = new StringBuilder("Danh sách các sách đang được mượn:\n");
        int availableCount = 0;
        int borrowedCount = 0;

        for (int i = 0; i < list.size(); i++) {
            OriginalBook book = list.get(i);
            if(book.isAvailable()){
                availableBooks.append((i+1)).append(". ").append(book.toString()).append("\n");
                availableCount++;
            }else{
                borrowedBooks.append((i+1)).append(". ").append(book.toString()).append("\n");
                borrowedCount++;
            }
        }
        System.out.println("Danh sách các đầu sách đang có sẵn " + "( " + availableCount + " ): ");
        System.out.println(availableBooks);
        System.out.println("Danh sách các đầu sách đang chưa có sẵn " + "( " + borrowedCount + " ): ");
        System.out.println(borrowedBooks);
    }

}
