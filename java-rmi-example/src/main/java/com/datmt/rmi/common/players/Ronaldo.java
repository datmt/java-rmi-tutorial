package com.datmt.rmi.common.players;

import java.io.Serializable;

public class Ronaldo implements Player, Serializable {
    @Override
    public String getName() {
        return "Ronaldo De Lima";
    }
}
