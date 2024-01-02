package org.legacy.gotham;

import java.util.Set;

public class RemoteHackingDevice implements BatGadget{
    @Override
    public void useFor(String situation) {
        System.out.println("Remote hacking device used successfully for " + situation);
    }
    @Override
    public Set<String> usefulSituations() {
        return Set.of("Hacking enemy's system");
    }
}
