package DOPchocolateFactory;

public abstract class Chocolate {

    public String name;
    public String cookies;
    public String filling;

    public void prepare() {
        System.out.println("Prepare " + name);
    }

    public void cooking() {
        System.out.println("cooking");
    }

    public void packaging() {
        System.out.println("packaging");
    }

    public String getName() {
        return name;
    }

}
