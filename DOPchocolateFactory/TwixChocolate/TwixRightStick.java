package DOPchocolateFactory.TwixChocolate;

import DOPchocolateFactory.Chocolate;

public class TwixRightStick extends Chocolate {
    public TwixRightStick() {

        name = "Twix right stick";
        cookies = "shortbread cookies";
        filling = "boiled condensed milk and chocolate";
    }

    public void cooking() {
        System.out.println("prepare from the bottom up");
    }
}
