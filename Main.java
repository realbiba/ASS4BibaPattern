public class Main {
    public static void main(String[] args) {
        Factory factorySportsman = new FactorySportsman();
        Sportsman BasketballPlayer = factorySportsman.createBasketballPlayer();
        Sportsman Swimmer = factorySportsman.createSwimmer();
        Sportsman Boxer = factorySportsman.createBoxer();

        BasketballPlayer.action();
        Swimmer.action();
        Boxer.action();
    }
}
