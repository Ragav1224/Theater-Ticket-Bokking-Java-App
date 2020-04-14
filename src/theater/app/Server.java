/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater.app;

/**
 *
 * @author S.Ragawender
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    //Hashmaps for store datas in server
    public static HashMap<String, Integer> day1Show1= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day1Show2= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day2Show1= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day2Show2= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day3Show2= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day3Show1= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day4Show1= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day4Show2= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day5Show1= new HashMap<String, Integer>();
    public static HashMap<String, Integer> day5Show2= new HashMap<String, Integer>();
    
    

    public static int SERVER_PORT = 5257;  
    private int counter = 0;

    // Helper method to get the ServerSocket started      
    private ServerSocket goOnline() {
        day1Show1.clear();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("SERVER online");
        } catch (IOException e) {
            System.out.println("SERVER: Error creating network connection");
        }
        return serverSocket;
    }

    // recieve data , make decision , send data and store data     
    private void serverOperation(ServerSocket serverSocket) {
        while (true) {
            Socket socket = null;
            BufferedReader in = null;
            PrintWriter out = null;

            try {
                // Wait for incomming
                socket = serverSocket.accept();
                // connection made            
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream());
            } catch (IOException e) {
                System.out.println("SERVER: Error connecting to client");
                System.exit(-1);
            }

            // Read and handle the request from client              
            try {
                String request = in.readLine();
                
                String [] strArr = request.split("\\s+");
                
                System.out.println("SERVER: Client Message Received: " + request);
                switch (Integer.parseInt(strArr[2])){
                    case 1:
                        if(strArr[0].equals("C")){
                            if (day1Show1.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day1Show1.put(strArr[1], 1);
                                System.out.println();
                        }else{
                                 day1Show1.clear();
                           }
                        break;
                    case 2:
                        if(strArr[0].equals("C")){
                            if (day1Show2.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day1Show2.put(strArr[1], 1);
                        }else{
                                 day1Show2.clear();
                           }
                        break;
                    case 3:
                        if(strArr[0].equals("C")){
                            if (day2Show1.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day2Show1.put(strArr[1], 1);
                        }else{
                                 day2Show1.clear();
                           }
                        break;
                    case 4:
                        if(strArr[0].equals("C")){
                            if (day2Show2.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day2Show2.put(strArr[1], 1);
                        }else{
                                 day2Show2.clear();
                           }
                        break;
                    case 5:
                        if(strArr[0].equals("C")){
                            if (day3Show2.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day3Show2.put(strArr[1], 1);
                        }else{
                                 day3Show2.clear();
                           }
                        break;
                    case 6:
                        if(strArr[0].equals("C")){
                            if (day3Show1.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day3Show1.put(strArr[1], 1);
                        }else{
                                 day3Show1.clear();
                           }
                        break;
                    case 7:
                        if(strArr[0].equals("C")){
                            if (day4Show1.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day4Show1.put(strArr[1], 1);
                        }else{
                                 day4Show1.clear();
                           }
                        break;
                    case 8:
                        if(strArr[0].equals("C")){
                            if (day4Show2.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day4Show2.put(strArr[1], 1);
                        }else{
                                 day4Show2.clear();
                           }
                        break;
                    case 9:
                        if(strArr[0].equals("C")){
                            if (day5Show1.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day5Show1.put(strArr[1], 1);
                        }else{
                                 day5Show1.clear();
                           }
                        break;
                    case 10:
                        if(strArr[0].equals("C")){
                            if (day5Show2.containsKey(strArr[1])) {
                                out.println("true");
                                System.out.println("true");
                    
                            }else {
                                out.println("false");
                                System.out.println("true");
                            }
                        }else if(strArr[0].equals("S")){
                                day5Show2.put(strArr[1], 1);
                        }else{
                                 day5Show2.clear();
                           }
                        break;
                    default:
                        out.println("Show is not available....");
                        System.out.println("Show id not available...");
                }
                
                

                out.flush();           
                socket.close();    

            } catch (IOException e) {
                System.out.println("SERVER: Error communicating with client");
            }
        }
    }

    public static void main(String[] args) {
        Server s = new Server();
        
        ServerSocket ss = s.goOnline();
        if (ss != null) {
            
            s.serverOperation(ss);
        }
    }
}
