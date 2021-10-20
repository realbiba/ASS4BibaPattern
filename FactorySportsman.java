public class FactorySportsman implements Factory{
    @Override
    public Sportsman createBasketballPlayer() {
        return new BasketballPlayer();
    }

    @Override
    public Sportsman createSwimmer() {
        return new Swimmer();
    }

    @Override
    public Sportsman createBoxer() {
        return new Boxer();
    }
}
