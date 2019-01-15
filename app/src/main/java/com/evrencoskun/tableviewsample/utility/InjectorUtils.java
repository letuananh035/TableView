package com.evrencoskun.tableviewsample.utility;

import android.content.Context;

import com.evrencoskun.tableviewsample.AppExecutors;
import com.evrencoskun.tableviewsample.data.UserRepository;
import com.evrencoskun.tableviewsample.data.database.UserDao;
import com.evrencoskun.tableviewsample.data.database.UserDatabase;
import com.evrencoskun.tableviewsample.data.network.UserNetworkDataSource;
import com.evrencoskun.tableviewsample.ui.viewmodel.MainViewModelFactory;

public class InjectorUtils {

    public static UserRepository getRepository(Context context) {
        // Get all we need
        UserDao userDao = UserDatabase.getInstance(context).userDao();
        AppExecutors executors = AppExecutors.getInstance();
        UserNetworkDataSource networkDataSource = UserNetworkDataSource.getInstance(executors);

        return UserRepository.getInstance(userDao, networkDataSource, executors);
    }

    public static MainViewModelFactory getMainViewModelFactory(Context context){
        UserRepository repository = getRepository(context);
        return new MainViewModelFactory(repository);
    }

}
