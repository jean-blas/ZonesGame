package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResourcesTest {

    @Test
    void sum() {
        Resources r = new Resources();
        assertEquals(0, r.sum());
    }
}
