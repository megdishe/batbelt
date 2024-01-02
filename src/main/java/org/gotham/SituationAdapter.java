package org.gotham;

import java.util.Arrays;
import java.util.Random;

public enum SituationAdapter {
    INSTANCE;

    public Situation detectSituation() {
        Random random = new Random(Situation.values().length);
        return Arrays
                .asList(Situation.values()).get(random.nextInt());
    }

}
