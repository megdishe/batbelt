package org.legacy.gotham;

import org.gotham.Situation;

import java.util.Arrays;
import java.util.Random;

public class LegacySituationAdapter {
    private static volatile LegacySituationAdapter instance;

    private LegacySituationAdapter() {
    }

    public static LegacySituationAdapter getInstance() {
        if (instance == null) {
            synchronized (LegacySituationAdapter.class) {
                if (instance == null)
                    instance = new LegacySituationAdapter();
            }
        }
        return instance;
    }

    public Situation detectSituation() {
        Random random = new Random(Situation.values().length);
        return Arrays
                .asList(Situation.values()).get(random.nextInt());
    }

}
