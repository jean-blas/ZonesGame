package entities;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Represents a region of the board where Players can drop Pawns, according to the remaining places.
 * When a place is filled, it contains the player ID. Several places can be filled with the same ID.
 * A Zone contains a Resource that Players want.
 */
public class Zon {

    private static final int NOID = -1; // Empty player ID value

    private final int[] playerIds; // Available places for player pawns
    public final RESOURCE resource; // The associated resource this zone can give to the player

    /**
     * Create a zone with nbSeats available places and a given Resource.
     *
     * @param nbSeats  number of places for the player pawns
     * @param resource the resource available in this zone
     */
    public Zon(final int nbSeats, final RESOURCE resource) {
        this.playerIds = new int[nbSeats];
        Arrays.fill(this.playerIds, NOID);
        this.resource = resource;
    }

    /**
     * Get the number of pawns (i.e. number of occupied places)
     */
    public int getOccupancy() {
        return (int) IntStream.of(playerIds).filter(x -> x != NOID).count();
    }

    /**
     * Add a pawn.
     *
     * @param pId the player ID.
     * @return true if the player has been added successfully, false otherwise (no more place)
     */
    public boolean add(final int pId) {
        for (int i = 0; i < playerIds.length; i++)
            if (playerIds[i] == NOID) {
                playerIds[i] = pId;
                return true;
            }
        return false;
    }

    /**
     * Remove all pawns that belong to the given player ID
     *
     * @param pId the player ID
     * @return the number of occurrences removed
     */
    public int remove(final int pId) {
        int nbOccurences = 0;
        for (int i = 0; i < playerIds.length; i++)
            if (playerIds[i] == pId) {
                nbOccurences++;
                playerIds[i] = NOID;
            }
        return nbOccurences;
    }
}
