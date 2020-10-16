package mx.edu.tesoem.isc.jagg.a7s21acti2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SumarActivity2 extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar2);

         num1 = findViewById (R.id.txtnum1);
         num2 = findViewById(R.id.txtnum2);
        resultado = findViewById(R.id.lblresutado);

    }
    public void pcalcular(View V) {
        int Vnum1 = Integer.parseInt(num1.getText().toString());
        int Vnum2 = Integer.parseInt(num2.getText().toString());

        resultado.setText("La suma fue :" + ( Vnum1 + Vnum2));
    }
}