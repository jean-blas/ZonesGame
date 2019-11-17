package control;

import entities.RESOURCE;
import entities.Zon;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ControlerTest {

    @Test
    void initZones() {
        Zon[] zons = Controler.initZones(5);
        assertNotNull(zons);
        assertEquals(RESOURCE.values().length, zons.length);
        Set<RESOURCE> res = new HashSet<>();
        for (Zon z : zons) {
            assertNotNull(z);
            assertEquals(0, z.getOccupancy());
            assertNotNull(z.resource);
            assertTrue(res.add(z.resource));
        }
    }

    @Test
    void initPlayers() {
//        final String[] names = {"JB", "jacou"};
//        Scanner scm = mock(Scanner.class);
//        when(scm.nextLine()).thenReturn(names[0], names[1], Controler.END);
//        Player[] players = Controler.initPlayers();
//        assertNotNull(players);
//        assertEquals(names.length, players.length);
//        int i = 0;
//        for (Player p : players) {
//            assertNotNull(p);
//            assertEquals(names[i++], p.name);
//        }
    }
}
