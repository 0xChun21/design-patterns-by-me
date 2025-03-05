package akashicRercord;

public class AkashaSystem {

    public static void main (String [] args){
        Akasha akasha = new AkashaBuilder()
                .addId("1")
                .addTitle("Tram nam khong quen")
                .addAuthor("Nguyen Hoang Trung")
                .addDescription("rat hay")
                .addPublisher("NXB van hoa")
                .addIsRent(false)
                .build();

        System.out.println(akasha.toString());
    }
}
