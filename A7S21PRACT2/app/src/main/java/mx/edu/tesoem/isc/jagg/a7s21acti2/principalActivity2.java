package mx.edu.tesoem.isc.jagg.a7s21acti2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class principalActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);

    }
     public void opcsumar(View V){
         Intent intent = new Intent( this, SumarActivity2.class );
         startActivity(intent);

     }


}