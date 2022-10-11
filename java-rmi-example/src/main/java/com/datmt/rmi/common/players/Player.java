package com.datmt.rmi.common.players;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Player extends Remote {
    String getName() throws RemoteException;
}
