package DOPchocolateFactory.SnickersChocolate;

import DOPchocolateFactory.Chocolate;
import DOPchocolateFactory.Factory;


public class Snickers extends Factory {
    @Override
    public Chocolate cooking(String item) {
        return switch (item) {
            case "nuts" -> new SnickersNuts();
            default -> null;
        };
    }
}
