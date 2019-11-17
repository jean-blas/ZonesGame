package control;

import entities.Player;
import entities.Zon;

import java.util.logging.Logger;

public class Main {
    private static final int ZON_SEATS = 5; // Number of free seats per zone

    private static final Logger log = Logger.getLogger(Main.class.getName());
    private static Zon[] zones;
    private static Player[] players; // The real players

    public static void main(String... args) {
        zones = Controler.initZones(ZON_SEATS);
        players = Controler.initPlayers();
        if (players.length > 0)
            play();
    }

    private static void play() {
        // Put your algo here...
        log.info("Playing...");
    }
}
