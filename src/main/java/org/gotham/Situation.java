package org.gotham;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Situation {

    STUN("Stun enemies"),
    INTERACT_REMOTELY("interact with remote objects"),
    ACCESS_HIGH_AREAS("Access high areas"),
    ARIAL_ATTACK("Aerial Attack"),
    CONFUSE("Confuse enemies"),
    COVER("Cover to escape"),
    HACK("Hacking enemy's system");

    private final String description;

}
