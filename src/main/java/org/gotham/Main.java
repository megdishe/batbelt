package org.gotham;

import java.util.Set;

import static org.gotham.BatGadget.BATARANG;
import static org.gotham.BatGadget.LINE_LAUNCHER;
import static org.gotham.BatGadget.SMOKE_PELLET;

public class Main {

    public static void main(String[] args) {
        BatmanBelt batmanBelt = BatmanBelt.builder()
                .batGadgets(Set.of(BATARANG, LINE_LAUNCHER, SMOKE_PELLET))
                .build();
        batmanBelt.useAppropriateGadget(Situation.COVER);
    }

}