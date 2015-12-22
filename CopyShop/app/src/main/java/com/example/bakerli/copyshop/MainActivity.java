package com.example.bakerli.copyshop;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by bakerli on 2015/11/23.
 */
public class MainActivity  extends AppCompatActivity{

    Toolbar mToolBar;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mActionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolBar = (Toolbar)findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolBar);

        mDrawerLayout = (DrawerLayout)findViewById(R.id.main_drawerlayout);

        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,mToolBar,R.string.open_drawerlayout,R.string.close_drawerlayout){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("BMI");
                supportInvalidateOptionsMenu();
            }
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getSupportActionBar().setTitle("CopyShop");
                supportInvalidateOptionsMenu();
            }
        };


        mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);



    }
}
