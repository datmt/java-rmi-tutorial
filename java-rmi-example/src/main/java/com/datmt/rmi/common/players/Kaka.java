package com.datmt.rmi.common.players;

import java.io.Serializable;

public class Kaka implements Player, Serializable {
    @Override
    public String getName() {
        return "Ricardo Kaka";
    }
}
