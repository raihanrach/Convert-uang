package com.example.convertuang.viewModels;

import androidx.lifecycle.ViewModel;

import com.example.convertuang.models.ConvertUang;

//import com.example.convertuang.models.ConvertUang;

public class ViewModelsUang extends ViewModel {
    public ConvertUang uang = new ConvertUang();

    public void hitungTotal(){

        uang.setRupiah(uang.getDollar()*14500);

    }
}
