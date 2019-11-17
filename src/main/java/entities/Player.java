package entities;

import java.util.Set;

/**
 * This class represents a real Player, who moves its Pawns on Zones and consumes Resources
 * according to Rules.
 */
public class Player {

    private static int counter = 0; // Counts the number of players dynamically

    public final int id; // Unique ID of this player
    public final String name; // The pseudo of this player in the game
    private Resources resources = new Resources(); // The resources this player can consume

    public Player(final String name) {
        this.name = name;
        id = counter++;
        initResources();
    }

    /**
     * Get the total number of players
     */
    public static int getNbPlayers() {
        return counter;
    }

    // Put the algo you want to initialize the resources of a given player (randomly, only some resources, ...)
    private void initResources() {
        Set<RESOURCE> keys = resources.keySet();
        for (RESOURCE r : keys)
            resources.put(r, 1);
    }

    /**
     * Get the value associated to a given resource
     *
     * @param r the resource key
     * @return the value or 0 if not found
     */
    public Integer getValue(RESOURCE r) {
        return resources.getOrDefault(r, 0);
    }
}
