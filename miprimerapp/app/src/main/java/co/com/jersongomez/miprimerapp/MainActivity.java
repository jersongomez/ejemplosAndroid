package co.com.jersongomez.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.btnAceptar);
        final EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        final TextView saludo = (TextView) findViewById(R.id.lblTitle);

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nombre_digitado = txtNombre.getText().toString();
                saludo.setText("Bienvenido "+nombre_digitado);
            }
        });
    }
}
