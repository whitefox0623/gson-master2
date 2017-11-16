package com.example.shardul.jsonparsingusinggson;

import android.nfc.Tag;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import android.util.Log;

/**
 * Created by Shardul on 22-04-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {


    private List<Contact> list = new ArrayList<>();

    private static final String TAG="MyActivity";

    RecyclerAdapter(List<Contact> list){
        this.list = list;
    }


    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);

        return new MyViewholder(view);
    }


    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {

        holder.Id.setText(Integer.toString(list.get(position).getId()));
        holder.Deveui.setText(list.get(position).getDevEUI());
        holder.Times.setText(list.get(position).getTimes());
        String PL=list.get(position).getPayload();
        String PL1=list.get(position).getPayload();
   //     String PL="b71194b00192a01193a01111a02222";
        //     String[] PayLoad={"0","0","0","0","0"};

//        for(int i=1;i<2;i++)
//        {

        try {




            String[] T0T = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
//        if (PL.substring(0,1).equals(T0T[0]))
//            holder.img0.setImageResource(R.drawable.p0);
//        else if(PL.substring(0,1).equals(T0T[1]))
//            holder.img0.setImageResource(R.drawable.p1);
//        else if(PL.substring(0,1).equals(T0T[2]))
//            holder.img0.setImageResource(R.drawable.p2);
//        else if(PL.substring(0,1).equals(T0T[3]))
//            holder.img0.setImageResource(R.drawable.p3);
//        else if(PL.substring(0,1).equals(T0T[4]))
//            holder.img0.setImageResource(R.drawable.p4);
//        else if(PL.substring(0,1).equals(T0T[5]))
//            holder.img0.setImageResource(R.drawable.p5);
//        else if(PL.substring(0,1).equals(T0T[6]))
//            holder.img0.setImageResource(R.drawable.p6);
//        else if(PL.substring(0,1).equals(T0T[7]))
//            holder.img0.setImageResource(R.drawable.p7);
//        else if(PL.substring(0,1).equals(T0T[8]))
//            holder.img0.setImageResource(R.drawable.p8);
//        else
//            holder.img0.setImageResource(R.drawable.p9);
////        }
////1數字
        if (PL.substring(1,2).equals(T0T[0]))
            holder.img1.setImageResource(R.drawable.red0);
        else if(PL.substring(1,2).equals(T0T[1]))
            holder.img1.setImageResource(R.drawable.red1);
        else if(PL.substring(1,2).equals(T0T[2]))
            holder.img1.setImageResource(R.drawable.red2);
        else if(PL.substring(1,2).equals(T0T[3]))
            holder.img1.setImageResource(R.drawable.red3);
        else if(PL.substring(1,2).equals(T0T[4]))
            holder.img1.setImageResource(R.drawable.red4);
        else if(PL.substring(1,2).equals(T0T[5]))
            holder.img1.setImageResource(R.drawable.red5);
        else if(PL.substring(1,2).equals(T0T[6]))
            holder.img1.setImageResource(R.drawable.red6);
        else if(PL.substring(1,2).equals(T0T[7]))
            holder.img1.setImageResource(R.drawable.red7);
        else if(PL.substring(1,2).equals(T0T[8]))
            holder.img1.setImageResource(R.drawable.red8);
        else
            holder.img1.setImageResource(R.drawable.red9);
//
//
//        if (PL.substring(1,2).equals(T0T[0]))
//            holder.img7.setImageResource(R.drawable.p0);
//        else if(PL.substring(1,2).equals(T0T[1]))
//            holder.img7.setImageResource(R.drawable.p1);
//        else if(PL.substring(1,2).equals(T0T[2]))
//            holder.img7.setImageResource(R.drawable.p2);
//        else if(PL.substring(1,2).equals(T0T[3]))
//            holder.img7.setImageResource(R.drawable.p3);
//        else if(PL.substring(1,2).equals(T0T[4]))
//            holder.img7.setImageResource(R.drawable.p4);
//        else if(PL.substring(1,2).equals(T0T[5]))
//            holder.img7.setImageResource(R.drawable.p5);
//        else if(PL.substring(1,2).equals(T0T[6]))
//            holder.img7.setImageResource(R.drawable.p6);
//        else if(PL.substring(1,2).equals(T0T[7]))
//            holder.img7.setImageResource(R.drawable.p7);
//        else if(PL.substring(1,2).equals(T0T[8]))
//            holder.img7.setImageResource(R.drawable.p8);
//        else
//            holder.img1.setImageResource(R.drawable.p9);
////2
        if (PL.substring(2,3).equals(T0T[0]))
            holder.img2.setImageResource(R.drawable.red0);
        else if(PL.substring(2,3).equals(T0T[1]))
            holder.img2.setImageResource(R.drawable.red1);
        else if(PL.substring(2,3).equals(T0T[2]))
            holder.img2.setImageResource(R.drawable.red2);
        else if(PL.substring(2,3).equals(T0T[3]))
            holder.img2.setImageResource(R.drawable.red3);
        else if(PL.substring(2,3).equals(T0T[4]))
            holder.img2.setImageResource(R.drawable.red4);
        else if(PL.substring(2,3).equals(T0T[5]))
            holder.img2.setImageResource(R.drawable.red5);
        else if(PL.substring(2,3).equals(T0T[6]))
            holder.img2.setImageResource(R.drawable.red6);
        else if(PL.substring(2,3).equals(T0T[7]))
            holder.img2.setImageResource(R.drawable.red7);
        else if(PL.substring(2,3).equals(T0T[8]))
            holder.img2.setImageResource(R.drawable.red8);
        else
            holder.img2.setImageResource(R.drawable.red9);
//
//        if (PL.substring(2,3).equals(T0T[0]))
//            holder.img8.setImageResource(R.drawable.p0);
//        else if(PL.substring(2,3).equals(T0T[1]))
//            holder.img8.setImageResource(R.drawable.p1);
//        else if(PL.substring(2,3).equals(T0T[2]))
//            holder.img8.setImageResource(R.drawable.p2);
//        else if(PL.substring(2,3).equals(T0T[3]))
//            holder.img8.setImageResource(R.drawable.p3);
//        else if(PL.substring(2,3).equals(T0T[4]))
//            holder.img8.setImageResource(R.drawable.p4);
//        else if(PL.substring(2,3).equals(T0T[5]))
//            holder.img8.setImageResource(R.drawable.p5);
//        else if(PL.substring(2,3).equals(T0T[6]))
//            holder.img8.setImageResource(R.drawable.p6);
//        else if(PL.substring(2,3).equals(T0T[7]))
//            holder.img8.setImageResource(R.drawable.p7);
//        else if(PL.substring(2,3).equals(T0T[8]))
//            holder.img8.setImageResource(R.drawable.p8);
//        else
//            holder.img8.setImageResource(R.drawable.p9);
////3
        if (PL.substring(3,4).equals(T0T[0]))
            holder.img3.setImageResource(R.drawable.red0);
        else if(PL.substring(3,4).equals(T0T[1]))
            holder.img3.setImageResource(R.drawable.red1);
        else if(PL.substring(3,4).equals(T0T[2]))
            holder.img3.setImageResource(R.drawable.red2);
        else if(PL.substring(3,4).equals(T0T[3]))
            holder.img3.setImageResource(R.drawable.red3);
        else if(PL.substring(3,4).equals(T0T[4]))
            holder.img3.setImageResource(R.drawable.red4);
        else if(PL.substring(3,4).equals(T0T[5]))
            holder.img3.setImageResource(R.drawable.red5);
        else if(PL.substring(3,4).equals(T0T[6]))
            holder.img3.setImageResource(R.drawable.red6);
        else if(PL.substring(3,4).equals(T0T[7]))
            holder.img3.setImageResource(R.drawable.red7);
        else if(PL.substring(3,4).equals(T0T[8]))
            holder.img3.setImageResource(R.drawable.red8);
        else
            holder.img3.setImageResource(R.drawable.red9);
//
//        if (PL.substring(3,4).equals(T0T[0]))
//            holder.img9.setImageResource(R.drawable.p0);
//        else if(PL.substring(3,4).equals(T0T[1]))
//            holder.img9.setImageResource(R.drawable.p1);
//        else if(PL.substring(3,4).equals(T0T[2]))
//            holder.img9.setImageResource(R.drawable.p2);
//        else if(PL.substring(3,4).equals(T0T[3]))
//            holder.img9.setImageResource(R.drawable.p3);
//        else if(PL.substring(3,4).equals(T0T[4]))
//            holder.img9.setImageResource(R.drawable.p4);
//        else if(PL.substring(3,4).equals(T0T[5]))
//            holder.img9.setImageResource(R.drawable.p5);
//        else if(PL.substring(3,4).equals(T0T[6]))
//            holder.img9.setImageResource(R.drawable.p6);
//        else if(PL.substring(3,4).equals(T0T[7]))
//            holder.img9.setImageResource(R.drawable.p7);
//        else if(PL.substring(3,4).equals(T0T[8]))
//            holder.img9.setImageResource(R.drawable.p8);
//        else
//            holder.img9.setImageResource(R.drawable.p9);
////4
        if (PL.substring(4,5).equals(T0T[0]))
            holder.img4.setImageResource(R.drawable.red0);
        else if(PL.substring(4,5).equals(T0T[1]))
            holder.img4.setImageResource(R.drawable.red1);
        else if(PL.substring(4,5).equals(T0T[2]))
            holder.img4.setImageResource(R.drawable.red2);
        else if(PL.substring(4,5).equals(T0T[3]))
            holder.img4.setImageResource(R.drawable.red3);
        else if(PL.substring(4,5).equals(T0T[4]))
            holder.img4.setImageResource(R.drawable.red4);
        else if(PL.substring(4,5).equals(T0T[5]))
            holder.img4.setImageResource(R.drawable.red5);
        else if(PL.substring(4,5).equals(T0T[6]))
            holder.img4.setImageResource(R.drawable.red6);
        else if(PL.substring(4,5).equals(T0T[7]))
            holder.img4.setImageResource(R.drawable.red7);
        else if(PL.substring(4,5).equals(T0T[8]))
            holder.img4.setImageResource(R.drawable.red8);
        else
            holder.img4.setImageResource(R.drawable.red9);
//
//
//        if (PL.substring(4,5).equals(T0T[0]))
//            holder.img10.setImageResource(R.drawable.p0);
//        else if(PL.substring(4,5).equals(T0T[1]))
//            holder.img10.setImageResource(R.drawable.p1);
//        else if(PL.substring(4,5).equals(T0T[2]))
//            holder.img10.setImageResource(R.drawable.p2);
//        else if(PL.substring(4,5).equals(T0T[3]))
//            holder.img10.setImageResource(R.drawable.p3);
//        else if(PL.substring(4,5).equals(T0T[4]))
//            holder.img10.setImageResource(R.drawable.p4);
//        else if(PL.substring(4,5).equals(T0T[5]))
//            holder.img10.setImageResource(R.drawable.p5);
//        else if(PL.substring(4,5).equals(T0T[6]))
//            holder.img10.setImageResource(R.drawable.p6);
//        else if(PL.substring(4,5).equals(T0T[7]))
//            holder.img10.setImageResource(R.drawable.p7);
//        else if(PL.substring(4,5).equals(T0T[8]))
//            holder.img10.setImageResource(R.drawable.p8);
//        else
//            holder.img10.setImageResource(R.drawable.p9);
////5
        if (PL.substring(5,6).equals(T0T[0]))
            holder.img5.setImageResource(R.drawable.red0);
        else if(PL.substring(5,6).equals(T0T[1]))
            holder.img5.setImageResource(R.drawable.red1);
        else if(PL.substring(5,6).equals(T0T[2]))
            holder.img5.setImageResource(R.drawable.red2);
        else if(PL.substring(5,6).equals(T0T[3]))
            holder.img5.setImageResource(R.drawable.red3);
        else if(PL.substring(5,6).equals(T0T[4]))
            holder.img5.setImageResource(R.drawable.red4);
        else if(PL.substring(5,6).equals(T0T[5]))
            holder.img5.setImageResource(R.drawable.red5);
        else if(PL.substring(5,6).equals(T0T[6]))
            holder.img5.setImageResource(R.drawable.red6);
        else if(PL.substring(5,6).equals(T0T[7]))
            holder.img5.setImageResource(R.drawable.red7);
        else if(PL.substring(5,6).equals(T0T[8]))
            holder.img5.setImageResource(R.drawable.red8);
        else
            holder.img5.setImageResource(R.drawable.red9);
//
//
//
//        if (PL.substring(5,6).equals(T0T[0]))
//            holder.img11.setImageResource(R.drawable.p0);
//        else if(PL.substring(5,6).equals(T0T[1]))
//            holder.img11.setImageResource(R.drawable.p1);
//        else if(PL.substring(5,6).equals(T0T[2]))
//            holder.img11.setImageResource(R.drawable.p2);
//        else if(PL.substring(5,6).equals(T0T[3]))
//            holder.img11.setImageResource(R.drawable.p3);
//        else if(PL.substring(5,6).equals(T0T[4]))
//            holder.img11.setImageResource(R.drawable.p4);
//        else if(PL.substring(5,6).equals(T0T[5]))
//            holder.img11.setImageResource(R.drawable.p5);
//        else if(PL.substring(5,6).equals(T0T[6]))
//            holder.img11.setImageResource(R.drawable.p6);
//        else if(PL.substring(5,6).equals(T0T[7]))
//            holder.img11.setImageResource(R.drawable.p7);
//        else if(PL.substring(5,6).equals(T0T[8]))
//            holder.img11.setImageResource(R.drawable.p8);
//        else
//            holder.img11.setImageResource(R.drawable.p9);

Log.e(TAG,"hi");

//8
        if (PL.substring(8,9).equals(T0T[0]))
            holder.img8.setImageResource(R.drawable.red0);
        else if(PL.substring(8,9).equals(T0T[1]))
            holder.img8.setImageResource(R.drawable.red1);
        else if(PL.substring(8,9).equals(T0T[2]))
            holder.img8.setImageResource(R.drawable.red2);
        else if(PL.substring(8,9).equals(T0T[3]))
            holder.img8.setImageResource(R.drawable.red3);
        else if(PL.substring(8,9).equals(T0T[4]))
            holder.img8.setImageResource(R.drawable.red4);
        else if(PL.substring(8,9).equals(T0T[5]))
            holder.img8.setImageResource(R.drawable.red5);
        else if(PL.substring(8,9).equals(T0T[6]))
            holder.img8.setImageResource(R.drawable.red6);
        else if(PL.substring(8,9).equals(T0T[7]))
            holder.img8.setImageResource(R.drawable.red7);
        else if(PL.substring(8,9).equals(T0T[8]))
            holder.img8.setImageResource(R.drawable.red8);
        else
            holder.img8.setImageResource(R.drawable.red9);

        //9
        if (PL.substring(9,10).equals(T0T[0]))
            holder.img9.setImageResource(R.drawable.red0);
        else if(PL.substring(9,10).equals(T0T[1]))
            holder.img9.setImageResource(R.drawable.red1);
        else if(PL.substring(9,10).equals(T0T[2]))
            holder.img9.setImageResource(R.drawable.red2);
        else if(PL.substring(9,10).equals(T0T[3]))
            holder.img9.setImageResource(R.drawable.red3);
        else if(PL.substring(9,10).equals(T0T[4]))
            holder.img9.setImageResource(R.drawable.red4);
        else if(PL.substring(9,10).equals(T0T[5]))
            holder.img9.setImageResource(R.drawable.red5);
        else if(PL.substring(9,10).equals(T0T[6]))
            holder.img9.setImageResource(R.drawable.red6);
        else if(PL.substring(9,10).equals(T0T[7]))
            holder.img9.setImageResource(R.drawable.red7);
        else if(PL.substring(9,10).equals(T0T[8]))
            holder.img9.setImageResource(R.drawable.red8);
        else
            holder.img9.setImageResource(R.drawable.red9);
        //10
        if (PL.substring(10,11).equals(T0T[0]))
            holder.img10.setImageResource(R.drawable.red0);
        else if(PL.substring(10,11).equals(T0T[1]))
            holder.img10.setImageResource(R.drawable.red1);
        else if(PL.substring(10,11).equals(T0T[2]))
            holder.img10.setImageResource(R.drawable.red2);
        else if(PL.substring(10,11).equals(T0T[3]))
            holder.img10.setImageResource(R.drawable.red3);
        else if(PL.substring(10,11).equals(T0T[4]))
            holder.img10.setImageResource(R.drawable.red4);
        else if(PL.substring(10,11).equals(T0T[5]))
            holder.img10.setImageResource(R.drawable.red5);
        else if(PL.substring(10,11).equals(T0T[6]))
            holder.img10.setImageResource(R.drawable.red6);
        else if(PL.substring(10,11).equals(T0T[7]))
            holder.img10.setImageResource(R.drawable.red7);
        else if(PL.substring(10,11).equals(T0T[8]))
            holder.img10.setImageResource(R.drawable.red8);
        else
            holder.img10.setImageResource(R.drawable.red9);

        //11
        if (PL.substring(11,12).equals(T0T[0]))
            holder.img11.setImageResource(R.drawable.red0);
        else if(PL.substring(11,12).equals(T0T[1]))
            holder.img11.setImageResource(R.drawable.red1);
        else if(PL.substring(11,12).equals(T0T[2]))
            holder.img11.setImageResource(R.drawable.red2);
        else if(PL.substring(11,12).equals(T0T[3]))
            holder.img11.setImageResource(R.drawable.red3);
        else if(PL.substring(11,12).equals(T0T[4]))
            holder.img11.setImageResource(R.drawable.red4);
        else if(PL.substring(11,12).equals(T0T[5]))
            holder.img11.setImageResource(R.drawable.red5);
        else if(PL.substring(11,12).equals(T0T[6]))
            holder.img11.setImageResource(R.drawable.red6);
        else if(PL.substring(11,12).equals(T0T[7]))
            holder.img11.setImageResource(R.drawable.red7);
        else if(PL.substring(11,12).equals(T0T[8]))
            holder.img11.setImageResource(R.drawable.red8);
        else
            holder.img11.setImageResource(R.drawable.red9);




//       // 12
        if (PL.substring(12,13).equals(T0T[0]))
            holder.img12.setImageResource(R.drawable.green0);
        else if(PL.substring(12,13).equals(T0T[1]))
            holder.img12.setImageResource(R.drawable.green1);
        else if(PL.substring(12,13).equals(T0T[2]))
            holder.img12.setImageResource(R.drawable.green2);
        else if(PL.substring(12,13).equals(T0T[3]))
            holder.img12.setImageResource(R.drawable.green3);
        else if(PL.substring(12,13).equals(T0T[4]))
            holder.img12.setImageResource(R.drawable.green4);
        else if(PL.substring(12,13).equals(T0T[5]))
            holder.img12.setImageResource(R.drawable.green5);
        else if(PL.substring(12,13).equals(T0T[6]))
            holder.img12.setImageResource(R.drawable.green6);
        else if(PL.substring(12,13).equals(T0T[7]))
            holder.img12.setImageResource(R.drawable.green8);
        else
            holder.img12.setImageResource(R.drawable.green9);

//
//        //13
           if (PL.substring(13,14).equals(T0T[0]))
        holder.img13.setImageResource(R.drawable.green0);
        else if(PL.substring(13,14).equals(T0T[1]))
            holder.img13.setImageResource(R.drawable.green1);
        else if(PL.substring(13,14).equals(T0T[2]))
            holder.img13.setImageResource(R.drawable.green2);
        else if(PL.substring(13,14).equals(T0T[3]))
            holder.img13.setImageResource(R.drawable.green3);
        else if(PL.substring(13,14).equals(T0T[4]))
            holder.img13.setImageResource(R.drawable.green4);
        else if(PL.substring(13,14).equals(T0T[5]))
            holder.img13.setImageResource(R.drawable.green5);
        else if(PL.substring(13,14).equals(T0T[6]))
            holder.img13.setImageResource(R.drawable.green6);
        else if(PL.substring(13,14).equals(T0T[7]))
            holder.img13.setImageResource(R.drawable.green8);
        else
           { holder.img13.setImageResource(R.drawable.green9);}







            //       String PLtest1=PL.substring(0,1);




            holder.Payload.setText(PL.substring(1,5)+"."+PL.substring(5,6));
            holder.Rssi.setText(PL.substring(7,9)+"."+PL.substring(9,12));
            holder.Snr.setText(PL.substring(13,17)+"."+PL.substring(17,18));
            holder.Lrrid1.setText(PL.substring(19,23)+"."+PL.substring(23,24));
            holder.WWW.setText(PL.substring(25,29)+"."+PL.substring(29,30));

//            String test="a";
//            if(PL.substring(0,1).equals(test)){
//                //            int i =Integer.parseInt(pltest1);
//                holder.Payload.setText(PL.substring(1,5)+"."+PL.substring(5,6));
//            }
//            else {
//                holder.Payload.setText("-"+PL.substring(1,5)+"."+PL.substring(5,6));
//            }
//
//
//            if(PL.substring(6,7).equals(test)){
//                holder.Rssi.setText(PL.substring(7,9)+"."+PL.substring(9,12));
//            }
//            else {
//                holder.Rssi.setText("-"+PL.substring(7,9)+"."+PL.substring(9,12));
//            }
//
//
//            if(PL.substring(12,13).equals(test)){
//                holder.Snr.setText(PL.substring(13,17)+"."+PL.substring(17,18));
//            }
//            else {
//                holder.Snr.setText("-"+PL.substring(13,17)+"."+PL.substring(17,18));
//            }
//
//
//            if(PL.substring(18,19).equals(test)){
//                holder.Lrrid1.setText(PL.substring(19,23)+"."+PL.substring(23,24));
//            }
//            else {
//                holder.Lrrid1.setText("-"+PL.substring(19,23)+"."+PL.substring(23,24));
//            }
//
//
//            if(PL.substring(24,25).equals(test)){
//                holder.WWW.setText(PL.substring(25,29)+"."+PL.substring(29,30));
//            }
//            else {
//                holder.WWW.setText("-"+PL.substring(25,29)+"."+PL.substring(29,30));
//            }





//        //    B_____  A  _______B_______ A _____
//            if(PLtest1[0].length()<=5) {
//                holder.Payload.setText(PLtest1[0]);
//            }
//            else{
//                holder.Payload.setText("-"+PLtest1[0].substring(1,6));
//            }

//            String[] PLtest2 = PL.substring(5).split("a");
//            if(PLtest2[0].length()<=5) {
//                holder.Rssi.setText(PLtest2[0]);
//            }
//            else{
//                holder.Rssi.setText("-"+PLtest2[0].substring(1));
//            }
//            holder.Rssi.setText(PLtest[1]);
//            holder.Snr.setText(PLtest[2]);
//            holder.Lrrid1.setText(PLtest[3]);
//            holder.WWW.setText(PLtest[4]);
            //  holder.Payload.setText(list.get(position).getPayload());
//            holder.Times.setText(list.get(position).getTimes());
            //       Log.e(TAG,"error");
//            holder.Rssi.setText(list.get(position).getRssi());
//            holder.Snr.setText(list.get(position).getSnr());
//            holder.Lrrid1.setText(list.get(position).getLrrid1());
        }
        catch (Exception ex){
            //           holder.Lrrid1.setText(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }



    @Override
    public int getItemCount() {
        return list.size();
    }







    public static class MyViewholder extends RecyclerView.ViewHolder{

        TextView Id,Deveui,Payload,Times,Rssi,Snr,Lrrid1,WWW;
        ImageView img0,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13;

        public MyViewholder(View itemView) {
            super(itemView);
            Id = (TextView)itemView.findViewById(R.id.id);
            Deveui = (TextView)itemView.findViewById(R.id.deveui);
            Payload = (TextView)itemView.findViewById(R.id.payload);
            Times = (TextView)itemView.findViewById(R.id.times);
            Rssi = (TextView)itemView.findViewById(R.id.rssi);
            Snr = (TextView)itemView.findViewById(R.id.snr);
            Lrrid1 = (TextView)itemView.findViewById(R.id.lrrid1);
            WWW = (TextView)itemView.findViewById(R.id.www);
//            img0=(ImageView)itemView.findViewById(R.id.imageView0);
            img1=(ImageView)itemView.findViewById(R.id.imageView1);
            img2=(ImageView)itemView.findViewById(R.id.imageView2);
            img3=(ImageView)itemView.findViewById(R.id.imageView3);
            img4=(ImageView)itemView.findViewById(R.id.imageView4);
            img5=(ImageView)itemView.findViewById(R.id.imageView5);
//            img6=(ImageView)itemView.findViewById(R.id.imageView6);
//            img7=(ImageView)itemView.findViewById(R.id.imageView7);


            img8=(ImageView)itemView.findViewById(R.id.imageView8);
            img9=(ImageView)itemView.findViewById(R.id.imageView9);
            img10=(ImageView)itemView.findViewById(R.id.imageView10);
            img11=(ImageView)itemView.findViewById(R.id.imageView11);
            img12=(ImageView)itemView.findViewById(R.id.imageView12);
            img13=(ImageView)itemView.findViewById(R.id.imageView13);

        }
    }
}
