package senac.cursoandroid.gasolinaoualcool;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final float[] resultado = new float[1];
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView editAlcool = (TextView) findViewById(R.id.editAlcool);
                TextView editGasolina = (TextView) findViewById(R.id.editGasolina);
                TextView textResultado = (TextView) findViewById(R.id.textResultado);
                TextView textDescricao = (TextView) findViewById(R.id.textDescricao);
                float alcool = Float.parseFloat(editAlcool.getText().toString());
                float gasolina = Float.parseFloat(editGasolina.getText().toString());

                resultado[0] = (alcool / gasolina);
                if(resultado[0]<=0.7){
                textResultado.setText(resultado[0]+"");
                    textDescricao.setText("Abasteça com álcool!");
                }else{
                    textResultado.setText(resultado[0]+"");
                    textDescricao.setText("Abasteça com gasolina!");
                }

                textResultado.setVisibility(View.VISIBLE);
                textDescricao.setVisibility(View.VISIBLE);
            }
        });
    }
}
