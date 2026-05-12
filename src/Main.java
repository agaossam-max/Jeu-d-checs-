public class Main {
    public static void main(String[] args) {

        Position cible = new Position(3, 3);

        Reine maReine = new Reine();

        maReine.row = 1;
        maReine.column = 1;

        if (maReine.isValidMove(cible)) {
            System.out.println("Déplacement valide !");
        } else {
            System.out.println("Déplacement impossible.");
        }
    }
}