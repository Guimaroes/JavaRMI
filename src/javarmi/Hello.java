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
public interface Hello extends Remote {
    public String hello() throws RemoteException;
}
