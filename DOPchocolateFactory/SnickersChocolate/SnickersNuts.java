package DOPchocolateFactory.SnickersChocolate;

import DOPchocolateFactory.Chocolate;

public class SnickersNuts extends Chocolate {
    public SnickersNuts() {
        name = "Snickers nuts";
        cookies = "shortbread cookies";
        filling = "nut nougat";
    }

    public void packaging() {
        System.out.println("green packaging");
    }
}
