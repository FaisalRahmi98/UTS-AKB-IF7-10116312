/**
 * 22/05/2019-10116312-Faisal Rahmi-IF7/AKB-7
 */
package com.faisal.uts_akb_if7_10116312;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.faisal.uts_akb_if7_10116312";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);

        final ProfilFragment profilFragment = new ProfilFragment();
        final KontakFragment kontakFragment = new KontakFragment();
        final TemanFragment temanFragment = new TemanFragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if(id == R.id.profil){
                    setFragment(profilFragment);
                    return true;
                } else if(id == R.id.kontak){
                    setFragment(kontakFragment);
                    return true;
                } else if(id == R.id.teman){
                    setFragment(temanFragment);
                    return true;
                }
                return false;
            }
        });

        navigationView.setSelectedItemId(R.id.profil);
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }

    public void openInstagram(View view) {
        String url = "https://instagram.com/faisal.rahmi?igshid=f2m2zeou7vmb";
        Intent buka = new Intent(Intent.ACTION_VIEW);
        buka.setData(Uri.parse(url));
        startActivity(buka);
    }

    public void openEmail(View view) {
        String url = "mailto:rahmi.faisal@gmail.com";
        Intent buka = new Intent(Intent.ACTION_VIEW);
        buka.setData(Uri.parse(url));
        startActivity(buka);
    }

    public void openPhone(View view) {
        String nomor = "083823516946";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(panggil);
    }
}
