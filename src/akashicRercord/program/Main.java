package akashicRercord.program;

import akashicRercord.decoratorPattern.BookWrap;
import akashicRercord.decoratorPattern.IBook;
import akashicRercord.decoratorPattern.OriginalBook;
import akashicRercord.decoratorPattern.HardCover;

import java.awt.print.Book;

public class Main {

    public static void main (String [] args){
        IBook b1 = new OriginalBook("De men phieu luu ky", "To Hoài");
        System.out.println(b1.getInformation() + "- $" + b1.getCost());

        IBook b2 = new HardCover(b1);
        System.out.println(b2.getInformation() + "- $" + b2.getCost());
    }
}
