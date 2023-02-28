package kutumbh.care.itemary.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import kutumbh.care.itemary.R;

public class LoginActivity extends AppCompatActivity {



        Button signIn,signUp;
        BottomSheetDialog sheetDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        signInSheet();
        signUpSheet();




    }

    private void signUpSheet() {
        signUp=findViewById( R.id.createAccount);
        signUp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sheetDialog=new BottomSheetDialog( LoginActivity.this,R.style.AppBottomSheetDialogTheme);
                View i= LayoutInflater.from( LoginActivity.this ).inflate( R.layout.sheet_register,(LinearLayout)findViewById( R.id.register_sheet ) );
                sheetDialog.setContentView( i);
                sheetDialog.show();





            }
        } );
    }

    private void signInSheet() {
        signIn=findViewById( R.id.login_btn );
        signIn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sheetDialog=new BottomSheetDialog( LoginActivity.this,R.style.AppBottomSheetDialogTheme);
                View i= LayoutInflater.from( LoginActivity.this ).inflate( R.layout.sheet_login,(LinearLayout)findViewById( R.id.login_sheet ) );
                sheetDialog.setContentView( i);
                sheetDialog.show();
            }
        } );


    }
}