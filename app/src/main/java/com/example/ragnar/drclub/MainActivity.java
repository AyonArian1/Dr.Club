package com.example.ragnar.drclub;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

import android.view.View;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*Explode explode = new Explode();
        getWindow().setExitTransition(explode);*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        CardView mHospitalCard = (CardView) findViewById(R.id.hospital_card);
        mHospitalCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Hospital.class);
                startActivity(intent);

            }
        });

        CardView mDepeatmentCard = (CardView) findViewById(R.id.department_card);
        mDepeatmentCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Department.class));
            }
        });


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.share_id) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/Plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject Here...");
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Body Here...");
            startActivity(Intent.createChooser(shareIntent,"Share Via"));
            return true;
        }
        else if (id == R.id.about_us){
            startActivity(new Intent(MainActivity.this,AboutPage.class));
        }



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.gyno) {
            startActivity(new Intent(MainActivity.this,Gynecologist.class));
        } else if (id == R.id.cardio) {
            startActivity(new Intent(MainActivity.this,Cardiologist.class));
        } else if (id == R.id.neuro) {
            startActivity(new Intent(MainActivity.this,Neurologist.class));
        } else if (id == R.id.ophtal) {
            startActivity(new Intent(MainActivity.this,Ophthalmologist.class));
        } else if (id == R.id.gastro) {
            startActivity(new Intent(MainActivity.this,Gastroenterologist.class));
        } else if (id == R.id.ortho) {
            startActivity(new Intent(MainActivity.this,Orthopedic.class));
        } else if (id == R.id.nav_ibn) {
            startActivity(new Intent(MainActivity.this,Ibnsina.class));
        } else if (id == R.id.nav_osmani) {
            startActivity(new Intent(MainActivity.this,MagOsmani.class));
        } else if (id == R.id.nav_mount) {
            startActivity(new Intent(MainActivity.this,MtAdora.class));
        }else if (id == R.id.nav_ragib) {
            startActivity(new Intent(MainActivity.this,RagibRabeya.class));
        }


    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
