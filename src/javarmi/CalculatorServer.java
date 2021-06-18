/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

/**
 *
 * @author Gabriel
 */
public class CalculatorServer extends UnicastRemoteObject implements Calculator {
    
    public CalculatorServer() throws RemoteException {
        super();
    }
    
    @Override
    public long add(long a, long b) throws RemoteException {
        return a + b;
    }
    
    public static void main(String args[]) {
        try {
            Registry registry = LocateRegistry.createRegistry(1010);
            CalculatorServer obj = new CalculatorServer();
            registry.bind("add", obj);
            System.out.println("Calculator server on");
        } catch (AlreadyBoundException | RemoteException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

