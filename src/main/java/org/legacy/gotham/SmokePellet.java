package org.legacy.gotham;

import java.util.Set;

public class SmokePellet implements BatGadget{
    @Override
    public void useFor(String situation) {
        System.out.println("Smoke pellet used successfully for " + situation);
    }
    @Override
    public Set<String> usefulSituations() {
        return Set.of("Confuse enemies", "Cover to escape");
    }
}

