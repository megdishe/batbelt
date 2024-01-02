package org.legacy.gotham;

public class Main {

    public static void main(String[] args) {
        BatmanBelt batmanBelt = BatmanBelt.builder()
                .batarang(new Batarang())
                .lineLauncher(new LineLauncher())
                .remoteHackingDevice(new RemoteHackingDevice())
                .smokePellet(new SmokePellet())
                .build();
        batmanBelt.useAppropriateGadget("Access high areas");
        batmanBelt.useAppropriateGadget("Stun enemies");
        batmanBelt.useAppropriateGadget("Confuse enemies");
        batmanBelt.useAppropriateGadget("Hacking enemy's system");
    }

}