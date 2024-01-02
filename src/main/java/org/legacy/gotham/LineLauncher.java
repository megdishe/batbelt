package org.legacy.gotham;

import java.util.Set;

public class LineLauncher implements BatGadget {
    @Override
    public void useFor(String situation) {
        System.out.println("Line launcher used successfully for " + situation);
    }
    @Override
    public Set<String> usefulSituations() {
        return Set.of("Access high areas", "Aerial Attack");
    }
}