package com.saiproject.androidapk6;

public class CompanyAndDevice {


    private final  String COMPANY_NAME;
    private final String COMPANY_DEVICE;



    public CompanyAndDevice(String COMPANY_NAME,String COMPANY_DEVICE){

        this.COMPANY_DEVICE = COMPANY_DEVICE;
        this.COMPANY_NAME = COMPANY_NAME;

    }


    @Override
    public String toString() {
        return  String.format("%s from %s company .  %n%n%n",COMPANY_DEVICE,COMPANY_NAME);
    }
}
