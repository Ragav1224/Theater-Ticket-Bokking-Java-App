/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater.app;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author S.Ragawender
 */
public class BookingPage extends javax.swing.JFrame {

    //client programm
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public void connectToServer() {
        try {
            socket = new Socket(InetAddress.getLocalHost(), Server.SERVER_PORT);

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            System.out.println("CLIENT: Cannot connect to server");
            System.exit(-1);
        }
    }

    // Disconnect from the server     
    public void disconnectFromServer() {
        try {
            socket.close();
        } catch (IOException e) {
            System.out.println("CLIENT: Cannot disconnect from server");
        }
    }

    //To check initial conditions. It will run wen this window called by previous window
    //it will check whether sheets booked or not and mark the seat colours
    public void intitial() {
        connectToServer();
        isS11Sold = askIsSold("C isS11Sold " + movieSel);
        connectToServer();
        isS12Sold = askIsSold("C isS12Sold " + movieSel);
        connectToServer();
        isS13Sold = askIsSold("C isS13Sold " + movieSel);
        connectToServer();
        isS14Sold = askIsSold("C isS14Sold " + movieSel);
        connectToServer();
        isS15Sold = askIsSold("C isS15Sold " + movieSel);
        connectToServer();
        isS16Sold = askIsSold("C isS16Sold " + movieSel);
        connectToServer();
        isS17Sold = askIsSold("C isS17Sold " + movieSel);
        connectToServer();
        isS18Sold = askIsSold("C isS18Sold " + movieSel);
        connectToServer();
        isS19Sold = askIsSold("C isS19Sold " + movieSel);
        connectToServer();
        isS1_10Sold = askIsSold("C isS1_10Sold " + movieSel);

        connectToServer();
        isS21Sold = askIsSold("C isS21Sold " + movieSel);
        connectToServer();
        isS22Sold = askIsSold("C isS22Sold " + movieSel);
        connectToServer();
        isS23Sold = askIsSold("C isS23Sold " + movieSel);
        connectToServer();
        isS24Sold = askIsSold("C isS24Sold " + movieSel);
        connectToServer();
        isS25Sold = askIsSold("C isS25Sold " + movieSel);
        connectToServer();
        isS26Sold = askIsSold("C isS26Sold " + movieSel);
        connectToServer();
        isS27Sold = askIsSold("C isS27Sold " + movieSel);
        connectToServer();
        isS28Sold = askIsSold("C isS28Sold " + movieSel);
        connectToServer();
        isS29Sold = askIsSold("C isS29Sold " + movieSel);
        connectToServer();
        isS2_10Sold = askIsSold("C isS2_10Sold " + movieSel);

        connectToServer();
        isS41Sold = askIsSold("C isS41Sold " + movieSel);
        connectToServer();
        isS42Sold = askIsSold("C isS42Sold " + movieSel);
        connectToServer();
        isS43Sold = askIsSold("C isS43Sold " + movieSel);
        connectToServer();
        isS44Sold = askIsSold("C isS44Sold " + movieSel);
        connectToServer();
        isS45Sold = askIsSold("C isS45Sold " + movieSel);
        connectToServer();
        isS46Sold = askIsSold("C isS46Sold " + movieSel);
        connectToServer();
        isS47Sold = askIsSold("C isS47Sold " + movieSel);
        connectToServer();
        isS48Sold = askIsSold("C isS48Sold " + movieSel);
        connectToServer();
        isS49Sold = askIsSold("C isS49Sold " + movieSel);
        connectToServer();
        isS4_10Sold = askIsSold("C isS4_10Sold " + movieSel);

        connectToServer();
        isS51Sold = askIsSold("C isS51Sold " + movieSel);
        connectToServer();
        isS52Sold = askIsSold("C isS52Sold " + movieSel);
        connectToServer();
        isS53Sold = askIsSold("C isS53Sold " + movieSel);
        connectToServer();
        isS54Sold = askIsSold("C isS54Sold " + movieSel);
        connectToServer();
        isS55Sold = askIsSold("C isS55Sold " + movieSel);
        connectToServer();
        isS56Sold = askIsSold("C isS56Sold " + movieSel);
        connectToServer();
        isS57Sold = askIsSold("C isS57Sold " + movieSel);
        connectToServer();
        isS58Sold = askIsSold("C isS58Sold " + movieSel);
        connectToServer();
        isS59Sold = askIsSold("C isS59Sold " + movieSel);
        connectToServer();
        isS5_10Sold = askIsSold("C isS5_10Sold " + movieSel);

        connectToServer();
        isS61Sold = askIsSold("C isS61Sold " + movieSel);
        connectToServer();
        isS62Sold = askIsSold("C isS62Sold " + movieSel);
        connectToServer();
        isS63Sold = askIsSold("C isS63Sold " + movieSel);
        connectToServer();
        isS64Sold = askIsSold("C isS64Sold " + movieSel);
        connectToServer();
        isS65Sold = askIsSold("C isS65Sold " + movieSel);
        connectToServer();
        isS66Sold = askIsSold("C isS66Sold " + movieSel);
        connectToServer();
        isS67Sold = askIsSold("C isS67Sold " + movieSel);
        connectToServer();
        isS68Sold = askIsSold("C isS68Sold " + movieSel);
        connectToServer();
        isS69Sold = askIsSold("C isS69Sold " + movieSel);
        connectToServer();
        isS6_10Sold = askIsSold("C isS6_10Sold " + movieSel);

        connectToServer();
        isS71Sold = askIsSold("C isS71Sold " + movieSel);
        connectToServer();
        isS72Sold = askIsSold("C isS72Sold " + movieSel);
        connectToServer();
        isS73Sold = askIsSold("C isS73Sold " + movieSel);
        connectToServer();
        isS74Sold = askIsSold("C isS74Sold " + movieSel);
        connectToServer();
        isS75Sold = askIsSold("C isS75Sold " + movieSel);
        connectToServer();
        isS76Sold = askIsSold("C isS76Sold " + movieSel);
        connectToServer();
        isS77Sold = askIsSold("C isS77Sold " + movieSel);
        connectToServer();
        isS78Sold = askIsSold("C isS78Sold " + movieSel);
        connectToServer();
        isS79Sold = askIsSold("C isS79Sold " + movieSel);
        connectToServer();
        isS7_10Sold = askIsSold("C isS7_10Sold " + movieSel);

        connectToServer();
        isS81Sold = askIsSold("C isS81Sold " + movieSel);
        connectToServer();
        isS82Sold = askIsSold("C isS82Sold " + movieSel);
        connectToServer();
        isS83Sold = askIsSold("C isS83Sold " + movieSel);
        connectToServer();
        isS84Sold = askIsSold("C isS84Sold " + movieSel);
        connectToServer();
        isS85Sold = askIsSold("C isS85Sold " + movieSel);
        connectToServer();
        isS86Sold = askIsSold("C isS86Sold " + movieSel);
        connectToServer();
        isS87Sold = askIsSold("C isS87Sold " + movieSel);
        connectToServer();
        isS88Sold = askIsSold("C isS88Sold " + movieSel);
        connectToServer();
        isS89Sold = askIsSold("C isS89Sold " + movieSel);
        connectToServer();
        isS8_10Sold = askIsSold("C isS8_10Sold " + movieSel);

        connectToServer();
        isS91Sold = askIsSold("C isS91Sold " + movieSel);
        connectToServer();
        isS92Sold = askIsSold("C isS92Sold " + movieSel);
        connectToServer();
        isS93Sold = askIsSold("C isS93Sold " + movieSel);
        connectToServer();
        isS94Sold = askIsSold("C isS94Sold " + movieSel);
        connectToServer();
        isS95Sold = askIsSold("C isS95Sold " + movieSel);
        connectToServer();
        isS96Sold = askIsSold("C isS96Sold " + movieSel);
        connectToServer();
        isS97Sold = askIsSold("C isS97Sold " + movieSel);
        connectToServer();
        isS98Sold = askIsSold("C isS98Sold " + movieSel);
        connectToServer();
        isS99Sold = askIsSold("C isS99Sold " + movieSel);
        connectToServer();
        isS9_10Sold = askIsSold("C isS9_10Sold " + movieSel);

        connectToServer();
        isS10_1Sold = askIsSold("C isS10_1Sold " + movieSel);
        connectToServer();
        isS10_2Sold = askIsSold("C isS10_3Sold " + movieSel);
        connectToServer();
        isS10_3Sold = askIsSold("C isS10_3Sold " + movieSel);
        connectToServer();
        isS10_4Sold = askIsSold("C isS10_4Sold " + movieSel);
        connectToServer();
        isS10_5Sold = askIsSold("C isS10_5Sold " + movieSel);
        connectToServer();
        isS10_6Sold = askIsSold("C isS10_6Sold " + movieSel);
        connectToServer();
        isS10_7Sold = askIsSold("C isS10_7Sold " + movieSel);
        connectToServer();
        isS10_8Sold = askIsSold("C isS10_8Sold " + movieSel);
        connectToServer();
        isS10_9Sold = askIsSold("C isS10_9Sold " + movieSel);
        connectToServer();
        isS10_10Sold = askIsSold("C isS10_10Sold " + movieSel);

        sheetColor(s11, s11.isSelected(), isS11Sold);
        sheetColor(s12, s12.isSelected(), isS12Sold);
        sheetColor(s13, s13.isSelected(), isS13Sold);
        sheetColor(s14, s14.isSelected(), isS14Sold);
        sheetColor(s15, s15.isSelected(), isS15Sold);
        sheetColor(s16, s16.isSelected(), isS16Sold);
        sheetColor(s17, s17.isSelected(), isS17Sold);
        sheetColor(s18, s18.isSelected(), isS18Sold);
        sheetColor(s19, s19.isSelected(), isS19Sold);
        sheetColor(s1_10, s1_10.isSelected(), isS1_10Sold);

        sheetColor(s21, s21.isSelected(), isS21Sold);
        sheetColor(s22, s22.isSelected(), isS22Sold);
        sheetColor(s23, s23.isSelected(), isS23Sold);
        sheetColor(s24, s24.isSelected(), isS24Sold);
        sheetColor(s25, s25.isSelected(), isS25Sold);
        sheetColor(s26, s26.isSelected(), isS26Sold);
        sheetColor(s27, s27.isSelected(), isS27Sold);
        sheetColor(s28, s28.isSelected(), isS28Sold);
        sheetColor(s29, s29.isSelected(), isS29Sold);
        sheetColor(s2_10, s2_10.isSelected(), isS2_10Sold);

        sheetColor(s41, s41.isSelected(), isS41Sold);
        sheetColor(s42, s42.isSelected(), isS42Sold);
        sheetColor(s43, s43.isSelected(), isS43Sold);
        sheetColor(s44, s44.isSelected(), isS44Sold);
        sheetColor(s45, s45.isSelected(), isS45Sold);
        sheetColor(s46, s46.isSelected(), isS46Sold);
        sheetColor(s47, s47.isSelected(), isS47Sold);
        sheetColor(s48, s48.isSelected(), isS48Sold);
        sheetColor(s49, s49.isSelected(), isS49Sold);
        sheetColor(s4_10, s4_10.isSelected(), isS4_10Sold);

        sheetColor(s51, s51.isSelected(), isS51Sold);
        sheetColor(s52, s52.isSelected(), isS52Sold);
        sheetColor(s53, s53.isSelected(), isS53Sold);
        sheetColor(s54, s54.isSelected(), isS54Sold);
        sheetColor(s55, s55.isSelected(), isS55Sold);
        sheetColor(s56, s56.isSelected(), isS56Sold);
        sheetColor(s57, s57.isSelected(), isS57Sold);
        sheetColor(s58, s58.isSelected(), isS58Sold);
        sheetColor(s59, s59.isSelected(), isS59Sold);
        sheetColor(s5_10, s5_10.isSelected(), isS5_10Sold);

        sheetColor(s61, s61.isSelected(), isS61Sold);
        sheetColor(s62, s62.isSelected(), isS62Sold);
        sheetColor(s63, s63.isSelected(), isS63Sold);
        sheetColor(s64, s64.isSelected(), isS64Sold);
        sheetColor(s65, s65.isSelected(), isS65Sold);
        sheetColor(s66, s66.isSelected(), isS66Sold);
        sheetColor(s67, s67.isSelected(), isS67Sold);
        sheetColor(s68, s68.isSelected(), isS68Sold);
        sheetColor(s69, s69.isSelected(), isS69Sold);
        sheetColor(s6_10, s6_10.isSelected(), isS6_10Sold);

        sheetColor(s71, s71.isSelected(), isS71Sold);
        sheetColor(s72, s72.isSelected(), isS72Sold);
        sheetColor(s73, s73.isSelected(), isS73Sold);
        sheetColor(s74, s74.isSelected(), isS74Sold);
        sheetColor(s75, s75.isSelected(), isS75Sold);
        sheetColor(s76, s76.isSelected(), isS76Sold);
        sheetColor(s77, s77.isSelected(), isS77Sold);
        sheetColor(s78, s78.isSelected(), isS78Sold);
        sheetColor(s79, s79.isSelected(), isS79Sold);
        sheetColor(s7_10, s7_10.isSelected(), isS7_10Sold);

        sheetColor(s81, s81.isSelected(), isS81Sold);
        sheetColor(s82, s82.isSelected(), isS82Sold);
        sheetColor(s83, s83.isSelected(), isS83Sold);
        sheetColor(s84, s84.isSelected(), isS84Sold);
        sheetColor(s85, s85.isSelected(), isS85Sold);
        sheetColor(s86, s86.isSelected(), isS86Sold);
        sheetColor(s87, s87.isSelected(), isS87Sold);
        sheetColor(s88, s88.isSelected(), isS88Sold);
        sheetColor(s89, s89.isSelected(), isS89Sold);
        sheetColor(s8_10, s8_10.isSelected(), isS8_10Sold);

        sheetColor(s91, s91.isSelected(), isS91Sold);
        sheetColor(s92, s92.isSelected(), isS92Sold);
        sheetColor(s93, s93.isSelected(), isS93Sold);
        sheetColor(s94, s94.isSelected(), isS94Sold);
        sheetColor(s95, s95.isSelected(), isS95Sold);
        sheetColor(s96, s96.isSelected(), isS96Sold);
        sheetColor(s97, s97.isSelected(), isS97Sold);
        sheetColor(s98, s98.isSelected(), isS98Sold);
        sheetColor(s99, s99.isSelected(), isS99Sold);
        sheetColor(s9_10, s9_10.isSelected(), isS9_10Sold);

        sheetColor(s10_3, s10_3.isSelected(), isS10_3Sold);
        sheetColor(s10_4, s10_4.isSelected(), isS10_4Sold);
        sheetColor(s10_5, s10_5.isSelected(), isS10_5Sold);
        sheetColor(s10_6, s10_6.isSelected(), isS10_6Sold);
        sheetColor(s10_7, s10_7.isSelected(), isS10_7Sold);
        sheetColor(s10_8, s10_8.isSelected(), isS10_8Sold);

    }

    // Ask to the server whether the seat is sold or not?  
    public boolean askIsSold(String s) {
        boolean soldStatus = false;
        out.println(s);
        out.flush();
        try {
            String time = in.readLine();
            if (time.equals("true")) {
                soldStatus = true;
            } else {
                soldStatus = false;
            }
        } catch (IOException e) {
            System.out.println("Cannot receive time from server");
        }
        disconnectFromServer();
        return soldStatus;
    }

    // Send data to server when seat booked   
    public void saySold(String s) {
        connectToServer();
        out.println(s);
        out.flush();
        disconnectFromServer();
    }

    //-------------------------------------------------------------------------------------
    public int movieSel = 0;      //send the show(time and date) as a number to server
    int price = 0;                //total cost for seats.
    String seatName = "";         //for notify seat names

    //variables for check whether seat selected or not
    boolean isS11Select = false;   //Named seats as (is Seat row 1 colomn 1 selected?)
    boolean isS12Select = false;
    boolean isS13Select = false;
    boolean isS14Select = false;
    boolean isS15Select = false;
    boolean isS16Select = false;
    boolean isS17Select = false;
    boolean isS18Select = false;
    boolean isS19Select = false;
    boolean isS1_10Select = false;
    boolean isS21Select = false;
    boolean isS22Select = false;
    boolean isS23Select = false;
    boolean isS24Select = false;
    boolean isS25Select = false;
    boolean isS26Select = false;
    boolean isS27Select = false;
    boolean isS28Select = false;
    boolean isS29Select = false;
    boolean isS2_10Select = false;
    boolean isS41Select = false;
    boolean isS42Select = false;
    boolean isS43Select = false;
    boolean isS44Select = false;
    boolean isS45Select = false;
    boolean isS46Select = false;
    boolean isS47Select = false;
    boolean isS48Select = false;
    boolean isS49Select = false;
    boolean isS4_10Select = false;
    boolean isS51Select = false;
    boolean isS52Select = false;
    boolean isS53Select = false;
    boolean isS54Select = false;
    boolean isS55Select = false;
    boolean isS56Select = false;
    boolean isS57Select = false;
    boolean isS58Select = false;
    boolean isS59Select = false;
    boolean isS5_10Select = false;
    boolean isS61Select = false;
    boolean isS62Select = false;
    boolean isS63Select = false;
    boolean isS64Select = false;
    boolean isS65Select = false;
    boolean isS66Select = false;
    boolean isS67Select = false;
    boolean isS68Select = false;
    boolean isS69Select = false;
    boolean isS6_10Select = false;
    boolean isS71Select = false;
    boolean isS72Select = false;
    boolean isS73Select = false;
    boolean isS74Select = false;
    boolean isS75Select = false;
    boolean isS76Select = false;
    boolean isS77Select = false;
    boolean isS78Select = false;
    boolean isS79Select = false;
    boolean isS7_10Select = false;
    boolean isS81Select = false;
    boolean isS82Select = false;
    boolean isS83Select = false;
    boolean isS84Select = false;
    boolean isS85Select = false;
    boolean isS86Select = false;
    boolean isS87Select = false;
    boolean isS88Select = false;
    boolean isS89Select = false;
    boolean isS8_10Select = false;
    boolean isS91Select = false;
    boolean isS92Select = false;
    boolean isS93Select = false;
    boolean isS94Select = false;
    boolean isS95Select = false;
    boolean isS96Select = false;
    boolean isS97Select = false;
    boolean isS98Select = false;
    boolean isS99Select = false;
    boolean isS9_10Select = false;
    boolean isS10_1Select = false;
    boolean isS10_2Select = false;
    boolean isS10_3Select = false;
    boolean isS10_4Select = false;
    boolean isS10_5Select = false;
    boolean isS10_6Select = false;
    boolean isS10_7Select = false;
    boolean isS10_8Select = false;
    boolean isS10_9Select = false;
    boolean isS10_10Select = false;

    //variables for check whether seat sold or not
    boolean isS11Sold = false; //Named seats as (is Seat row 1 colomn 1 sold?)
    boolean isS12Sold = false;
    boolean isS13Sold = false;
    boolean isS14Sold = false;
    boolean isS15Sold = false;
    boolean isS16Sold = false;
    boolean isS17Sold = false;
    boolean isS18Sold = false;
    boolean isS19Sold = false;
    boolean isS1_10Sold = false;
    boolean isS21Sold = false;
    boolean isS22Sold = false;
    boolean isS23Sold = false;
    boolean isS24Sold = false;
    boolean isS25Sold = false;
    boolean isS26Sold = false;
    boolean isS27Sold = false;
    boolean isS28Sold = false;
    boolean isS29Sold = false;
    boolean isS2_10Sold = false;
    boolean isS41Sold = false;
    boolean isS42Sold = false;
    boolean isS43Sold = false;
    boolean isS44Sold = false;
    boolean isS45Sold = false;
    boolean isS46Sold = false;
    boolean isS47Sold = false;
    boolean isS48Sold = false;
    boolean isS49Sold = false;
    boolean isS4_10Sold = false;
    boolean isS51Sold = false;
    boolean isS52Sold = false;
    boolean isS53Sold = false;
    boolean isS54Sold = false;
    boolean isS55Sold = false;
    boolean isS56Sold = false;
    boolean isS57Sold = false;
    boolean isS58Sold = false;
    boolean isS59Sold = false;
    boolean isS5_10Sold = false;
    boolean isS61Sold = false;
    boolean isS62Sold = false;
    boolean isS63Sold = false;
    boolean isS64Sold = false;
    boolean isS65Sold = false;
    boolean isS66Sold = false;
    boolean isS67Sold = false;
    boolean isS68Sold = false;
    boolean isS69Sold = false;
    boolean isS6_10Sold = false;
    boolean isS71Sold = false;
    boolean isS72Sold = false;
    boolean isS73Sold = false;
    boolean isS74Sold = false;
    boolean isS75Sold = false;
    boolean isS76Sold = false;
    boolean isS77Sold = false;
    boolean isS78Sold = false;
    boolean isS79Sold = false;
    boolean isS7_10Sold = false;
    boolean isS81Sold = false;
    boolean isS82Sold = false;
    boolean isS83Sold = false;
    boolean isS84Sold = false;
    boolean isS85Sold = false;
    boolean isS86Sold = false;
    boolean isS87Sold = false;
    boolean isS88Sold = false;
    boolean isS89Sold = false;
    boolean isS8_10Sold = false;
    boolean isS91Sold = false;
    boolean isS92Sold = false;
    boolean isS93Sold = false;
    boolean isS94Sold = false;
    boolean isS95Sold = false;
    boolean isS96Sold = false;
    boolean isS97Sold = false;
    boolean isS98Sold = false;
    boolean isS99Sold = false;
    boolean isS9_10Sold = false;
    boolean isS10_1Sold = false;
    boolean isS10_2Sold = false;
    boolean isS10_3Sold = false;
    boolean isS10_4Sold = false;
    boolean isS10_5Sold = false;
    boolean isS10_6Sold = false;
    boolean isS10_7Sold = false;
    boolean isS10_8Sold = false;
    boolean isS10_9Sold = false;
    boolean isS10_10Sold = false;

    //method for check and set seat colours
    private boolean sheetColor(javax.swing.JToggleButton seat, boolean btnIsSelect, boolean isSold) {
        if (isSold) {
            seat.setBackground(Color.red);
            seat.setEnabled(false);
            return false;
        } else if (btnIsSelect) {
            seat.setBackground(Color.green);
            btnIsSelect = true;

            return true;

        } else {
            seat.setBackground(Color.gray);

            return false;

        }
    }

    //method for set colour after book and notify seats booked(sold)
    private boolean bookSheet(javax.swing.JToggleButton s, boolean btnIsSelect, boolean isSold) {
        if (btnIsSelect && !isSold) {
            s.setBackground(Color.red);
            isSold = true;
        }

        return isSold;
    }

    //method for call saySold method to send data to server for notify as sold
    public void soldMessage() {
        if (isS11Sold) {
            saySold("S isS11Sold " + movieSel);
        }
        if (isS12Sold) {
            saySold("S isS12Sold " + movieSel);
        }
        if (isS13Sold) {
            saySold("S isS13Sold " + movieSel);
        }
        if (isS14Sold) {
            saySold("S isS14Sold " + movieSel);
        }
        if (isS15Sold) {
            saySold("S isS15Sold " + movieSel);
        }
        if (isS16Sold) {
            saySold("S isS16Sold " + movieSel);
        }
        if (isS17Sold) {
            saySold("S isS17Sold " + movieSel);
        }
        if (isS18Sold) {
            saySold("S isS18Sold " + movieSel);
        }
        if (isS19Sold) {
            saySold("S isS19Sold " + movieSel);
        }
        if (isS1_10Sold) {
            saySold("S isS1_10Sold " + movieSel);
        }

        if (isS21Sold) {
            saySold("S isS21Sold " + movieSel);
        }
        if (isS22Sold) {
            saySold("S isS22Sold " + movieSel);
        }
        if (isS23Sold) {
            saySold("S isS23Sold " + movieSel);
        }
        if (isS24Sold) {
            saySold("S isS24Sold " + movieSel);
        }
        if (isS25Sold) {
            saySold("S isS25Sold " + movieSel);
        }
        if (isS26Sold) {
            saySold("S isS26Sold " + movieSel);
        }
        if (isS27Sold) {
            saySold("S isS27Sold " + movieSel);
        }
        if (isS28Sold) {
            saySold("S isS28Sold " + movieSel);
        }
        if (isS29Sold) {
            saySold("S isS29Sold " + movieSel);
        }
        if (isS2_10Sold) {
            saySold("S isS2_10Sold " + movieSel);
        }

        if (isS41Sold) {
            saySold("S isS41Sold " + movieSel);
        }
        if (isS42Sold) {
            saySold("S isS42Sold " + movieSel);
        }
        if (isS43Sold) {
            saySold("S isS43Sold " + movieSel);
        }
        if (isS44Sold) {
            saySold("S isS44Sold " + movieSel);
        }
        if (isS45Sold) {
            saySold("S isS45Sold " + movieSel);
        }
        if (isS46Sold) {
            saySold("S isS46Sold " + movieSel);
        }
        if (isS47Sold) {
            saySold("S isS47Sold " + movieSel);
        }
        if (isS48Sold) {
            saySold("S isS48Sold " + movieSel);
        }
        if (isS49Sold) {
            saySold("S isS49Sold " + movieSel);
        }
        if (isS4_10Sold) {
            saySold("S isS4_10Sold " + movieSel);
        }

        if (isS51Sold) {
            saySold("S isS51Sold " + movieSel);
        }
        if (isS52Sold) {
            saySold("S isS52Sold " + movieSel);
        }
        if (isS53Sold) {
            saySold("S isS53Sold " + movieSel);
        }
        if (isS54Sold) {
            saySold("S isS54Sold " + movieSel);
        }
        if (isS55Sold) {
            saySold("S isS55Sold " + movieSel);
        }
        if (isS56Sold) {
            saySold("S isS5Sold " + movieSel);
        }
        if (isS57Sold) {
            saySold("S isS57Sold " + movieSel);
        }
        if (isS58Sold) {
            saySold("S isS58Sold " + movieSel);
        }
        if (isS59Sold) {
            saySold("S isS59Sold " + movieSel);
        }
        if (isS5_10Sold) {
            saySold("S isS5_10Sold " + movieSel);
        }

        if (isS61Sold) {
            saySold("S isS61Sold " + movieSel);
        }
        if (isS62Sold) {
            saySold("S isS62Sold " + movieSel);
        }
        if (isS63Sold) {
            saySold("S isS63Sold " + movieSel);
        }
        if (isS64Sold) {
            saySold("S isS64Sold " + movieSel);
        }
        if (isS65Sold) {
            saySold("S isS65Sold " + movieSel);
        }
        if (isS66Sold) {
            saySold("S isS66Sold " + movieSel);
        }
        if (isS67Sold) {
            saySold("S isS67Sold " + movieSel);
        }
        if (isS68Sold) {
            saySold("S isS68Sold " + movieSel);
        }
        if (isS69Sold) {
            saySold("S isS69Sold " + movieSel);
        }
        if (isS6_10Sold) {
            saySold("S isS6_10Sold " + movieSel);
        }

        if (isS71Sold) {
            saySold("S isS71Sold " + movieSel);
        }
        if (isS72Sold) {
            saySold("S isS72Sold " + movieSel);
        }
        if (isS73Sold) {
            saySold("S isS73Sold " + movieSel);
        }
        if (isS74Sold) {
            saySold("S isS74Sold " + movieSel);
        }
        if (isS75Sold) {
            saySold("S isS75Sold " + movieSel);
        }
        if (isS76Sold) {
            saySold("S isS76Sold " + movieSel);
        }
        if (isS77Sold) {
            saySold("S isS77Sold " + movieSel);
        }
        if (isS78Sold) {
            saySold("S isS78Sold " + movieSel);
        }
        if (isS79Sold) {
            saySold("S isS79Sold " + movieSel);
        }
        if (isS7_10Sold) {
            saySold("S isS7_10Sold " + movieSel);
        }

        if (isS81Sold) {
            saySold("S isS81Sold " + movieSel);
        }
        if (isS82Sold) {
            saySold("S isS82Sold " + movieSel);
        }
        if (isS83Sold) {
            saySold("S isS83Sold " + movieSel);
        }
        if (isS84Sold) {
            saySold("S isS84Sold " + movieSel);
        }
        if (isS85Sold) {
            saySold("S isS85Sold " + movieSel);
        }
        if (isS86Sold) {
            saySold("S isS86Sold " + movieSel);
        }
        if (isS87Sold) {
            saySold("S isS87Sold " + movieSel);
        }
        if (isS88Sold) {
            saySold("S isS88Sold " + movieSel);
        }
        if (isS89Sold) {
            saySold("S isS89Sold " + movieSel);
        }
        if (isS8_10Sold) {
            saySold("S isS8_10Sold " + movieSel);
        }

        if (isS91Sold) {
            saySold("S isS91Sold " + movieSel);
        }
        if (isS92Sold) {
            saySold("S isS92Sold " + movieSel);
        }
        if (isS93Sold) {
            saySold("S isS93Sold " + movieSel);
        }
        if (isS94Sold) {
            saySold("S isS94Sold " + movieSel);
        }
        if (isS95Sold) {
            saySold("S isS95Sold " + movieSel);
        }
        if (isS96Sold) {
            saySold("S isS96Sold " + movieSel);
        }
        if (isS97Sold) {
            saySold("S isS97Sold " + movieSel);
        }
        if (isS98Sold) {
            saySold("S isS98Sold " + movieSel);
        }
        if (isS99Sold) {
            saySold("S isS99Sold " + movieSel);
        }
        if (isS9_10Sold) {
            saySold("S isS9_10Sold " + movieSel);
        }

        if (isS10_1Sold) {
            saySold("S isS10_1Sold " + movieSel);
        }
        if (isS10_2Sold) {
            saySold("S isS10_2Sold " + movieSel);
        }
        if (isS10_3Sold) {
            saySold("S isS10_3Sold " + movieSel);
        }
        if (isS10_4Sold) {
            saySold("S isS10_4Sold " + movieSel);
        }
        if (isS10_5Sold) {
            saySold("S isS10_5Sold " + movieSel);
        }
        if (isS10_6Sold) {
            saySold("S isS10_6Sold " + movieSel);
        }
        if (isS10_7Sold) {
            saySold("S isS10_7Sold " + movieSel);
        }
        if (isS10_8Sold) {
            saySold("S isS10_8Sold " + movieSel);
        }
        if (isS10_9Sold) {
            saySold("S isS10_9Sold " + movieSel);
        }
        if (isS10_10Sold) {
            saySold("S isS10_10Sold " + movieSel);
        }

    }

    String movie = "";         //variable for get movie name from movie selection window
    String time = "";          //variable for get movie date and time from movie selection window

    public String removeWord(String sentence, String word) {
        if (sentence.contains(word)) {
            sentence = sentence.replaceAll(word, "");
        }

        return sentence;
    }

    /**
     * Creates new form BookingPage
     */
    public BookingPage() {
        initComponents();
        btnGetTickets.setEnabled(true);
        jToggleButton1.setBackground(Color.gray);
        jToggleButton3.setBackground(Color.green);
        jToggleButton2.setBackground(Color.red);
        jToggleButton4.setEnabled(true);
    }

    public BookingPage(int movieSelection, String name, String dateAndTime) {
        initComponents();
        btnGetTickets.setEnabled(false);
        movieSel = movieSelection;
        movie = name;
        time = dateAndTime;
        jToggleButton1.setBackground(Color.gray);
        jToggleButton3.setBackground(Color.green);
        jToggleButton2.setBackground(Color.red);
        jToggleButton4.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        showMovieTime = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JTextField();
        seats = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();
        showMovieName = new javax.swing.JTextField();
        btnGetTickets = new javax.swing.JButton();
        s11 = new javax.swing.JToggleButton();
        s12 = new javax.swing.JToggleButton();
        s13 = new javax.swing.JToggleButton();
        s14 = new javax.swing.JToggleButton();
        s15 = new javax.swing.JToggleButton();
        s16 = new javax.swing.JToggleButton();
        s17 = new javax.swing.JToggleButton();
        s18 = new javax.swing.JToggleButton();
        s19 = new javax.swing.JToggleButton();
        s1_10 = new javax.swing.JToggleButton();
        s21 = new javax.swing.JToggleButton();
        s22 = new javax.swing.JToggleButton();
        s23 = new javax.swing.JToggleButton();
        s24 = new javax.swing.JToggleButton();
        s25 = new javax.swing.JToggleButton();
        s26 = new javax.swing.JToggleButton();
        s27 = new javax.swing.JToggleButton();
        s28 = new javax.swing.JToggleButton();
        s29 = new javax.swing.JToggleButton();
        s2_10 = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        s41 = new javax.swing.JToggleButton();
        s42 = new javax.swing.JToggleButton();
        s43 = new javax.swing.JToggleButton();
        s44 = new javax.swing.JToggleButton();
        s45 = new javax.swing.JToggleButton();
        s46 = new javax.swing.JToggleButton();
        s47 = new javax.swing.JToggleButton();
        s48 = new javax.swing.JToggleButton();
        s49 = new javax.swing.JToggleButton();
        s4_10 = new javax.swing.JToggleButton();
        jLabel18 = new javax.swing.JLabel();
        s51 = new javax.swing.JToggleButton();
        s52 = new javax.swing.JToggleButton();
        s53 = new javax.swing.JToggleButton();
        s54 = new javax.swing.JToggleButton();
        s55 = new javax.swing.JToggleButton();
        s56 = new javax.swing.JToggleButton();
        s57 = new javax.swing.JToggleButton();
        s58 = new javax.swing.JToggleButton();
        s59 = new javax.swing.JToggleButton();
        s5_10 = new javax.swing.JToggleButton();
        jLabel19 = new javax.swing.JLabel();
        s61 = new javax.swing.JToggleButton();
        s62 = new javax.swing.JToggleButton();
        s63 = new javax.swing.JToggleButton();
        s64 = new javax.swing.JToggleButton();
        s65 = new javax.swing.JToggleButton();
        s66 = new javax.swing.JToggleButton();
        s67 = new javax.swing.JToggleButton();
        s68 = new javax.swing.JToggleButton();
        s69 = new javax.swing.JToggleButton();
        s6_10 = new javax.swing.JToggleButton();
        jLabel20 = new javax.swing.JLabel();
        s71 = new javax.swing.JToggleButton();
        s72 = new javax.swing.JToggleButton();
        s73 = new javax.swing.JToggleButton();
        s74 = new javax.swing.JToggleButton();
        s75 = new javax.swing.JToggleButton();
        s76 = new javax.swing.JToggleButton();
        s77 = new javax.swing.JToggleButton();
        s78 = new javax.swing.JToggleButton();
        s79 = new javax.swing.JToggleButton();
        s7_10 = new javax.swing.JToggleButton();
        jLabel21 = new javax.swing.JLabel();
        s81 = new javax.swing.JToggleButton();
        s82 = new javax.swing.JToggleButton();
        s83 = new javax.swing.JToggleButton();
        s84 = new javax.swing.JToggleButton();
        s85 = new javax.swing.JToggleButton();
        s86 = new javax.swing.JToggleButton();
        s87 = new javax.swing.JToggleButton();
        s88 = new javax.swing.JToggleButton();
        s89 = new javax.swing.JToggleButton();
        s8_10 = new javax.swing.JToggleButton();
        jLabel22 = new javax.swing.JLabel();
        s91 = new javax.swing.JToggleButton();
        s92 = new javax.swing.JToggleButton();
        s93 = new javax.swing.JToggleButton();
        s94 = new javax.swing.JToggleButton();
        s95 = new javax.swing.JToggleButton();
        s96 = new javax.swing.JToggleButton();
        s97 = new javax.swing.JToggleButton();
        s98 = new javax.swing.JToggleButton();
        s99 = new javax.swing.JToggleButton();
        s9_10 = new javax.swing.JToggleButton();
        jLabel23 = new javax.swing.JLabel();
        s10_3 = new javax.swing.JToggleButton();
        s10_4 = new javax.swing.JToggleButton();
        s10_5 = new javax.swing.JToggleButton();
        s10_6 = new javax.swing.JToggleButton();
        s10_7 = new javax.swing.JToggleButton();
        s10_8 = new javax.swing.JToggleButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        s10_9 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(158, 34, 4));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(58, 231, 44, 34);

        jPanel1.setBackground(new java.awt.Color(158, 34, 4));
        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Movie");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 60, 121, 34);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" Total");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(41, 185, 121, 35);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" Seats");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(41, 238, 121, 34);

        showMovieTime.setBackground(new java.awt.Color(158, 34, 4));
        showMovieTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showMovieTime.setForeground(new java.awt.Color(204, 255, 204));
        showMovieTime.setBorder(null);
        jPanel1.add(showMovieTime);
        showMovieTime.setBounds(210, 130, 175, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Time");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 130, 121, 29);

        totalAmount.setBackground(new java.awt.Color(158, 34, 4));
        totalAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalAmount.setForeground(new java.awt.Color(204, 255, 204));
        totalAmount.setToolTipText("");
        totalAmount.setBorder(null);
        jPanel1.add(totalAmount);
        totalAmount.setBounds(208, 185, 175, 35);

        seats.setBackground(new java.awt.Color(158, 34, 4));
        seats.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seats.setForeground(new java.awt.Color(204, 255, 204));
        seats.setBorder(null);
        seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsActionPerformed(evt);
            }
        });
        jPanel1.add(seats);
        seats.setBounds(208, 238, 175, 34);

        btnBook.setText("BOOK NOW");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnBook);
        btnBook.setBounds(100, 310, 218, 39);

        showMovieName.setBackground(new java.awt.Color(158, 34, 4));
        showMovieName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showMovieName.setForeground(new java.awt.Color(204, 255, 204));
        showMovieName.setBorder(null);
        showMovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMovieNameActionPerformed(evt);
            }
        });
        jPanel1.add(showMovieName);
        showMovieName.setBounds(210, 60, 175, 34);

        btnGetTickets.setText("SHOW YOUOR TICKETS");
        btnGetTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetTicketsActionPerformed(evt);
            }
        });
        jPanel1.add(btnGetTickets);
        btnGetTickets.setBounds(100, 370, 218, 36);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(800, 230, 430, 430);

        s11.setBackground(Color.gray);
        s11.setText("1");
        s11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s11ActionPerformed(evt);
            }
        });
        getContentPane().add(s11);
        s11.setBounds(120, 231, 44, 34);

        s12.setBackground(Color.gray);
        s12.setText("2");
        s12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s12ActionPerformed(evt);
            }
        });
        getContentPane().add(s12);
        s12.setBounds(182, 231, 44, 34);

        s13.setBackground(Color.gray);
        s13.setText("3");
        s13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s13ActionPerformed(evt);
            }
        });
        getContentPane().add(s13);
        s13.setBounds(244, 231, 44, 34);

        s14.setBackground(Color.gray);
        s14.setText("4");
        s14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s14ActionPerformed(evt);
            }
        });
        getContentPane().add(s14);
        s14.setBounds(306, 231, 44, 34);

        s15.setBackground(Color.gray);
        s15.setText("5");
        s15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s15ActionPerformed(evt);
            }
        });
        getContentPane().add(s15);
        s15.setBounds(368, 231, 44, 34);

        s16.setBackground(Color.gray);
        s16.setText("6");
        s16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s16ActionPerformed(evt);
            }
        });
        getContentPane().add(s16);
        s16.setBounds(430, 231, 44, 34);

        s17.setBackground(Color.gray);
        s17.setText("7");
        s17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s17ActionPerformed(evt);
            }
        });
        getContentPane().add(s17);
        s17.setBounds(492, 231, 44, 34);

        s18.setBackground(Color.gray);
        s18.setText("8");
        s18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s18ActionPerformed(evt);
            }
        });
        getContentPane().add(s18);
        s18.setBounds(554, 231, 44, 34);

        s19.setBackground(Color.gray);
        s19.setText("9");
        s19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s19ActionPerformed(evt);
            }
        });
        getContentPane().add(s19);
        s19.setBounds(616, 231, 44, 34);

        s1_10.setBackground(Color.gray);
        s1_10.setText("10");
        s1_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_10ActionPerformed(evt);
            }
        });
        getContentPane().add(s1_10);
        s1_10.setBounds(678, 231, 45, 34);

        s21.setBackground(Color.gray);
        s21.setText("1");
        s21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s21ActionPerformed(evt);
            }
        });
        getContentPane().add(s21);
        s21.setBounds(120, 283, 44, 34);

        s22.setBackground(Color.gray);
        s22.setText("2");
        s22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s22ActionPerformed(evt);
            }
        });
        getContentPane().add(s22);
        s22.setBounds(182, 283, 44, 34);

        s23.setBackground(Color.gray);
        s23.setText("3");
        s23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s23ActionPerformed(evt);
            }
        });
        getContentPane().add(s23);
        s23.setBounds(244, 283, 44, 34);

        s24.setBackground(Color.gray);
        s24.setText("4");
        s24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s24ActionPerformed(evt);
            }
        });
        getContentPane().add(s24);
        s24.setBounds(306, 283, 44, 34);

        s25.setBackground(Color.gray);
        s25.setText("5");
        s25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s25ActionPerformed(evt);
            }
        });
        getContentPane().add(s25);
        s25.setBounds(368, 283, 44, 34);

        s26.setBackground(Color.gray);
        s26.setText("6");
        s26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s26ActionPerformed(evt);
            }
        });
        getContentPane().add(s26);
        s26.setBounds(430, 283, 44, 34);

        s27.setBackground(Color.gray);
        s27.setText("7");
        s27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s27ActionPerformed(evt);
            }
        });
        getContentPane().add(s27);
        s27.setBounds(492, 283, 44, 34);

        s28.setBackground(Color.gray);
        s28.setText("8");
        s28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s28ActionPerformed(evt);
            }
        });
        getContentPane().add(s28);
        s28.setBounds(554, 283, 44, 34);

        s29.setBackground(Color.gray);
        s29.setText("9");
        s29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s29ActionPerformed(evt);
            }
        });
        getContentPane().add(s29);
        s29.setBounds(616, 283, 44, 34);

        s2_10.setBackground(Color.gray);
        s2_10.setText("10");
        s2_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_10ActionPerformed(evt);
            }
        });
        getContentPane().add(s2_10);
        s2_10.setBounds(678, 283, 45, 34);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("2");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(58, 283, 44, 34);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("3");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(58, 335, 44, 34);

        s41.setBackground(Color.gray);
        s41.setText("1");
        s41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s41ActionPerformed(evt);
            }
        });
        getContentPane().add(s41);
        s41.setBounds(120, 387, 44, 34);

        s42.setBackground(Color.gray);
        s42.setText("2");
        s42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s42ActionPerformed(evt);
            }
        });
        getContentPane().add(s42);
        s42.setBounds(182, 387, 44, 34);

        s43.setBackground(Color.gray);
        s43.setText("3");
        s43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s43ActionPerformed(evt);
            }
        });
        getContentPane().add(s43);
        s43.setBounds(244, 387, 44, 34);

        s44.setBackground(Color.gray);
        s44.setText("4");
        s44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s44ActionPerformed(evt);
            }
        });
        getContentPane().add(s44);
        s44.setBounds(306, 387, 44, 34);

        s45.setBackground(Color.gray);
        s45.setText("5");
        s45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s45ActionPerformed(evt);
            }
        });
        getContentPane().add(s45);
        s45.setBounds(368, 387, 44, 34);

        s46.setBackground(Color.gray);
        s46.setText("6");
        s46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s46ActionPerformed(evt);
            }
        });
        getContentPane().add(s46);
        s46.setBounds(430, 387, 44, 34);

        s47.setBackground(Color.gray);
        s47.setText("7");
        s47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s47ActionPerformed(evt);
            }
        });
        getContentPane().add(s47);
        s47.setBounds(492, 387, 44, 34);

        s48.setBackground(Color.gray);
        s48.setText("8");
        s48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s48ActionPerformed(evt);
            }
        });
        getContentPane().add(s48);
        s48.setBounds(554, 387, 44, 34);

        s49.setBackground(Color.gray);
        s49.setText("9");
        s49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s49ActionPerformed(evt);
            }
        });
        getContentPane().add(s49);
        s49.setBounds(616, 387, 44, 34);

        s4_10.setBackground(Color.gray);
        s4_10.setText("10");
        s4_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4_10ActionPerformed(evt);
            }
        });
        getContentPane().add(s4_10);
        s4_10.setBounds(678, 387, 45, 34);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("4");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(58, 387, 44, 34);

        s51.setBackground(Color.gray);
        s51.setText("1");
        s51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s51ActionPerformed(evt);
            }
        });
        getContentPane().add(s51);
        s51.setBounds(120, 439, 44, 34);

        s52.setBackground(Color.gray);
        s52.setText("2");
        s52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s52ActionPerformed(evt);
            }
        });
        getContentPane().add(s52);
        s52.setBounds(182, 439, 44, 34);

        s53.setBackground(Color.gray);
        s53.setText("3");
        s53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s53ActionPerformed(evt);
            }
        });
        getContentPane().add(s53);
        s53.setBounds(244, 439, 44, 34);

        s54.setBackground(Color.gray);
        s54.setText("4");
        s54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s54ActionPerformed(evt);
            }
        });
        getContentPane().add(s54);
        s54.setBounds(306, 439, 44, 34);

        s55.setBackground(Color.gray);
        s55.setText("5");
        s55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s55ActionPerformed(evt);
            }
        });
        getContentPane().add(s55);
        s55.setBounds(368, 439, 44, 34);

        s56.setBackground(Color.gray);
        s56.setText("6");
        s56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s56ActionPerformed(evt);
            }
        });
        getContentPane().add(s56);
        s56.setBounds(430, 439, 44, 34);

        s57.setBackground(Color.gray);
        s57.setText("7");
        s57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s57ActionPerformed(evt);
            }
        });
        getContentPane().add(s57);
        s57.setBounds(492, 439, 44, 34);

        s58.setBackground(Color.gray);
        s58.setText("8");
        s58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s58ActionPerformed(evt);
            }
        });
        getContentPane().add(s58);
        s58.setBounds(554, 439, 44, 34);

        s59.setBackground(Color.gray);
        s59.setText("9");
        s59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s59ActionPerformed(evt);
            }
        });
        getContentPane().add(s59);
        s59.setBounds(616, 439, 44, 34);

        s5_10.setBackground(Color.gray);
        s5_10.setText("10");
        s5_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5_10ActionPerformed(evt);
            }
        });
        getContentPane().add(s5_10);
        s5_10.setBounds(678, 439, 45, 34);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("5");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(58, 439, 44, 34);

        s61.setBackground(Color.gray);
        s61.setText("1");
        s61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s61ActionPerformed(evt);
            }
        });
        getContentPane().add(s61);
        s61.setBounds(120, 491, 44, 34);

        s62.setBackground(Color.gray);
        s62.setText("2");
        s62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s62ActionPerformed(evt);
            }
        });
        getContentPane().add(s62);
        s62.setBounds(182, 491, 44, 34);

        s63.setBackground(Color.gray);
        s63.setText("3");
        s63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s63ActionPerformed(evt);
            }
        });
        getContentPane().add(s63);
        s63.setBounds(244, 491, 44, 34);

        s64.setBackground(Color.gray);
        s64.setText("4");
        s64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s64ActionPerformed(evt);
            }
        });
        getContentPane().add(s64);
        s64.setBounds(306, 491, 44, 34);

        s65.setBackground(Color.gray);
        s65.setText("5");
        s65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s65ActionPerformed(evt);
            }
        });
        getContentPane().add(s65);
        s65.setBounds(368, 491, 44, 34);

        s66.setBackground(Color.gray);
        s66.setText("6");
        s66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s66ActionPerformed(evt);
            }
        });
        getContentPane().add(s66);
        s66.setBounds(430, 491, 44, 34);

        s67.setBackground(Color.gray);
        s67.setText("7");
        s67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s67ActionPerformed(evt);
            }
        });
        getContentPane().add(s67);
        s67.setBounds(492, 491, 44, 34);

        s68.setBackground(Color.gray);
        s68.setText("8");
        s68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s68ActionPerformed(evt);
            }
        });
        getContentPane().add(s68);
        s68.setBounds(554, 491, 44, 34);

        s69.setBackground(Color.gray);
        s69.setText("9");
        s69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s69ActionPerformed(evt);
            }
        });
        getContentPane().add(s69);
        s69.setBounds(616, 491, 44, 34);

        s6_10.setBackground(Color.gray);
        s6_10.setText("10");
        s6_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6_10ActionPerformed(evt);
            }
        });
        getContentPane().add(s6_10);
        s6_10.setBounds(678, 491, 45, 34);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("6");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(58, 491, 44, 34);

        s71.setBackground(Color.gray);
        s71.setText("1");
        s71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s71ActionPerformed(evt);
            }
        });
        getContentPane().add(s71);
        s71.setBounds(120, 543, 44, 34);

        s72.setBackground(Color.gray);
        s72.setText("2");
        s72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s72ActionPerformed(evt);
            }
        });
        getContentPane().add(s72);
        s72.setBounds(182, 543, 44, 34);

        s73.setBackground(Color.gray);
        s73.setText("3");
        s73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s73ActionPerformed(evt);
            }
        });
        getContentPane().add(s73);
        s73.setBounds(244, 543, 44, 34);

        s74.setBackground(Color.gray);
        s74.setText("4");
        s74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s74ActionPerformed(evt);
            }
        });
        getContentPane().add(s74);
        s74.setBounds(306, 543, 44, 34);

        s75.setBackground(Color.gray);
        s75.setText("5");
        s75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s75ActionPerformed(evt);
            }
        });
        getContentPane().add(s75);
        s75.setBounds(368, 543, 44, 34);

        s76.setBackground(Color.gray);
        s76.setText("6");
        s76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s76ActionPerformed(evt);
            }
        });
        getContentPane().add(s76);
        s76.setBounds(430, 543, 44, 34);

        s77.setBackground(Color.gray);
        s77.setText("7");
        s77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s77ActionPerformed(evt);
            }
        });
        getContentPane().add(s77);
        s77.setBounds(492, 543, 44, 34);

        s78.setBackground(Color.gray);
        s78.setText("8");
        s78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s78ActionPerformed(evt);
            }
        });
        getContentPane().add(s78);
        s78.setBounds(554, 543, 44, 34);

        s79.setBackground(Color.gray);
        s79.setText("9");
        s79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s79ActionPerformed(evt);
            }
        });
        getContentPane().add(s79);
        s79.setBounds(616, 543, 44, 34);

        s7_10.setBackground(Color.gray);
        s7_10.setText("10");
        s7_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7_10ActionPerformed(evt);
            }
        });
        getContentPane().add(s7_10);
        s7_10.setBounds(678, 543, 45, 34);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("7");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(58, 543, 44, 34);

        s81.setBackground(Color.gray);
        s81.setText("1");
        s81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s81ActionPerformed(evt);
            }
        });
        getContentPane().add(s81);
        s81.setBounds(120, 595, 44, 34);

        s82.setBackground(Color.gray);
        s82.setText("2");
        s82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s82ActionPerformed(evt);
            }
        });
        getContentPane().add(s82);
        s82.setBounds(182, 595, 44, 34);

        s83.setBackground(Color.gray);
        s83.setText("3");
        s83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s83ActionPerformed(evt);
            }
        });
        getContentPane().add(s83);
        s83.setBounds(244, 595, 44, 34);

        s84.setBackground(Color.gray);
        s84.setText("4");
        s84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s84ActionPerformed(evt);
            }
        });
        getContentPane().add(s84);
        s84.setBounds(306, 595, 44, 34);

        s85.setBackground(Color.gray);
        s85.setText("5");
        s85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s85ActionPerformed(evt);
            }
        });
        getContentPane().add(s85);
        s85.setBounds(368, 595, 44, 34);

        s86.setBackground(Color.gray);
        s86.setText("6");
        s86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s86ActionPerformed(evt);
            }
        });
        getContentPane().add(s86);
        s86.setBounds(430, 595, 44, 34);

        s87.setBackground(Color.gray);
        s87.setText("7");
        s87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s87ActionPerformed(evt);
            }
        });
        getContentPane().add(s87);
        s87.setBounds(492, 595, 44, 34);

        s88.setBackground(Color.gray);
        s88.setText("8");
        s88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s88ActionPerformed(evt);
            }
        });
        getContentPane().add(s88);
        s88.setBounds(554, 595, 44, 34);

        s89.setBackground(Color.gray);
        s89.setText("9");
        s89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s89ActionPerformed(evt);
            }
        });
        getContentPane().add(s89);
        s89.setBounds(616, 595, 44, 34);

        s8_10.setBackground(Color.gray);
        s8_10.setText("10");
        s8_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8_10ActionPerformed(evt);
            }
        });
        getContentPane().add(s8_10);
        s8_10.setBounds(678, 595, 45, 34);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("8");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(58, 595, 44, 34);

        s91.setBackground(Color.gray);
        s91.setText("1");
        s91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s91ActionPerformed(evt);
            }
        });
        getContentPane().add(s91);
        s91.setBounds(120, 649, 44, 34);

        s92.setBackground(Color.gray);
        s92.setText("2");
        s92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s92ActionPerformed(evt);
            }
        });
        getContentPane().add(s92);
        s92.setBounds(182, 649, 44, 34);

        s93.setBackground(Color.gray);
        s93.setText("3");
        s93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s93ActionPerformed(evt);
            }
        });
        getContentPane().add(s93);
        s93.setBounds(244, 649, 44, 34);

        s94.setBackground(Color.gray);
        s94.setText("4");
        s94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s94ActionPerformed(evt);
            }
        });
        getContentPane().add(s94);
        s94.setBounds(306, 649, 44, 34);

        s95.setBackground(Color.gray);
        s95.setText("5");
        s95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s95ActionPerformed(evt);
            }
        });
        getContentPane().add(s95);
        s95.setBounds(368, 649, 44, 34);

        s96.setBackground(Color.gray);
        s96.setText("6");
        s96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s96ActionPerformed(evt);
            }
        });
        getContentPane().add(s96);
        s96.setBounds(430, 649, 44, 34);

        s97.setBackground(Color.gray);
        s97.setText("7");
        s97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s97ActionPerformed(evt);
            }
        });
        getContentPane().add(s97);
        s97.setBounds(492, 649, 44, 34);

        s98.setBackground(Color.gray);
        s98.setText("8");
        s98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s98ActionPerformed(evt);
            }
        });
        getContentPane().add(s98);
        s98.setBounds(554, 649, 44, 34);

        s99.setBackground(Color.gray);
        s99.setText("9");
        s99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s99ActionPerformed(evt);
            }
        });
        getContentPane().add(s99);
        s99.setBounds(616, 649, 44, 34);

        s9_10.setBackground(Color.gray);
        s9_10.setText("10");
        s9_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s9_10ActionPerformed(evt);
            }
        });
        getContentPane().add(s9_10);
        s9_10.setBounds(678, 649, 45, 34);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("9");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(58, 649, 44, 34);

        s10_3.setBackground(Color.gray);
        s10_3.setText("3");
        s10_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10_3ActionPerformed(evt);
            }
        });
        getContentPane().add(s10_3);
        s10_3.setBounds(244, 701, 44, 34);

        s10_4.setBackground(Color.gray);
        s10_4.setText("4");
        s10_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10_4ActionPerformed(evt);
            }
        });
        getContentPane().add(s10_4);
        s10_4.setBounds(306, 701, 44, 34);

        s10_5.setBackground(Color.gray);
        s10_5.setText("5");
        s10_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10_5ActionPerformed(evt);
            }
        });
        getContentPane().add(s10_5);
        s10_5.setBounds(368, 701, 44, 34);

        s10_6.setBackground(Color.gray);
        s10_6.setText("6");
        s10_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10_6ActionPerformed(evt);
            }
        });
        getContentPane().add(s10_6);
        s10_6.setBounds(430, 701, 44, 34);

        s10_7.setBackground(Color.gray);
        s10_7.setText("7");
        s10_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10_7ActionPerformed(evt);
            }
        });
        getContentPane().add(s10_7);
        s10_7.setBounds(492, 701, 44, 34);

        s10_8.setBackground(Color.gray);
        s10_8.setText("8");
        s10_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10_8ActionPerformed(evt);
            }
        });
        getContentPane().add(s10_8);
        s10_8.setBounds(554, 701, 44, 34);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("10");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(58, 701, 44, 34);

        jPanel2.setBackground(new java.awt.Color(158, 34, 4));

        jLabel1.setFont(new java.awt.Font("Bitsumishi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(jLabel12.getIcon());
        jLabel1.setText("Multiplex Theter Showing Screen 1");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(200, 40, 830, 54);

        jPanel3.setBackground(new java.awt.Color(158, 34, 4));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCREEN");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(70, 0, 350, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(180, 160, 470, 40);

        jPanel5.setBackground(new java.awt.Color(158, 34, 4));
        jPanel5.setLayout(null);

        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton1);
        jToggleButton1.setBounds(20, 10, 30, 30);

        s10_9.setBackground(Color.gray);
        s10_9.setText("8");
        s10_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10_9ActionPerformed(evt);
            }
        });
        jPanel5.add(s10_9);
        s10_9.setBounds(554, 701, 44, 34);
        jPanel5.add(jToggleButton2);
        jToggleButton2.setBounds(20, 60, 30, 30);

        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton3);
        jToggleButton3.setBounds(230, 10, 30, 30);

        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton4);
        jToggleButton4.setBounds(230, 60, 30, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AVAILABLE");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(70, 10, 120, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BOOKED BY YOU");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(70, 60, 120, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECTED BY YOU");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(280, 10, 120, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ALREADY BOOKED");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(280, 60, 130, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(800, 660, 430, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theater/app/images/peter-lewicki-Wfh650C1OHU-unsplash.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1350, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void s15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s15ActionPerformed
        // TODO add your handling code here:
        isS15Select = sheetColor(s15, s15.isSelected(), isS15Sold);
        if (s15.isSelected()) {
            price += 12;
            seatName += "1_5 ";
        }
        if (!s15.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_5 ", "");

        }


    }//GEN-LAST:event_s15ActionPerformed

    private void s25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s25ActionPerformed
        // TODO add your handling code here:
        isS25Select = sheetColor(s25, s25.isSelected(), isS25Sold);
        if (s25.isSelected()) {
            price += 12;
            seatName += "2_5 ";

        }
        if (!s25.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_5 ", "");
        }

    }//GEN-LAST:event_s25ActionPerformed

    private void s45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s45ActionPerformed
        // TODO add your handling code here:
        isS45Select = sheetColor(s45, s45.isSelected(), isS45Sold);
        if (s45.isSelected()) {
            price += 12;
            seatName += "4_5 ";
        }
        if (!s45.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_5 ", "");

        }

    }//GEN-LAST:event_s45ActionPerformed

    private void s55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s55ActionPerformed
        // TODO add your handling code here:
        isS55Select = sheetColor(s55, s55.isSelected(), isS55Sold);
        if (s55.isSelected()) {
            price += 12;
            seatName += "5_5 ";
        }
        if (!s55.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_5 ", "");
        }

    }//GEN-LAST:event_s55ActionPerformed

    private void s65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s65ActionPerformed
        // TODO add your handling code here:
        isS65Select = sheetColor(s65, s65.isSelected(), isS65Sold);
        if (s65.isSelected()) {
            price += 12;
            seatName += "6_5 ";
        }
        if (!s65.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_5 ", "");
        }

    }//GEN-LAST:event_s65ActionPerformed

    private void s75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s75ActionPerformed
        // TODO add your handling code here:
        isS75Select = sheetColor(s75, s75.isSelected(), isS75Sold);
        if (s75.isSelected()) {
            price += 12;
            seatName += "7_5 ";
        }
        if (!s75.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_5 ", "");

        }

    }//GEN-LAST:event_s75ActionPerformed

    private void s85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s85ActionPerformed
        // TODO add your handling code here:
        isS85Select = sheetColor(s85, s85.isSelected(), isS85Sold);
        if (s85.isSelected()) {
            price += 12;
            seatName += "8_5 ";
        }
        if (!s85.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_5 ", "");
        }

    }//GEN-LAST:event_s85ActionPerformed

    private void s95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s95ActionPerformed
        // TODO add your handling code here:
        isS95Select = sheetColor(s95, s95.isSelected(), isS95Sold);
        if (s95.isSelected()) {
            price += 12;
            seatName += "9_5 ";
        }
        if (!s95.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_5 ", "");
        }

    }//GEN-LAST:event_s95ActionPerformed

    private void s10_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10_5ActionPerformed
        // TODO add your handling code here:
        isS10_5Select = sheetColor(s10_5, s10_5.isSelected(), isS10_5Sold);
        if (s10_5.isSelected()) {
            price += 20;
            seatName += "10_5 ";
        }
        if (!s10_5.isSelected()) {
            price -= 20;
            seatName = seatName.replaceAll("10_5 ", "");
        }

    }//GEN-LAST:event_s10_5ActionPerformed

    private void s11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s11ActionPerformed
        // TODO add your handling code here:

        isS11Select = sheetColor(s11, s11.isSelected(), isS11Sold);
        if (s11.isSelected()) {
            price += 12;
            seatName += "1_1 ";
        }
        if (!s11.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_1 ", "");
        }
    }//GEN-LAST:event_s11ActionPerformed

    private void s12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s12ActionPerformed
        // TODO add your handling code here:
        isS12Select = sheetColor(s12, s12.isSelected(), isS12Sold);
        if (s12.isSelected()) {
            price += 12;
            seatName += "1_2 ";
        }
        if (!s12.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_2 ", "");
        }


    }//GEN-LAST:event_s12ActionPerformed

    private void s13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s13ActionPerformed
        // TODO add your handling code here:
        isS13Select = sheetColor(s13, s13.isSelected(), isS13Sold);

        if (s13.isSelected()) {
            price += 12;
            seatName += "1_3 ";
        }
        if (!s13.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_3 ", "");
        }

    }//GEN-LAST:event_s13ActionPerformed

    private void s14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s14ActionPerformed
        // TODO add your handling code here:
        isS14Select = sheetColor(s14, s14.isSelected(), isS14Sold);
        if (s14.isSelected()) {
            price += 12;
            seatName += "1_4 ";
        }
        if (!s14.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_4 ", "");
        }

    }//GEN-LAST:event_s14ActionPerformed

    private void s16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s16ActionPerformed
        // TODO add your handling code here:
        isS16Select = sheetColor(s16, s16.isSelected(), isS16Sold);
        if (s16.isSelected()) {
            price += 12;
            seatName += "1_6 ";
        }
        if (!s16.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_6 ", "");
        }

    }//GEN-LAST:event_s16ActionPerformed

    private void s17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s17ActionPerformed
        // TODO add your handling code here:
        isS17Select = sheetColor(s17, s17.isSelected(), isS17Sold);
        if (s17.isSelected()) {
            price += 12;
            seatName += "1_7 ";
        }
        if (!s17.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_7 ", "");
        }

    }//GEN-LAST:event_s17ActionPerformed

    private void s18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s18ActionPerformed
        // TODO add your handling code here:
        isS18Select = sheetColor(s18, s18.isSelected(), isS18Sold);
        if (s18.isSelected()) {
            price += 12;
            seatName += "1_8 ";
        }
        if (!s18.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_8 ", "");
        }

    }//GEN-LAST:event_s18ActionPerformed

    private void s19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s19ActionPerformed
        // TODO add your handling code here:
        isS19Select = sheetColor(s19, s19.isSelected(), isS19Sold);
        if (s19.isSelected()) {
            price += 12;
            seatName += "1_9 ";
        }
        if (!s19.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_9 ", "");
        }

    }//GEN-LAST:event_s19ActionPerformed

    private void s1_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_10ActionPerformed
        // TODO add your handling code here:
        isS1_10Select = sheetColor(s1_10, s1_10.isSelected(), isS1_10Sold);
        if (s1_10.isSelected()) {
            price += 12;
            seatName += "1_10 ";
        }
        if (!s1_10.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("1_10 ", "");
        }

    }//GEN-LAST:event_s1_10ActionPerformed

    private void s21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s21ActionPerformed
        // TODO add your handling code here:
        isS21Select = sheetColor(s21, s21.isSelected(), isS21Sold);
        if (s21.isSelected()) {
            price += 12;
            seatName += "2_1 ";
        }
        if (!s21.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_1 ", "");
        }

    }//GEN-LAST:event_s21ActionPerformed

    private void s22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s22ActionPerformed
        // TODO add your handling code here:
        isS22Select = sheetColor(s22, s22.isSelected(), isS22Sold);
        if (s22.isSelected()) {
            price += 12;
            seatName += "2_2 ";
        }
        if (!s22.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_2 ", "");
        }

    }//GEN-LAST:event_s22ActionPerformed

    private void s23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s23ActionPerformed
        // TODO add your handling code here:
        isS23Select = sheetColor(s23, s23.isSelected(), isS23Sold);
        if (s23.isSelected()) {
            price += 12;
            seatName += "2_3 ";
        }
        if (!s23.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_3 ", "");
        }

    }//GEN-LAST:event_s23ActionPerformed

    private void s24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s24ActionPerformed
        // TODO add your handling code here:
        isS24Select = sheetColor(s24, s24.isSelected(), isS24Sold);
        if (s24.isSelected()) {
            price += 12;
            seatName += "2_4 ";
        }
        if (!s24.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_4 ", "");
        }


    }//GEN-LAST:event_s24ActionPerformed

    private void s26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s26ActionPerformed
        // TODO add your handling code here:
        isS26Select = sheetColor(s26, s26.isSelected(), isS26Sold);
        if (s26.isSelected()) {
            price += 12;
            seatName += "2_6 ";
        }
        if (!s26.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_6 ", "");
        }

    }//GEN-LAST:event_s26ActionPerformed

    private void s27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s27ActionPerformed
        // TODO add your handling code here:
        isS27Select = sheetColor(s27, s27.isSelected(), isS27Sold);
        if (s27.isSelected()) {
            price += 12;
            seatName += "2_7 ";
        }
        if (!s27.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_7 ", "");
        }

    }//GEN-LAST:event_s27ActionPerformed

    private void s28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s28ActionPerformed
        // TODO add your handling code here:
        isS28Select = sheetColor(s28, s28.isSelected(), isS28Sold);
        if (s28.isSelected()) {
            price += 12;
            seatName += "2_8 ";
        }
        if (!s28.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_8 ", "");
        }

    }//GEN-LAST:event_s28ActionPerformed

    private void s29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s29ActionPerformed
        // TODO add your handling code here:
        isS29Select = sheetColor(s29, s29.isSelected(), isS29Sold);
        if (s29.isSelected()) {
            price += 12;
            seatName += "2_9 ";
        }
        if (!s29.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("2_9 ", "");
        }

    }//GEN-LAST:event_s29ActionPerformed

    private void s41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s41ActionPerformed
        // TODO add your handling code here:
        isS41Select = isS41Select = sheetColor(s41, s41.isSelected(), isS41Sold);
        if (s41.isSelected()) {
            price += 12;
            seatName += "4_1 ";
        }
        if (!s41.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_1 ", "");
        }

    }//GEN-LAST:event_s41ActionPerformed

    private void s42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s42ActionPerformed
        // TODO add your handling code here:
        isS42Select = sheetColor(s42, s42.isSelected(), isS42Sold);
        if (s42.isSelected()) {
            price += 12;
            seatName += "4_2 ";
        }
        if (!s42.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_2 ", "");
        }

    }//GEN-LAST:event_s42ActionPerformed

    private void s43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s43ActionPerformed
        // TODO add your handling code here:
        isS43Select = sheetColor(s43, s43.isSelected(), isS43Sold);
        if (s43.isSelected()) {
            price += 12;
            seatName += "4_3 ";
        }
        if (!s43.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_3 ", "");
        }

    }//GEN-LAST:event_s43ActionPerformed

    private void s44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s44ActionPerformed
        // TODO add your handling code here:
        isS44Select = sheetColor(s44, s44.isSelected(), isS44Sold);
        if (s44.isSelected()) {
            price += 12;
            seatName += "4_4 ";
        }
        if (!s44.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_4 ", "");
        }

    }//GEN-LAST:event_s44ActionPerformed

    private void s46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s46ActionPerformed
        // TODO add your handling code here:
        isS46Select = sheetColor(s46, s46.isSelected(), isS46Sold);
        if (s46.isSelected()) {
            price += 12;
            seatName += "4_6 ";
        }
        if (!s46.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_6 ", "");
        }

    }//GEN-LAST:event_s46ActionPerformed

    private void s47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s47ActionPerformed
        // TODO add your handling code here:
        isS47Select = sheetColor(s47, s47.isSelected(), isS47Sold);
        if (s47.isSelected()) {
            price += 12;
            seatName += "4_7 ";
        }
        if (!s47.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_7 ", "");
        }

    }//GEN-LAST:event_s47ActionPerformed

    private void s48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s48ActionPerformed
        // TODO add your handling code here:
        isS48Select = sheetColor(s48, s48.isSelected(), isS48Sold);
        if (s48.isSelected()) {
            price += 12;
            seatName += "4_8 ";
        }
        if (!s48.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_8 ", "");
        }

    }//GEN-LAST:event_s48ActionPerformed

    private void s49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s49ActionPerformed
        // TODO add your handling code here:
        isS49Select = sheetColor(s49, s49.isSelected(), isS49Sold);
        if (s49.isSelected()) {
            price += 12;
            seatName += "4_9 ";
        }
        if (!s49.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_9 ", "");
        }

    }//GEN-LAST:event_s49ActionPerformed

    private void s4_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4_10ActionPerformed
        // TODO add your handling code here:
        isS4_10Select = sheetColor(s4_10, s4_10.isSelected(), isS4_10Sold);
        if (s4_10.isSelected()) {
            price += 12;
            seatName += "4_10 ";
        }
        if (!s4_10.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("4_10 ", "");
        }

    }//GEN-LAST:event_s4_10ActionPerformed

    private void s51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s51ActionPerformed
        // TODO add your handling code here:
        isS51Select = sheetColor(s51, s51.isSelected(), isS51Sold);
        if (s51.isSelected()) {
            price += 12;
            seatName += "5_1 ";
        }
        if (!s51.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_1 ", "");
        }

    }//GEN-LAST:event_s51ActionPerformed

    private void s52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s52ActionPerformed
        // TODO add your handling code here:
        isS52Select = sheetColor(s52, s52.isSelected(), isS52Sold);
        if (s52.isSelected()) {
            price += 12;
            seatName += "5_2 ";
        }
        if (!s52.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_2 ", "");
        }

    }//GEN-LAST:event_s52ActionPerformed

    private void s53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s53ActionPerformed
        // TODO add your handling code here:
        isS53Select = sheetColor(s53, s53.isSelected(), isS53Sold);
        if (s53.isSelected()) {
            price += 12;
            seatName += "5_3 ";
        }
        if (!s53.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_3 ", "");
        }

    }//GEN-LAST:event_s53ActionPerformed

    private void s54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s54ActionPerformed
        // TODO add your handling code here:
        isS54Select = sheetColor(s54, s54.isSelected(), isS54Sold);
        if (s54.isSelected()) {
            price += 12;
            seatName += "5_4 ";
        }
        if (!s54.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_4 ", "");
        }

    }//GEN-LAST:event_s54ActionPerformed

    private void s56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s56ActionPerformed
        // TODO add your handling code here:
        isS56Select = sheetColor(s56, s56.isSelected(), isS56Sold);
        if (s56.isSelected()) {
            price += 12;
            seatName += "5_6 ";
        }
        if (!s56.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_6 ", "");
        }

    }//GEN-LAST:event_s56ActionPerformed

    private void s57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s57ActionPerformed
        // TODO add your handling code here:
        isS57Select = sheetColor(s57, s57.isSelected(), isS57Sold);
        if (s57.isSelected()) {
            price += 12;
            seatName += "5_7 ";
        }
        if (!s57.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_7 ", "");
        }

    }//GEN-LAST:event_s57ActionPerformed

    private void s58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s58ActionPerformed
        // TODO add your handling code here:
        isS58Select = sheetColor(s58, s58.isSelected(), isS58Sold);
        if (s58.isSelected()) {
            price += 12;
            seatName += "5_8 ";
        }
        if (!s58.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_8 ", "");
        }

    }//GEN-LAST:event_s58ActionPerformed

    private void s59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s59ActionPerformed
        // TODO add your handling code here:
        isS59Select = sheetColor(s59, s59.isSelected(), isS59Sold);
        if (s59.isSelected()) {
            price += 12;
            seatName += "5_9 ";
        }
        if (!s59.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_9 ", "");
        }

    }//GEN-LAST:event_s59ActionPerformed

    private void s5_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5_10ActionPerformed
        // TODO add your handling code here:
        isS5_10Select = sheetColor(s5_10, s5_10.isSelected(), isS5_10Sold);
        if (s5_10.isSelected()) {
            price += 12;
            seatName += "5_10 ";
        }
        if (!s5_10.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("5_10 ", "");
        }

    }//GEN-LAST:event_s5_10ActionPerformed

    private void s61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s61ActionPerformed
        // TODO add your handling code here:
        isS61Select = sheetColor(s61, s61.isSelected(), isS61Sold);
        if (s61.isSelected()) {
            price += 12;
            seatName += "6_1 ";
        }
        if (!s61.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_1 ", "");
        }


    }//GEN-LAST:event_s61ActionPerformed

    private void s62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s62ActionPerformed
        // TODO add your handling code here:
        isS62Select = sheetColor(s62, s62.isSelected(), isS62Sold);
        if (s62.isSelected()) {
            price += 12;
            seatName += "6_2 ";
        }
        if (!s62.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_2 ", "");
        }

    }//GEN-LAST:event_s62ActionPerformed

    private void s63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s63ActionPerformed
        // TODO add your handling code here:
        isS63Select = sheetColor(s63, s63.isSelected(), isS63Sold);
        if (s63.isSelected()) {
            price += 12;
            seatName += "6_3 ";
        }
        if (!s63.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_3 ", "");
        }

    }//GEN-LAST:event_s63ActionPerformed

    private void s64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s64ActionPerformed
        // TODO add your handling code here:
        isS64Select = sheetColor(s64, s64.isSelected(), isS64Sold);
        if (s64.isSelected()) {
            price += 12;
            seatName += "6_4 ";
        }
        if (!s64.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_4 ", "");
        }

    }//GEN-LAST:event_s64ActionPerformed

    private void s66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s66ActionPerformed
        // TODO add your handling code here:
        isS66Select = sheetColor(s66, s66.isSelected(), isS66Sold);
        if (s65.isSelected()) {
            price += 12;
            seatName += "6_6 ";
        }
        if (!s65.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_6 ", "");
        }

    }//GEN-LAST:event_s66ActionPerformed

    private void s67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s67ActionPerformed
        // TODO add your handling code here:
        isS67Select = sheetColor(s67, s67.isSelected(), isS67Sold);
        if (s67.isSelected()) {
            price += 12;
            seatName += "6_7 ";
        }
        if (!s67.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_7 ", "");
        }
    }//GEN-LAST:event_s67ActionPerformed

    private void s68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s68ActionPerformed
        // TODO add your handling code here:
        isS68Select = sheetColor(s68, s68.isSelected(), isS68Sold);
        if (s68.isSelected()) {
            price += 12;
            seatName += "6_8 ";
        }
        if (!s68.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_8 ", "");
        }
    }//GEN-LAST:event_s68ActionPerformed

    private void s69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s69ActionPerformed
        // TODO add your handling code here:
        isS69Select = sheetColor(s69, s69.isSelected(), isS69Sold);
        if (s69.isSelected()) {
            price += 12;
            seatName += "6_9 ";
        }
        if (!s69.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_9 ", "");
        }

    }//GEN-LAST:event_s69ActionPerformed

    private void s6_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6_10ActionPerformed
        // TODO add your handling code here:
        isS6_10Select = sheetColor(s6_10, s6_10.isSelected(), isS6_10Sold);
        if (s6_10.isSelected()) {
            price += 12;
            seatName += "6_10 ";
        }
        if (!s6_10.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("6_10 ", "");
        }

    }//GEN-LAST:event_s6_10ActionPerformed

    private void s71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s71ActionPerformed
        // TODO add your handling code here:
        isS71Select = sheetColor(s71, s71.isSelected(), isS71Sold);
        if (s71.isSelected()) {
            price += 12;
            seatName += "7_1 ";
        }
        if (!s71.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_1 ", "");
        }

    }//GEN-LAST:event_s71ActionPerformed

    private void s72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s72ActionPerformed
        // TODO add your handling code here:
        isS72Select = sheetColor(s72, s72.isSelected(), isS72Sold);
        if (s72.isSelected()) {
            price += 12;
            seatName += "7_2 ";
        }
        if (!s72.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_2 ", "");
        }

    }//GEN-LAST:event_s72ActionPerformed

    private void s73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s73ActionPerformed
        // TODO add your handling code here:
        isS73Select = sheetColor(s73, s73.isSelected(), isS73Sold);
        if (s73.isSelected()) {
            price += 12;
            seatName += "7_3 ";
        }
        if (!s73.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_3 ", "");
        }

    }//GEN-LAST:event_s73ActionPerformed

    private void s74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s74ActionPerformed
        // TODO add your handling code here:
        isS74Select = sheetColor(s74, s74.isSelected(), isS74Sold);
        if (s74.isSelected()) {
            price += 12;
            seatName += "7_4 ";
        }
        if (!s74.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_4 ", "");
        }

    }//GEN-LAST:event_s74ActionPerformed

    private void s76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s76ActionPerformed
        // TODO add your handling code here:
        isS76Select = sheetColor(s76, s76.isSelected(), isS76Sold);
        if (s76.isSelected()) {
            price += 12;
            seatName += "7_6 ";
        }
        if (!s76.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_6 ", "");
        }

    }//GEN-LAST:event_s76ActionPerformed

    private void s77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s77ActionPerformed
        // TODO add your handling code here:
        isS77Select = sheetColor(s77, s77.isSelected(), isS77Sold);
        if (s77.isSelected()) {
            price += 12;
            seatName += "7_7 ";
        }
        if (!s77.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_7 ", "");
        }

    }//GEN-LAST:event_s77ActionPerformed

    private void s78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s78ActionPerformed
        // TODO add your handling code here:
        isS78Select = sheetColor(s78, s78.isSelected(), isS78Sold);
        if (s78.isSelected()) {
            price += 12;
            seatName += "7_8 ";
        }
        if (!s78.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_8 ", "");
        }

    }//GEN-LAST:event_s78ActionPerformed

    private void s79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s79ActionPerformed
        // TODO add your handling code here:
        isS79Select = sheetColor(s79, s79.isSelected(), isS79Sold);
        if (s79.isSelected()) {
            price += 12;
            seatName += "7_9 ";
        }
        if (!s79.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_9 ", "");
        }

    }//GEN-LAST:event_s79ActionPerformed

    private void s7_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7_10ActionPerformed
        // TODO add your handling code here:
        isS7_10Select = sheetColor(s7_10, s7_10.isSelected(), isS7_10Sold);
        if (s7_10.isSelected()) {
            price += 12;
            seatName += "7_10 ";
        }
        if (!s7_10.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("7_10 ", "");
        }

    }//GEN-LAST:event_s7_10ActionPerformed

    private void s81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s81ActionPerformed
        // TODO add your handling code here:
        isS81Select = sheetColor(s81, s81.isSelected(), isS81Sold);
        if (s81.isSelected()) {
            price += 12;
            seatName += "8_1 ";
        }
        if (!s81.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_1 ", "");
        }

    }//GEN-LAST:event_s81ActionPerformed

    private void s82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s82ActionPerformed
        // TODO add your handling code here:
        isS82Select = sheetColor(s82, s82.isSelected(), isS82Sold);
        if (s82.isSelected()) {
            price += 12;
            seatName += "8_2 ";
        }
        if (!s82.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_2 ", "");
        }

    }//GEN-LAST:event_s82ActionPerformed

    private void s83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s83ActionPerformed
        // TODO add your handling code here:
        isS83Select = sheetColor(s83, s83.isSelected(), isS83Sold);
        if (s83.isSelected()) {
            price += 12;
            seatName += "8_3 ";
        }
        if (!s83.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_3 ", "");
        }

    }//GEN-LAST:event_s83ActionPerformed

    private void s84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s84ActionPerformed
        // TODO add your handling code here:
        isS84Select = sheetColor(s84, s84.isSelected(), isS84Sold);
        if (s84.isSelected()) {
            price += 12;
            seatName += "8_4 ";
        }
        if (!s84.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_4 ", "");
        }

    }//GEN-LAST:event_s84ActionPerformed

    private void s86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s86ActionPerformed
        // TODO add your handling code here:
        isS86Select = sheetColor(s86, s86.isSelected(), isS86Sold);
        if (s86.isSelected()) {
            price += 12;
            seatName += "8_6 ";
        }
        if (!s86.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_6 ", "");
        }

    }//GEN-LAST:event_s86ActionPerformed

    private void s87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s87ActionPerformed
        // TODO add your handling code here:
        isS87Select = sheetColor(s87, s87.isSelected(), isS87Sold);
        if (s87.isSelected()) {
            price += 12;
            seatName += "8_7 ";
        }
        if (!s87.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_7 ", "");
        }

    }//GEN-LAST:event_s87ActionPerformed

    private void s88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s88ActionPerformed
        // TODO add your handling code here:
        isS88Select = sheetColor(s88, s88.isSelected(), isS88Sold);
        if (s88.isSelected()) {
            price += 12;
            seatName += "8_8 ";
        }
        if (!s88.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_8 ", "");
        }

    }//GEN-LAST:event_s88ActionPerformed

    private void s89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s89ActionPerformed
        // TODO add your handling code here:
        isS89Select = sheetColor(s89, s89.isSelected(), isS89Sold);
        if (s89.isSelected()) {
            price += 12;
            seatName += "8_9 ";
        }
        if (!s89.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_9 ", "");
        }

    }//GEN-LAST:event_s89ActionPerformed

    private void s8_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8_10ActionPerformed
        // TODO add your handling code here:
        isS8_10Select = sheetColor(s8_10, s8_10.isSelected(), isS8_10Sold);
        if (s8_10.isSelected()) {
            price += 12;
            seatName += "8_10 ";
        }
        if (!s8_10.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("8_10 ", "");
        }

    }//GEN-LAST:event_s8_10ActionPerformed

    private void s91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s91ActionPerformed
        // TODO add your handling code here:
        isS91Select = sheetColor(s91, s91.isSelected(), isS91Sold);
        if (s91.isSelected()) {
            price += 12;
            seatName += "9_1 ";
        }
        if (!s91.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_1 ", "");
        }

    }//GEN-LAST:event_s91ActionPerformed

    private void s92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s92ActionPerformed
        // TODO add your handling code here:
        isS92Select = sheetColor(s92, s92.isSelected(), isS92Sold);
        if (s92.isSelected()) {
            price += 12;
            seatName += "9_2 ";
        }
        if (!s92.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_2 ", "");
        }

    }//GEN-LAST:event_s92ActionPerformed

    private void s93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s93ActionPerformed
        // TODO add your handling code here:
        isS93Select = sheetColor(s93, s93.isSelected(), isS93Sold);
        if (s93.isSelected()) {
            price += 12;
            seatName += "9_3 ";
        }
        if (!s93.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_3 ", "");
        }

    }//GEN-LAST:event_s93ActionPerformed

    private void s94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s94ActionPerformed
        // TODO add your handling code here:
        isS94Select = sheetColor(s94, s94.isSelected(), isS94Sold);
        if (s94.isSelected()) {
            price += 12;
            seatName += "9_4 ";
        }
        if (!s94.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_4 ", "");
        }

    }//GEN-LAST:event_s94ActionPerformed

    private void s96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s96ActionPerformed
        // TODO add your handling code here:
        isS96Select = sheetColor(s96, s96.isSelected(), isS96Sold);
        if (s96.isSelected()) {
            price += 12;
            seatName += "9_6 ";
        }
        if (!s96.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_6 ", "");
        }

    }//GEN-LAST:event_s96ActionPerformed

    private void s97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s97ActionPerformed
        // TODO add your handling code here:
        isS97Select = sheetColor(s97, s97.isSelected(), isS97Sold);
        if (s97.isSelected()) {
            price += 12;
            seatName += "9_7 ";
        }
        if (!s97.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_7 ", "");
        }

    }//GEN-LAST:event_s97ActionPerformed

    private void s98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s98ActionPerformed
        // TODO add your handling code here:
        isS98Select = sheetColor(s98, s98.isSelected(), isS98Sold);
        if (s98.isSelected()) {
            price += 12;
            seatName += "9_8 ";
        }
        if (!s98.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_8 ", "");
        }

    }//GEN-LAST:event_s98ActionPerformed

    private void s99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s99ActionPerformed
        // TODO add your handling code here:
        isS99Select = sheetColor(s99, s99.isSelected(), isS99Sold);
        if (s99.isSelected()) {
            price += 12;
            seatName += "9_9 ";
        }
        if (!s99.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_9 ", "");
        }

    }//GEN-LAST:event_s99ActionPerformed

    private void s9_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s9_10ActionPerformed
        // TODO add your handling code here:
        isS9_10Select = sheetColor(s9_10, s9_10.isSelected(), isS9_10Sold);
        if (s9_10.isSelected()) {
            price += 12;
            seatName += "9_10 ";
        }
        if (!s9_10.isSelected()) {
            price -= 12;
            seatName = seatName.replaceAll("9_10 ", "");
        }

    }//GEN-LAST:event_s9_10ActionPerformed

    private void s10_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10_3ActionPerformed
        // TODO add your handling code here:
        isS10_3Select = sheetColor(s10_3, s10_3.isSelected(), isS10_3Sold);
        if (s10_3.isSelected()) {
            price += 20;
            seatName += "10_3 ";
        }
        if (!s10_3.isSelected()) {
            price -= 20;
            seatName = seatName.replaceAll("10_3 ", "");
        }

    }//GEN-LAST:event_s10_3ActionPerformed

    private void s10_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10_4ActionPerformed
        // TODO add your handling code here:
        isS10_4Select = sheetColor(s10_4, s10_4.isSelected(), isS10_4Sold);
        if (s10_4.isSelected()) {
            price += 20;
            seatName += "10_4 ";
        }
        if (!s10_4.isSelected()) {
            price -= 20;
            seatName = seatName.replaceAll("10_4 ", "");
        }

    }//GEN-LAST:event_s10_4ActionPerformed

    private void s10_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10_6ActionPerformed
        // TODO add your handling code here:
        isS10_6Select = sheetColor(s10_6, s10_6.isSelected(), isS10_6Sold);
        if (s10_6.isSelected()) {
            price += 20;
            seatName += "10_6 ";
        }
        if (!s10_6.isSelected()) {
            price -= 20;
            seatName = seatName.replaceAll("10_6 ", "");
        }

    }//GEN-LAST:event_s10_6ActionPerformed

    private void s10_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10_7ActionPerformed
        // TODO add your handling code here:
        isS10_7Select = sheetColor(s10_7, s10_7.isSelected(), isS10_7Sold);
        if (s10_7.isSelected()) {
            price += 20;
            seatName += "10_7 ";
        }
        if (!s10_7.isSelected()) {
            price -= 20;
            seatName = seatName.replaceAll("10_7 ", "");
        }

    }//GEN-LAST:event_s10_7ActionPerformed

    private void s10_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10_8ActionPerformed
        // TODO add your handling code here:
        isS10_8Select = sheetColor(s10_8, s10_8.isSelected(), isS10_8Sold);
        if (s10_8.isSelected()) {
            price += 20;
            seatName += "10_8 ";
        }
        if (!s10_8.isSelected()) {
            price -= 20;
            seatName = seatName.replaceAll("10_8 ", "");
        }

    }//GEN-LAST:event_s10_8ActionPerformed


    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        isS11Sold = bookSheet(s11, isS11Select, isS11Sold);
        isS12Sold = bookSheet(s12, isS12Select, isS12Sold);
        isS13Sold = bookSheet(s13, isS13Select, isS13Sold);
        isS14Sold = bookSheet(s14, isS14Select, isS14Sold);
        isS15Sold = bookSheet(s15, isS15Select, isS15Sold);
        isS16Sold = bookSheet(s16, isS16Select, isS16Sold);
        isS17Sold = bookSheet(s17, isS17Select, isS17Sold);
        isS18Sold = bookSheet(s18, isS18Select, isS18Sold);
        isS19Sold = bookSheet(s19, isS19Select, isS19Sold);
        isS1_10Sold = bookSheet(s1_10, isS1_10Select, isS1_10Sold);
        isS21Sold = bookSheet(s21, isS21Select, isS21Sold);
        isS22Sold = bookSheet(s22, isS22Select, isS22Sold);
        isS23Sold = bookSheet(s23, isS23Select, isS23Sold);
        isS24Sold = bookSheet(s24, isS24Select, isS24Sold);
        isS25Sold = bookSheet(s25, isS25Select, isS25Sold);
        isS26Sold = bookSheet(s26, isS26Select, isS26Sold);
        isS27Sold = bookSheet(s27, isS27Select, isS27Sold);
        isS28Sold = bookSheet(s28, isS28Select, isS28Sold);
        isS29Sold = bookSheet(s29, isS29Select, isS29Sold);
        isS2_10Sold = bookSheet(s2_10, isS2_10Select, isS2_10Sold);
        isS41Sold = bookSheet(s41, isS41Select, isS41Sold);
        isS42Sold = bookSheet(s42, isS42Select, isS42Sold);
        isS43Sold = bookSheet(s43, isS43Select, isS43Sold);
        isS44Sold = bookSheet(s44, isS44Select, isS44Sold);
        isS45Sold = bookSheet(s45, isS45Select, isS45Sold);
        isS46Sold = bookSheet(s46, isS46Select, isS46Sold);
        isS47Sold = bookSheet(s47, isS47Select, isS47Sold);
        isS48Sold = bookSheet(s48, isS48Select, isS48Sold);
        isS49Sold = bookSheet(s49, isS49Select, isS49Sold);
        isS4_10Sold = bookSheet(s4_10, isS4_10Select, isS4_10Sold);
        isS51Sold = bookSheet(s51, isS51Select, isS51Sold);
        isS52Sold = bookSheet(s52, isS52Select, isS52Sold);
        isS53Sold = bookSheet(s53, isS53Select, isS53Sold);
        isS54Sold = bookSheet(s54, isS54Select, isS54Sold);
        isS55Sold = bookSheet(s55, isS55Select, isS55Sold);
        isS56Sold = bookSheet(s56, isS56Select, isS56Sold);
        isS57Sold = bookSheet(s57, isS57Select, isS57Sold);
        isS58Sold = bookSheet(s58, isS58Select, isS58Sold);
        isS59Sold = bookSheet(s59, isS59Select, isS59Sold);
        isS5_10Sold = bookSheet(s5_10, isS5_10Select, isS5_10Sold);
        isS61Sold = bookSheet(s61, isS61Select, isS61Sold);
        isS62Sold = bookSheet(s62, isS62Select, isS62Sold);
        isS63Sold = bookSheet(s63, isS63Select, isS63Sold);
        isS64Sold = bookSheet(s64, isS64Select, isS64Sold);
        isS65Sold = bookSheet(s65, isS65Select, isS65Sold);
        isS66Sold = bookSheet(s66, isS66Select, isS66Sold);
        isS67Sold = bookSheet(s67, isS67Select, isS67Sold);
        isS68Sold = bookSheet(s68, isS68Select, isS68Sold);
        isS69Sold = bookSheet(s69, isS69Select, isS69Sold);
        isS6_10Sold = bookSheet(s6_10, isS6_10Select, isS6_10Sold);
        isS71Sold = bookSheet(s71, isS71Select, isS71Sold);
        isS72Sold = bookSheet(s72, isS72Select, isS72Sold);
        isS73Sold = bookSheet(s73, isS73Select, isS73Sold);
        isS74Sold = bookSheet(s74, isS74Select, isS74Sold);
        isS75Sold = bookSheet(s75, isS75Select, isS75Sold);
        isS76Sold = bookSheet(s76, isS76Select, isS76Sold);
        isS77Sold = bookSheet(s77, isS77Select, isS77Sold);
        isS78Sold = bookSheet(s78, isS78Select, isS78Sold);
        isS79Sold = bookSheet(s79, isS79Select, isS79Sold);
        isS7_10Sold = bookSheet(s7_10, isS7_10Select, isS7_10Sold);
        isS81Sold = bookSheet(s81, isS81Select, isS81Sold);
        isS82Sold = bookSheet(s82, isS82Select, isS82Sold);
        isS83Sold = bookSheet(s83, isS83Select, isS83Sold);
        isS84Sold = bookSheet(s84, isS84Select, isS84Sold);
        isS85Sold = bookSheet(s85, isS85Select, isS85Sold);
        isS86Sold = bookSheet(s86, isS86Select, isS86Sold);
        isS87Sold = bookSheet(s87, isS87Select, isS87Sold);
        isS88Sold = bookSheet(s88, isS88Select, isS88Sold);
        isS89Sold = bookSheet(s89, isS89Select, isS89Sold);
        isS8_10Sold = bookSheet(s8_10, isS8_10Select, isS8_10Sold);
        isS91Sold = bookSheet(s91, isS91Select, isS91Sold);
        isS92Sold = bookSheet(s92, isS92Select, isS92Sold);
        isS93Sold = bookSheet(s93, isS93Select, isS93Sold);
        isS94Sold = bookSheet(s94, isS94Select, isS94Sold);
        isS95Sold = bookSheet(s95, isS95Select, isS95Sold);
        isS96Sold = bookSheet(s96, isS96Select, isS96Sold);
        isS97Sold = bookSheet(s97, isS97Select, isS97Sold);
        isS98Sold = bookSheet(s98, isS98Select, isS98Sold);
        isS99Sold = bookSheet(s99, isS99Select, isS99Sold);
        isS9_10Sold = bookSheet(s9_10, isS9_10Select, isS9_10Sold);
        isS10_3Sold = bookSheet(s10_3, isS10_3Select, isS10_3Sold);
        isS10_4Sold = bookSheet(s10_4, isS10_4Select, isS10_4Sold);
        isS10_5Sold = bookSheet(s10_5, isS10_5Select, isS10_5Sold);
        isS10_6Sold = bookSheet(s10_6, isS10_6Select, isS10_6Sold);
        isS10_7Sold = bookSheet(s10_7, isS10_7Select, isS10_7Sold);
        isS10_8Sold = bookSheet(s10_8, isS10_8Select, isS10_8Sold);

        soldMessage();
        totalAmount.setText(Integer.toString(price));
        seats.setText(seatName);
        showMovieName.setText(movie);
        showMovieTime.setText(time);

        btnBook.setEnabled(false);
        btnGetTickets.setEnabled(true);

        JOptionPane.showMessageDialog(null, "Successfully reserved your seats.");


    }//GEN-LAST:event_btnBookActionPerformed

    private void s2_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_10ActionPerformed
        // TODO add your handling code here:
        isS11Select = sheetColor(s2_10, s2_10.isSelected(), isS2_10Sold);
        if (s2_10.isSelected()) {
            price += 20;
            seatName += "2_10 ";
        }
        if (!s2_10.isSelected()) {
            price -= 20;
            seatName = seatName.replaceAll("2_10 ", "");
        }
    }//GEN-LAST:event_s2_10ActionPerformed

    private void showMovieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMovieNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showMovieNameActionPerformed

    private void btnGetTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetTicketsActionPerformed
        // TODO add your handling code here:
        FinalTransaction finalTransaction = new FinalTransaction(movie, time, seatName, Integer.toString(price));
        finalTransaction.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnGetTicketsActionPerformed

    private void seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatsActionPerformed

    private void s10_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s10_9ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnGetTickets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton s10_3;
    private javax.swing.JToggleButton s10_4;
    private javax.swing.JToggleButton s10_5;
    private javax.swing.JToggleButton s10_6;
    private javax.swing.JToggleButton s10_7;
    private javax.swing.JToggleButton s10_8;
    private javax.swing.JToggleButton s10_9;
    private javax.swing.JToggleButton s11;
    private javax.swing.JToggleButton s12;
    private javax.swing.JToggleButton s13;
    private javax.swing.JToggleButton s14;
    private javax.swing.JToggleButton s15;
    private javax.swing.JToggleButton s16;
    private javax.swing.JToggleButton s17;
    private javax.swing.JToggleButton s18;
    private javax.swing.JToggleButton s19;
    private javax.swing.JToggleButton s1_10;
    private javax.swing.JToggleButton s21;
    private javax.swing.JToggleButton s22;
    private javax.swing.JToggleButton s23;
    private javax.swing.JToggleButton s24;
    private javax.swing.JToggleButton s25;
    private javax.swing.JToggleButton s26;
    private javax.swing.JToggleButton s27;
    private javax.swing.JToggleButton s28;
    private javax.swing.JToggleButton s29;
    private javax.swing.JToggleButton s2_10;
    private javax.swing.JToggleButton s41;
    private javax.swing.JToggleButton s42;
    private javax.swing.JToggleButton s43;
    private javax.swing.JToggleButton s44;
    private javax.swing.JToggleButton s45;
    private javax.swing.JToggleButton s46;
    private javax.swing.JToggleButton s47;
    private javax.swing.JToggleButton s48;
    private javax.swing.JToggleButton s49;
    private javax.swing.JToggleButton s4_10;
    private javax.swing.JToggleButton s51;
    private javax.swing.JToggleButton s52;
    private javax.swing.JToggleButton s53;
    private javax.swing.JToggleButton s54;
    private javax.swing.JToggleButton s55;
    private javax.swing.JToggleButton s56;
    private javax.swing.JToggleButton s57;
    private javax.swing.JToggleButton s58;
    private javax.swing.JToggleButton s59;
    private javax.swing.JToggleButton s5_10;
    private javax.swing.JToggleButton s61;
    private javax.swing.JToggleButton s62;
    private javax.swing.JToggleButton s63;
    private javax.swing.JToggleButton s64;
    private javax.swing.JToggleButton s65;
    private javax.swing.JToggleButton s66;
    private javax.swing.JToggleButton s67;
    private javax.swing.JToggleButton s68;
    private javax.swing.JToggleButton s69;
    private javax.swing.JToggleButton s6_10;
    private javax.swing.JToggleButton s71;
    private javax.swing.JToggleButton s72;
    private javax.swing.JToggleButton s73;
    private javax.swing.JToggleButton s74;
    private javax.swing.JToggleButton s75;
    private javax.swing.JToggleButton s76;
    private javax.swing.JToggleButton s77;
    private javax.swing.JToggleButton s78;
    private javax.swing.JToggleButton s79;
    private javax.swing.JToggleButton s7_10;
    private javax.swing.JToggleButton s81;
    private javax.swing.JToggleButton s82;
    private javax.swing.JToggleButton s83;
    private javax.swing.JToggleButton s84;
    private javax.swing.JToggleButton s85;
    private javax.swing.JToggleButton s86;
    private javax.swing.JToggleButton s87;
    private javax.swing.JToggleButton s88;
    private javax.swing.JToggleButton s89;
    private javax.swing.JToggleButton s8_10;
    private javax.swing.JToggleButton s91;
    private javax.swing.JToggleButton s92;
    private javax.swing.JToggleButton s93;
    private javax.swing.JToggleButton s94;
    private javax.swing.JToggleButton s95;
    private javax.swing.JToggleButton s96;
    private javax.swing.JToggleButton s97;
    private javax.swing.JToggleButton s98;
    private javax.swing.JToggleButton s99;
    private javax.swing.JToggleButton s9_10;
    private javax.swing.JTextField seats;
    private javax.swing.JTextField showMovieName;
    private javax.swing.JTextField showMovieTime;
    private javax.swing.JTextField totalAmount;
    // End of variables declaration//GEN-END:variables
}
