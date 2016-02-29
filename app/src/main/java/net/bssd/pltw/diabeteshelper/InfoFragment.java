package net.bssd.pltw.diabeteshelper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by PLTW on 2/25/2016.
 */
public class InfoFragment extends Fragment {

    private Info mInfo;
    public EditText mEditCalories;
    public TextView mNumberCalories;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        mNumberCalories = (TextView) rootView.findViewById(R.id.caloric_number);
        mEditCalories = (EditText) rootView.findViewById(R.id.enter_caloric_intake);

        mNumberCalories.setText(mInfo.getCalories());

        NumberCaloriesTextChanger numberCaloriesTextChanger = new NumberCaloriesTextChanger();

        mEditCalories.addTextChangedListener(numberCaloriesTextChanger);

        return rootView;

    }

    private class NumberCaloriesTextChanger implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            mInfo.setCalories(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {
            mNumberCalories.setText(mInfo.getCalories());
        }
    }

    }
