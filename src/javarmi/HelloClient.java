/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.net.MalformedURLException;
import java.rmi.*;

/**
 *
 * @author Gabriel
 */
public class HelloClient {
    public static void main(String args[]) {
        try {
            Hello hello = (Hello) Naming.lookup("//localhost:1010/hello");
            String message = hello.hello();
            System.out.println("RMI server message: \"" + message + "\"");
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.out.println("HelloClient exception: " + e.getMessage());
        }
    }
}
