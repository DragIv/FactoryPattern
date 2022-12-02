package DOPchocolateFactory.TwixChocolate;

import DOPchocolateFactory.Chocolate;

public class TwixLeftStick extends Chocolate {

    public TwixLeftStick() {
        name = "Twix left stick";
        cookies = "shortbread cookies";
        filling = "boiled condensed milk and chocolate";
    }

    public void cooking() {
        System.out.println("it is prepared from top to bottom");
    }
}
