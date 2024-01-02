package org.legacy.gotham;

import java.util.Set;

public class Batarang implements BatGadget{
    @Override
    public void useFor(String situation) {
       System.out.println("Batarang used successfully for " + situation);
    }
    @Override
    public Set<String> usefulSituations() {
        return Set.of("Stun enemies", "interact with remote objects");
    }
}