/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.rmi.*;

/**
 *
 * @author Gabriel
 */
public interface Calculator extends Remote {
    public long add(long a, long b) throws RemoteException;
}
