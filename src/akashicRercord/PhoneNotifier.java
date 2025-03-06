package akashicRercord;

public class PhoneNotifier implements IAkashaObserver{
    @Override
    public void update(Object obj, Object arg) {
        if (AkashaSystem.class.isAssignableFrom(obj.getClass())){

        }
    }


//    @Override
//    public void borrowNotify(String name, String description, String filename) {
//        System.out.println("Notify to user " + name + " and all user about borrowing book: ");
//        System.out.println("name of book " + filename);
//        System.out.println("book description: " + description);
//

}
