package com.evrencoskun.tableviewsample.ui.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.evrencoskun.tableviewsample.data.UserRepository;
import com.evrencoskun.tableviewsample.data.database.entity.User;
import com.evrencoskun.tableviewsample.model.ServiceRequest;

import java.util.List;

public class MainViewModel extends ViewModel {

    private final UserRepository mRepository;
    private final LiveData<List<User>> mUserData;

    public MainViewModel(UserRepository mRepository) {
        this.mRepository = mRepository;
        this.mUserData = mRepository.getUserList();
    }

    public LiveData<List<User>> getUserList() {
        return mUserData;
    }

    public void postRequest(ServiceRequest serviceRequest) {
        mRepository.postServiceRequest(serviceRequest);
    }
}
