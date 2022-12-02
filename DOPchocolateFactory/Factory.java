package DOPchocolateFactory;

public abstract class Factory {

    public abstract Chocolate cooking(String item);
    // для того чтобы все шоколады делались по своему

    public Chocolate chocolateSelection(String type) {

        Chocolate chocolate = cooking(type); //управление передается одному из субклассов
        chocolate.cooking();
        chocolate.packaging();

        return chocolate;
    }
}
