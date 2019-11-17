package entities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ZonTest {

    private static Zon[] zons;

    @BeforeAll
    static void setUp() {
        zons = new Zon[RESOURCE.values().length];
        int i = 0;
        for (RESOURCE r : RESOURCE.values()) {
            zons[i++] = new Zon(3, r);
        }
    }

    @Test
    void getOccupancy() {
        for (Zon z : zons)
            assertEquals(0, z.getOccupancy());
    }

    @Test
    void add() {
        boolean ok1 = zons[1].add(5);
        assertTrue(ok1);
        assertEquals(1, zons[1].getOccupancy());
        boolean ok2 = zons[1].add(2);
        assertTrue(ok2);
        assertEquals(2, zons[1].getOccupancy());
        assertEquals(0, zons[0].getOccupancy());
    }

    @Test
    void remove() {
        boolean ok1 = zons[0].add(5);
        assertTrue(ok1);
        ok1 = zons[0].add(3);
        assertTrue(ok1);
        ok1 = zons[0].add(5);
        assertTrue(ok1);
        assertEquals(3, zons[0].getOccupancy());

        int occ = zons[0].remove(3);
        assertEquals(1, occ);
        assertEquals(2, zons[0].getOccupancy());

        occ = zons[0].remove(5);
        assertEquals(2, occ);
        assertEquals(0, zons[0].getOccupancy());
    }
}
