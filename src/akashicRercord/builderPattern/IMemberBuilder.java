package akashicRercord.builderPattern;

import akashicRercord.decoratorPattern.OriginalBook;

public interface IMemberBuilder {

     MemberBuilder addName(String name);
     MemberBuilder addEmail(String email);
     MemberBuilder addPhoneNumber(String phoneNumber);
     MemberBuilder addListBookBorrowed (OriginalBook originalBook);
     Member build();
}
