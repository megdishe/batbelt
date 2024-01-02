package org.gotham;

import lombok.Builder;
import lombok.Getter;

import java.util.Set;

/**
 * @author m.megdishe@gmail.com
 * @version 1.0
 */
@Getter
@Builder
public class BatmanBelt {
    private final Set<BatGadget> batGadgets;

    public void useAppropriateGadget(Situation situation) {
        batGadgets.stream()
                .filter(batGadget -> batGadget.usefulSituationPredicate().test(situation))
                .findFirst()
                .ifPresentOrElse(batGadget -> batGadget.useFor().accept(situation),
                        () -> {
                            throw new RuntimeException(
                                    "Cannot handle situation return to the bat cave");
                        }
                );

    }
}
