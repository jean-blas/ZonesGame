package entities;

import java.util.HashMap;

public class Resources extends HashMap<RESOURCE, Integer> {

    public Resources() {
        super();
        for (RESOURCE r : RESOURCE.values())
            this.put(r, 0);
    }

    /**
     * Sum all values
     */
    public int sum() {
        return this.values().stream().mapToInt(Integer::intValue).sum();
    }
}
