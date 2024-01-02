package org.gotham;

import java.util.Arrays;
import java.util.Random;

public enum SituationAdapter {
    INSTANCE;

    public Situation detectSituation() {
        final int length = Situation.values().length;
        return Arrays
                .asList(Situation.values())
                .get(new Random().nextInt(length));
    }

}
