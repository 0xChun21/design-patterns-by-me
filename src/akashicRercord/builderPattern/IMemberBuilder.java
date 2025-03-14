package akashicRercord.builderPattern;

public interface IMemberBuilder {

     MemberBuilder addName(String name);
     MemberBuilder addEmail(String email);
     MemberBuilder addPhoneNumber(String phoneNumber);
     Member build();
}
