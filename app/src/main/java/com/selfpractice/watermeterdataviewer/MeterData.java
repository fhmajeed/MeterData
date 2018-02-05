package com.selfpractice.watermeterdataviewer;

public class MeterData {
    public int Sno;
    public String batteryVoltage;
    public String counterReading;
    public String errorCode;
    public String f9;
    public String meterNo;
    public String model;
    public String packetNo;
    public String receivedOn;
    public String startOfText;
    public String wireStatus;

    public String toString() {
        return "MeterData{sNo=" + this.Sno + ", receivedOn='" + this.receivedOn + '\'' + ", startOfText='" + this.startOfText + '\'' + ", model='" + this.model + '\'' + ", meterNo='" + this.meterNo + '\'' + ", wireStatus='" + this.wireStatus + '\'' + ", batteryVoltage='" + this.batteryVoltage + '\'' + ", counterReading='" + this.counterReading + '\'' + ", packetNo='" + this.packetNo + '\'' + ", errorCode='" + this.errorCode + '\'' + ", f9='" + this.f9 + '\'' + '}';
    }

    public int getSno() {
        return this.Sno;
    }

    public void setSno(int sno) {
        this.Sno = sno;
    }

    public String getReceivedOn() {
        return this.receivedOn;
    }

    public void setReceivedOn(String receivedOn) {
        this.receivedOn = receivedOn;
    }

    public String getStartOfText() {
        return this.startOfText;
    }

    public void setStartOfText(String startOfText) {
        this.startOfText = startOfText;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMeterNo() {
        return this.meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getWireStatus() {
        return this.wireStatus;
    }

    public void setWireStatus(String wireStatus) {
        this.wireStatus = wireStatus;
    }

    public String getBatteryVoltage() {
        return this.batteryVoltage;
    }

    public void setBatteryVoltage(String batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public String getCounterReading() {
        return this.counterReading;
    }

    public void setCounterReading(String counterReading) {
        this.counterReading = counterReading;
    }

    public String getPacketNo() {
        return this.packetNo;
    }

    public void setPacketNo(String packetNo) {
        this.packetNo = packetNo;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getF9() {
        return this.f9;
    }

    public void setF9(String f9) {
        this.f9 = f9;
    }
}