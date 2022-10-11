package com.datmt.rmi.server;

import com.datmt.rmi.common.players.Kaka;
import com.datmt.rmi.common.players.Ronaldo;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {

    public RMIServer() throws RemoteException {

    }

    public static void main(String[] args) throws Exception {

        System.out.println("Start RMI Server");

        var kaka = new Kaka();
        var ronaldo = new Ronaldo();
        try { //special exception handler for registry creation

            var kakaRemote = UnicastRemoteObject.exportObject(kaka, 0);
            var ronaldoRemote = UnicastRemoteObject.exportObject(ronaldo, 0);
            Registry reg;
            try {
                reg = LocateRegistry.createRegistry(3099);
                System.out.println("java RMI registry created.");

            } catch (Exception e) {
                System.out.println("Using existing registry");
                reg = LocateRegistry.getRegistry();
            }

            reg.rebind("ronaldo", ronaldoRemote);
            reg.rebind("kaka", kakaRemote);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
