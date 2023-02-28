package kutumbh.care.itemary.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import kutumbh.care.itemary.R;

public class DashActivity extends AppCompatActivity {


    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dash );


        navigationView = findViewById( R.id.navigation );
        navigationView.setOnNavigationItemSelectedListener( selectedListener );

        HomeFragment fragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace( R.id.content, fragment, "" );
        fragmentTransaction.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    HomeFragment fragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace( R.id.content, fragment, "" );
                    fragmentTransaction.commit();
                    return true;

                case R.id.nav_categories:
                    CategoriesFragment fragmentCategories = new CategoriesFragment();
                    FragmentTransaction fragmentTransactionCategories = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionCategories.replace( R.id.content, fragmentCategories, "" );
                    fragmentTransactionCategories.commit();
                    return true;

                case R.id.nav_store:
                    CategoriesFragment fragmentStore = new CategoriesFragment();
                    FragmentTransaction fragmentTransactionStore = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionStore.replace( R.id.content, fragmentStore, "" );
                    fragmentTransactionStore.commit();
                    return true;

                case R.id.nav_account:
                    AccountFragmemnt fragmentaccount = new AccountFragmemnt();
                    FragmentTransaction fragmentTransactionAccount = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionAccount.replace( R.id.content, fragmentaccount, "" );
                    fragmentTransactionAccount.commit();
                    return true;


            }
            return false;
        }
    };
}
