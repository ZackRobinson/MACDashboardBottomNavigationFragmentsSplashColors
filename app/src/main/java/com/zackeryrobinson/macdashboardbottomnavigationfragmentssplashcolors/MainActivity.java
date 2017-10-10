package com.zackeryrobinson.macdashboardbottomnavigationfragmentssplashcolors;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_account:
                    mTextMessage.setText(R.string.title_account);
                    return true;
                case R.id.navigation_pay:
                    mTextMessage.setText(R.string.title_pay);
                    return true;
                case R.id.navigation_benefits:
                    mTextMessage.setText(R.string.title_benefits);
                    return true;
                case R.id.navigation_training:
                    mTextMessage.setText(R.string.title_training);
                    return true;
                case R.id.navigation_marketing:
                    mTextMessage.setText(R.string.title_marketing);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}