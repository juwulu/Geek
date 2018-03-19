package com.jwl.technology;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends Activity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        initTabLayout();

    }

    private void initTabLayout() {
        mTabLayout = ((TabLayout) findViewById(R.id.tablayout));
        mTabLayout.addTab(mTabLayout.newTab().setText("App"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Android"));
        mTabLayout.addTab(mTabLayout.newTab().setText("IOS"));
        mTabLayout.addTab(mTabLayout.newTab().setText("前端"));
        mTabLayout.addTab(mTabLayout.newTab().setText("瞎推荐"));
        mTabLayout.addTab(mTabLayout.newTab().setText("拓展资源"));
        mTabLayout.addTab(mTabLayout.newTab().setText("福利"));

    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_gank) {
            // Handle the camera action
        } else if (id == R.id.nav_hotnews) {

        } else if (id == R.id.nav_article) {

        } else if (id == R.id.nav_zhihu) {

        } else if (id == R.id.nav_openeye) {

        } else if (id == R.id.nav_about) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
