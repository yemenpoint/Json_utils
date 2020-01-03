package com.yemenpoint.gson;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class shared {
    private SharedPreferences sharedPreferences;


    public <T> ArrayList<T> JSONTOARRAY(String json) {
        ArrayList<T> dd = new ArrayList<>();
        try{
            dd = new Gson().fromJson(json, new TypeToken<List<T>>() {}.getType());

        }catch (Exception e){
            Toast.makeText(App.getContext(),"field to parse the Array ",Toast.LENGTH_SHORT).show();
        }
        return dd;
    }

    public <T> T JSONTOMODEL(Class<T> tClass, String json) {
        try {
            return new Gson().fromJson(json, tClass);
        } catch (Exception e) {
            Toast.makeText(App.getContext(),"Field to parse the Class Will return null",Toast.LENGTH_SHORT).show();
            return null;
        }
    }

    public shared() {
        sharedPreferences = App.getContext().getSharedPreferences("USER", Context.MODE_PRIVATE);
    }

    public String get_shared(String key) {
        return sharedPreferences.getString(key, "");
    }

    public void set_sharedString(String key, String Data) {
        try {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(key, Data);
            editor.apply();
        } catch (Exception e) {
            Toast.makeText(App.getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void set_sharedJson(String key, ArrayList array) {
        try {
            Gson gson1 = new Gson();
            String json1 = gson1.toJson(array);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(key, json1);
            editor.apply();
        } catch (Exception e) {
            Toast.makeText(App.getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public static <T> List<T> convertFromJsonArray(String sJson, Class<T> tClass) {

        try {
            Gson gson = new Gson();
            List<T> listObjects = new ArrayList<>();

            //read each object of array with Json library
            JSONArray jsonArray = new JSONArray(sJson);
            for (int i = 0; i < jsonArray.length(); i++) {

                //get the object
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                //get string of object from Json library to convert it to real object with Gson library
                listObjects.add(gson.fromJson(jsonObject.toString(), tClass));
            }

            //return list with all generated objects
            return listObjects;

        } catch (Exception e) {
            e.printStackTrace();
        }

        //error: return null
        return null;
    }


}

