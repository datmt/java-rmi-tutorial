package com.datmt.rmi.client;


import com.datmt.rmi.common.players.Player;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String args[]) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 3099);

        var ronaldo = (Player) registry.lookup("ronaldo");
        var kaka = (Player) registry.lookup("kaka");

        System.out.println(ronaldo.getName());
        System.out.println(kaka.getName());
    }
}