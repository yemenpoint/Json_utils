package com.yemenpoint.gson;


import android.app.Application;
import android.content.Context;

import java.util.ArrayList;


/**
 * App extending Application, is used to save some Lists and Objects with Application Context.
 **/


public class App extends Application {

    // Application Context
    private static Context context;



    @Override
    public void onCreate()
    {
        super.onCreate();

        // set App Context
        context = this.getApplicationContext();


    }



    //*********** Returns Application Context ********//

    public static Context getContext() {
        return context;
    }




    
}


