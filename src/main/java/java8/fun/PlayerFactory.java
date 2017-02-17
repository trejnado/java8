package java8.fun;

import java8.fun.Player.Position;

import java.util.HashSet;
import java.util.Set;

public class PlayerFactory {

    public static Set<Player> newDreamTeam() {
        Set<Player> players = new HashSet<>();
        players.add(createShaq());
        players.add(createMalone());
        players.add(createPippen());
        players.add(createJordan());
        players.add(createStockton());
        return players;
    }

    private static Player createJordan() {
        Player player = new Player();
        player.setAssists(5);
        player.setName("Michael Jordan");
        player.setPoints(33);
        player.setPosition(Position.SG);
        return player;
    }

    private static Player createShaq() {
        Player player = new Player();
        player.setAssists(1);
        player.setName("Shaq");
        player.setPoints(30);
        player.setPosition(Position.C);
        return player;
    }

    private static Player createMalone() {
        Player player = new Player();
        player.setAssists(2);
        player.setName("Karl Malone");
        player.setPoints(25);
        player.setPosition(Position.PF);
        return player;
    }

    private static Player createPippen() {
        Player player = new Player();
        player.setAssists(2);
        player.setName("Scottie Pippen");
        player.setPoints(23);
        player.setPosition(Position.SF);
        return player;
    }

    private static Player createStockton() {
        Player player = new Player();
        player.setAssists(12);
        player.setName("Stockton");
        player.setPoints(14);
        player.setPosition(Position.PG);
        return player;
    }
}
