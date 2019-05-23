/**
 * 22/05/2019-10116312-Faisal Rahmi-IF7/AKB-7
 */
package com.faisal.uts_akb_if7_10116312.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.faisal.uts_akb_if7_10116312.R;

public class PageFragment3 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.page_3,container, false);
        return rootview;



    }
}
