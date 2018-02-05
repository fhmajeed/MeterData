package com.selfpractice.watermeterdataviewer;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class MeterAdapter extends Adapter<MeterAdapter.myViewHolder> {

    List<MeterData> list;

    public static class myViewHolder extends ViewHolder {
        private TextView tBatteryVoltage;
        private TextView tCounterReading;
        private TextView tErrorCode;
        private TextView tMeterNo;
        private TextView tModel;
        private TextView tPacketNo;
        private TextView tReceivedOn;
        private TextView tSno;
        private TextView tStartOfText;
        private TextView tWireStatus;

        public myViewHolder(View itemView) {

            super(itemView);

            this.tSno = (TextView) itemView.findViewById(R.id.textView);
            this.tReceivedOn = (TextView) itemView.findViewById(R.id.textView2);
            this.tStartOfText = (TextView) itemView.findViewById(R.id.textView3);
            this.tModel = (TextView) itemView.findViewById(R.id.textView4);
            this.tMeterNo = (TextView) itemView.findViewById(R.id.textView5);
            this.tWireStatus = (TextView) itemView.findViewById(R.id.textView6);
            this.tBatteryVoltage = (TextView) itemView.findViewById(R.id.textView7);
            this.tCounterReading = (TextView) itemView.findViewById(R.id.textView8);
            this.tPacketNo = (TextView) itemView.findViewById(R.id.textView9);
            this.tErrorCode = (TextView) itemView.findViewById(R.id.textView10);
        }
    }

    public MeterAdapter(List<MeterData> list) {
        this.list = list;
    }

    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item2, parent, false));
    }

    public void onBindViewHolder(myViewHolder holder, int position) {
        MeterData item = (MeterData) this.list.get(position);
        holder.tSno.setText(String.format("Sno : %d", new Object[]{Integer.valueOf(item.getSno())}));
        holder.tReceivedOn.setText(String.format("DateReceived : %s", new Object[]{item.getReceivedOn()}));
        holder.tStartOfText.setText(String.format("StartOfText : %s", new Object[]{item.getStartOfText()}));
        holder.tModel.setText(String.format("Model : %s", new Object[]{item.getModel()}));
        holder.tMeterNo.setText(String.format("MeterNo : %s", new Object[]{item.getMeterNo()}));
        holder.tWireStatus.setText(String.format("WireStatus : %s", new Object[]{item.getWireStatus()}));
        holder.tBatteryVoltage.setText(String.format("BatteryVoltage : %s", new Object[]{item.getBatteryVoltage()}));
        holder.tCounterReading.setText(String.format("CounterReading : %s", new Object[]{item.getCounterReading()}));
        holder.tPacketNo.setText(String.format("PacketNo : %s", new Object[]{item.getPacketNo()}));
        holder.tErrorCode.setText(String.format("ErrorCode : %s", new Object[]{item.getErrorCode()}));
    }

    public int getItemViewType(int position) {
        return position;
    }

    public int getItemCount() {
        return this.list.size();
    }
}