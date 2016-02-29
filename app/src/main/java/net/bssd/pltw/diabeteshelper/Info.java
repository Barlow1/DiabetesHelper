package net.bssd.pltw.diabeteshelper;

import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by PLTW on 2/25/2016.
 */
public class Info {
    private String mNumberCalories;

    public Info(){
    }

    public String getCalories() {
        return mNumberCalories;
    }

    public void setCalories(String mCalories) {
        this.mNumberCalories = mCalories;
    }


    public String toString() {
        return mNumberCalories;
    }





}
