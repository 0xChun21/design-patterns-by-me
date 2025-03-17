package akashicRercord.builderPattern;

import akashicRercord.decoratorPattern.OriginalBook;
import customDS.MyList;

public class MemberBuilder implements IMemberBuilder{

    private String name;
    private String email;
    private String phone;
    private MyList<OriginalBook> listBorrowedBook;

    @Override
    public MemberBuilder addName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public MemberBuilder addEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public MemberBuilder addPhoneNumber(String phoneNumber) {
        this.phone = phoneNumber;
        return this;
    }

    @Override
    public MemberBuilder addListBookBorrowed(OriginalBook originalBook) {
        this.listBorrowedBook.add(originalBook);
        return this;
    }

    @Override
    public Member build() {
        return new Member(name, email, phone, listBorrowedBook);
    }
}
