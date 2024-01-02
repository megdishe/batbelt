package org.legacy.gotham;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Getter
@Builder
public class BatmanBelt {
    private final Batarang batarang;
    private final SmokePellet smokePellet;
    private final RemoteHackingDevice remoteHackingDevice;
    private final LineLauncher lineLauncher;

    public void useAppropriateGadget(String situation) {
        if (Objects.nonNull(batarang)
                && batarang.usefulSituations().contains(situation)) {
            batarang.useFor(situation);
        } else if (Objects.nonNull(smokePellet) 
                && smokePellet.usefulSituations().contains(situation)) {
            smokePellet.useFor(situation);
        } else if (Objects.nonNull(remoteHackingDevice) 
                && remoteHackingDevice.usefulSituations().contains(situation)) {
            remoteHackingDevice.useFor(situation);
        } else if (Objects.nonNull(lineLauncher)  
                && lineLauncher.usefulSituations().contains(situation)) {
            lineLauncher.useFor(situation);
        } else {
            throw new RuntimeException("Cannot handle situation return to the bat cave");
        }
    }
}