package com.example.crinimalintent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class CrimeFragment extends Fragment {

    private Crime mCrime=new Crime();
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    //private EditText mTitleField;
    //private CheckBox mSolvedCheckBox;
    public CrimeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View v= inflater.inflate(R.layout.fragment_crime, container, false);
     mTitleField=v.findViewById(R.id.crime_title);
     mDateButton=v.findViewById(R.id.crime_date);
     mDateButton.setText(mCrime.getmDate().toString());
     mDateButton.setEnabled(false);
mSolvedCheckBox=v.findViewById(R.id.crime_solved);
mTitleField.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
mCrime.setmTitle(charSequence.toString());
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
});

mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        mCrime.setmSolved(b);
    }
});




     return v;
    }

}
