package com.example.persondemo;

public class ExcFormatField extends Exception{

    String badData;


    public ExcFormatField(String badData) {
        this.badData = badData;

    }

    @Override
    public String toString() {
        return "ExcFormatField{" +
                "badData='" + badData + '\'' +
                '}';
    }
}
