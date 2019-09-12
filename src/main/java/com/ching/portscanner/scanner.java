/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ching.portscanner;
import java.util.Scanner;
import java.io.*;
import java.net.*;


/**
 *
 * @author h-a-c
 */
public class scanner {
    //Variables
    private Socket socket;
    private int port;
    
    public String getHost() {
        //Unneeded code. Kept for legacy reasons
        System.out.println("Host or IP: ");
        Scanner input = new Scanner(System.in);
        String input_host = input.nextLine();
        return input_host;
    }
    
    public int getPort() {
        System.out.println("Port: ");
        Scanner input = new Scanner(System.in);
        int input_host = input.nextInt();
        return input_host;
    }
    
    public String setUpSocket(String host, int port) {
        try{
            Socket socket = new Socket(host, port);   
            return "Open";
        } catch(UnknownHostException u) {
            return u.toString();
        } catch(IOException i) {
            return i.toString();
        }
    }
}
