package org.gotham;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BatmanBeltTest {

    @Test
    @DisplayName("Should fail to access high area without the line launcher")
    public void shouldFailToAccessHighArea() {
        BatmanBelt batmanBelt = BatmanBelt.builder()
                .batGadgets(Set.of(
                        BatGadget.BATARANG,
                        BatGadget.SMOKE_PELLET,
                        BatGadget.REMOTE_HACKING_DEVICE))
                .build();

        assertThatThrownBy(() -> batmanBelt.useAppropriateGadget(Situation.ACCESS_HIGH_AREAS))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Cannot handle situation return to the bat cave");
    }


}
