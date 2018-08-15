package sugoi.android.amazfun;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import sugoi.android.amazfun.core.logout.LogoutContract;
import sugoi.android.amazfun.core.logout.LogoutPresenter;
import sugoi.android.amazfun.ui.activities.ChatActivity;
import sugoi.android.amazfun.ui.activities.LoginActivity;
import sugoi.android.amazfun.ui.activities.UserListingActivity;

public class MainActivity extends AppCompatActivity implements LogoutContract.View{
    private LogoutPresenter mLogoutPresenter;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private CollapsingToolbarLayout cp;
    public static void startActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public static void startActivity(Context context, int flags) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(flags);
        context.startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mLogoutPresenter = new LogoutPresenter(this);
        initNavigationDrawer();
        NestedScrollView fsa=(NestedScrollView)findViewById(R.id.nstscmain);
        fsa.setFillViewport(true);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                ImageView a=(ImageView)findViewById(R.id.tbhead);
                switch(position)
                {
                    case 0:
                        a.setImageResource(R.drawable.ctbhome);
                        break;
                    case 1:
                        a.setImageResource(R.drawable.ctbfeed);
                        break;
                    case 2:
                        a.setImageResource(R.drawable.ctbchat);
                        break;

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_user_listing, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                try{
                    logout();}
                catch (Exception e){}
                return true;
            case R.id.action_search_main:
                UserListingActivity.startActivity(this);
                return  true;

        }
        return super.onOptionsItemSelected(item);
    }

    private void logout() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.logout)
                .setMessage(R.string.are_you_sure)
                .setPositiveButton(R.string.logout, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try {


                            dialog.dismiss();
                            mLogoutPresenter.logout();}catch (Exception e){}
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    @Override
    public void onLogoutSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        LoginActivity.startIntent(this,
                Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
    }

    @Override
    public void onLogoutFailure(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void initNavigationDrawer() {

        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                int id = menuItem.getItemId();

                //to do something when an option is selected in navigation drawer
                switch (id){
                    case R.id.homenab:
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.cht:
                        UserListingActivity.startActivity(MainActivity.this);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.sprt:
                        startActivity(new Intent(getApplicationContext(),SupportActiity.class));
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.logout:
                        logout();
                        drawerLayout.closeDrawers();
                        break;

                }
                return true;

            }
        });
        View header = navigationView.getHeaderView(0);
        TextView tv_email = (TextView)header.findViewById(R.id.ppicindr);
        tv_email.setText("Syed Sauban");
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.drawer_open,
                R.string.drawer_close){

            //on navigation drawer close and open
            @Override
            public void onDrawerClosed(View v){

                super.onDrawerClosed(v);
            }

            @Override
            public void onDrawerOpened(View v)
            {
                super.onDrawerClosed(v);

            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }
}
