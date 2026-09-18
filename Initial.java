import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Player {
    private final String name;
    private final int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class ScoreBoard {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        players.add(new Player("Alice", 950));
        players.add(new Player("Brian", 820));
        players.add(new Player("Clara", 1100));
        players.add(new Player("David", 760));

        players.sort(Comparator.comparingInt(Player::getScore).reversed());

        System.out.println("Score Board");
        System.out.println("===========");

        int position = 1;

        for (Player player : players) {
            System.out.printf(
                "%d. %s | %d points%n",
                position,
                player.getName(),
                player.getScore()
            );
            position++;
        }
    }
}