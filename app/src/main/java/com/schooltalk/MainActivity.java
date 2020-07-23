package com.schooltalk;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.schooltalk.ui.login.LoginViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LoginViewModel mLoginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        //第一种方式注入
//        ((MainApplication)getApplication()).appComponent.inject(this);
//        mLoginViewModel.test();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);

        //第二种方式注入
//        ((MainApplication)getApplication()).appComponent.getViewModle().test();

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_school, R.id.navigation_record,R.id.navigation_my)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}
