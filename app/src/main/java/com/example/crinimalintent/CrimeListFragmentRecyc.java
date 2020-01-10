package com.example.crinimalintent;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CrimeListFragmentRecyc extends Fragment {
    RecyclerView mCrimeRecyclerView;

public CrimeListFragmentRecyc(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

View view=inflater.inflate(R.layout.activity_crime_list_fragment_recyc,container,false);
        mCrimeRecyclerView=view.findViewById(R.id.recycler_view_id);
return view;

    }

    class CrimeHolder extends RecyclerView.ViewHolder{

TextView mCrimeTitle,mCrimeDate;
Crime acrimes;
        public CrimeHolder(LayoutInflater inflater,ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_criment_template,parent,false));
            mCrimeTitle=itemView.findViewById(R.id.crime_title);
            mCrimeDate=itemView.findViewById(R.id.crime_date);
        }
        public void Bind(Crime mcrime1) {
            acrimes=mcrime1;
mCrimeTitle.setText(acrimes.getmTitle());
mCrimeDate.setText(acrimes.getmDate().toString());

        }

    }
class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder>{
  private List<Crime> mcrimes;
    public CrimeAdapter(List<Crime> mcrimes){
      this.mcrimes=mcrimes;
          }

    @NonNull
    @Override
    public CrimeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
LayoutInflater layoutinflater=LayoutInflater.from(getActivity());

        return new CrimeHolder(layoutinflater,viewGroup);




    }

    @Override
    public void onBindViewHolder(@NonNull CrimeHolder crimeHolder, int i) {

          crimeHolder.Bind(mcrimes.get(i));
    }

    @Override
    public int getItemCount() {
        return mcrimes.size();
    }
}









}
