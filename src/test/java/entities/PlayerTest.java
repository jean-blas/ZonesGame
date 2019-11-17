package entities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    private static Player player1, player2;
    private static String jb = "JB", jacou = "Jacou";

    @BeforeAll
    static void setUp() {
        player1 = new Player(jb);
        player2 = new Player(jacou);
    }

    @Test
    void testIds() {
        assertEquals(player1.id, 0);
        assertEquals(player2.id, 1);
    }

    @Test
    void testNames() {
        assertEquals(player1.name, jb);
        assertEquals(player2.name, jacou);
    }

    @Test
    void testGetNbPlayers() {
        assertEquals(Player.getNbPlayers(), 2);
    }

    @Test
    void testGetValue() {
        for (RESOURCE r : RESOURCE.values())
            assertEquals(player1.getValue(r), 1);
    }
}
