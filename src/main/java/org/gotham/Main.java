package org.gotham;

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
        batmanBelt.useAppropriateGadget(Situation.COVER);
        batmanBelt.useAppropriateGadget(Situation.ACCESS_HIGH_AREAS);
        batmanBelt.useAppropriateGadget(Situation.STUN);
        batmanBelt.useAppropriateGadget(Situation.HACK);
    }

}