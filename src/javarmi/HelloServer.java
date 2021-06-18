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
public class HelloServer extends UnicastRemoteObject implements Hello {
    
    public HelloServer() throws RemoteException {
        super();
    }
    
    @Override
    public String hello() {
        System.out.println("Invocation to Hello was succesful!");
        return "Hello World from RMI server!";
    }
    
    public static void main(String args[]) {
        try {
            Registry registry = LocateRegistry.createRegistry(1010);
            HelloServer obj = new HelloServer();
            registry.bind("hello", obj);
            System.out.println("Hello server on");
        } catch (AlreadyBoundException | RemoteException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
