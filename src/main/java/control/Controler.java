package control;

import entities.Player;
import entities.RESOURCE;
import entities.Zon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

final class Controler {

    private static final Logger log = Logger.getLogger(Controler.class.getName());
    public static final String END = "end";

    // No need to have a constructor since all methods should be static here
    private Controler() {
    }

    /**
     * Initialize the zones
     *
     * @param seats number of free seats per zone
     * @return the array of zones
     */
    static Zon[] initZones(final int seats) {
        Zon[] zons = new Zon[RESOURCE.values().length];
        int i = 0;
        for (RESOURCE r : RESOURCE.values())
            zons[i++] = new Zon(seats, r);
        log.info(String.format("Created %d zones", zons.length));
        return zons;
    }

    /**
     * Initialize the players
     *
     * @return the array of Players ready to play
     */
    static Player[] initPlayers() {
        List<Player> lp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name (or " + END + " to finish):");
            String s = sc.nextLine();
            if (s.contentEquals(END))
                break;
            if (!s.trim().isEmpty())
                lp.add(new Player(s.trim()));
        }
        Player[] ap = new Player[lp.size()];
        lp.toArray(ap);
        log.info(String.format("Created %d players", ap.length));
        return ap;
    }
}
