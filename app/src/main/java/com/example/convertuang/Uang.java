package com.example.convertuang;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.convertuang.viewModels.ViewModelsUang;
import com.example.convertuang.databinding.FragmentUangBinding;
/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */

public class Uang extends Fragment {

    public ViewModelsUang mViewModels;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final FragmentUangBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_uang,container,false);

        mViewModels = new ViewModelProvider(this).get(ViewModelsUang.class);
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mViewModels.uang.setDollar(Integer.parseInt(binding.txtDollar.getText().toString()));
                mViewModels.uang.setRupiah(Integer.parseInt(binding.txtRupiah.getText().toString()));
                mViewModels.hitungTotal();
                binding.texthasil.setText(Integer.toString(mViewModels.uang.getRupiah()));

            }
        });
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}