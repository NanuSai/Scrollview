package com.saiproject.androidapk6;

import java.security.SecureRandom;

/**
 *
 */
public class Puzzle {

    //Create and array of type company and device
    private CompanyAndDevice[] companyAndDevices;
    private  int currentDeviceModel;
    private static final int NUMBER_OF_MODELS = 60;                             //Static class variable to defining total models


    private static final SecureRandom secureRandomNumbers = new SecureRandom();


    public Puzzle(){

        String[] companies = {"Apple", "Google","Sony","Liberia","Dorado"};
        String[] devices = { "Xperia Z3","Micromax 12","Samsung Galaxy Note3","Nokia 3310","Galaxy Note 10","Nexus 5","iPod Touch","Micromax 13",
                             "Xiaomi Redmi 5A","Xiaomi Redmi Note 4","Samsung Galaxy NotePro","iPhone X"};

        companyAndDevices = new CompanyAndDevice[NUMBER_OF_MODELS];

        currentDeviceModel = 0;

        for(int i = 0 ; i < companyAndDevices.length; i ++ )
            companyAndDevices[i] = new CompanyAndDevice(companies[i/12],devices[i%12]);



    }




    public void ShuffleCompanyAndDevices(){


        currentDeviceModel = 0;

        for(int firstDevice = 0 ; firstDevice < companyAndDevices.length ; firstDevice ++){

            int secondDevice = secureRandomNumbers.nextInt(NUMBER_OF_MODELS); /*Pick a random number from 0 -> NUMBER OF MODELS*/
           /*Swap*/
            CompanyAndDevice tempCompanyandDevice = companyAndDevices[firstDevice];
            companyAndDevices[firstDevice] = companyAndDevices[secondDevice];
            companyAndDevices[secondDevice] = tempCompanyandDevice;

        }


    }




    //Gives back all the models of companyAndDevices array
    public CompanyAndDevice giveModels(){

        if(currentDeviceModel < companyAndDevices.length)
            return companyAndDevices[currentDeviceModel++];

        else
            return null;

    }



}
