package org.gotham;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static org.gotham.Situation.ACCESS_HIGH_AREAS;
import static org.gotham.Situation.ARIAL_ATTACK;
import static org.gotham.Situation.CONFUSE;
import static org.gotham.Situation.COVER;
import static org.gotham.Situation.HACK;
import static org.gotham.Situation.INTERACT_REMOTELY;
import static org.gotham.Situation.STUN;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum BatGadget {
    BATARANG(Set.of(STUN, INTERACT_REMOTELY)::contains,
            situation -> System.out.println("Batarang used successfully for " + situation.getDescription())),
    LINE_LAUNCHER(Set.of(ACCESS_HIGH_AREAS, ARIAL_ATTACK)::contains,
            situation -> System.out.println("Line Launcher used successfully for " + situation.getDescription())),
    SMOKE_PELLET(Set.of(COVER, CONFUSE)::contains,
            situation -> System.out.println("Smoke pellet successfully for " + situation.getDescription())),
    REMOTE_HACKING_DEVICE(Set.of(HACK)::contains,
            situation -> System.out.println("Remote hacking device used successfully for " + situation.getDescription()));

    private final Predicate<Situation> usefulSituationPredicate;
    private final Consumer<Situation> useFor;

}
