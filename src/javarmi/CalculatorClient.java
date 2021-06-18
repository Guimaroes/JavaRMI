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
public class CalculatorClient {    
    public static void main(String args[]) {
        try {
            Calculator obj = (Calculator)Naming.lookup("//localhost:1010/add");
            Long result = obj.add(10,7);
            System.out.println("RMI server message: \"Result = " + result + "\"");
        }
        catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.out.println("CalculatorClient exception: " + e.getMessage());
        }
    }
}
