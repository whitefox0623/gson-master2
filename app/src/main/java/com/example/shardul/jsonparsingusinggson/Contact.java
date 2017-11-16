package com.example.shardul.jsonparsingusinggson;

/**
 * Created by Shardul on 22-04-2017.
 */

public class Contact {
    private int ID;
    // private char Rssi,Snr;
    private String DevEUI,Payload,Times,RSSI,SNR,Lrrid1;

    public int getId() {
        return ID;
    }

    public String getDevEUI() {
        return DevEUI;
    }

    public String getPayload() {return Payload;}
    public String getTimes() {
        return Times;
    }



    public String getRssi() {
        return RSSI;
    }
    public String getSnr() {
        return SNR;
    }
    public String getLrrid1() {
        return Lrrid1;
    }
}
