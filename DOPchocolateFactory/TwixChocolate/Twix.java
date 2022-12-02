package DOPchocolateFactory.TwixChocolate;


import DOPchocolateFactory.Chocolate;
import DOPchocolateFactory.Factory;

public class Twix extends Factory {

    @Override
    public Chocolate cooking(String item) {
        return switch (item) {
            case "left stick" -> new TwixLeftStick();
            case "right stick" -> new TwixRightStick();
            default -> null;
        };
    }
}
