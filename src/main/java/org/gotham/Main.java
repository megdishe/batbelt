package org.gotham;

import org.legacy.gotham.LegacySituationAdapter;

import java.util.Set;

import static org.gotham.BatGadget.BATARANG;
import static org.gotham.BatGadget.LINE_LAUNCHER;
import static org.gotham.BatGadget.REMOTE_HACKING_DEVICE;
import static org.gotham.BatGadget.SMOKE_PELLET;

public class Main {

    public static void main(String[] args) {
        BatmanBelt batmanBelt = BatmanBelt.builder()
                .batGadgets(Set.of(BatGadget.values()))
                .build();
        final Situation situation = LegacySituationAdapter.getInstance().detectSituation();
        batmanBelt.useAppropriateGadget(situation);
    }

}