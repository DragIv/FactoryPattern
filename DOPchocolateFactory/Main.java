package DOPchocolateFactory;


import DOPchocolateFactory.SnickersChocolate.Snickers;
import DOPchocolateFactory.TwixChocolate.Twix;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Twix();
        Factory factorysn = new Snickers();

        Chocolate chocolate = factory.chocolateSelection("left stick");
        System.out.println("Order a " + chocolate.getName() + "\n");

        chocolate = factorysn.chocolateSelection("nuts");
        System.out.println("Order a " + chocolate.getName() + "\n");

    }
}
