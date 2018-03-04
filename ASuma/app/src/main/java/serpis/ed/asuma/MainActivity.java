package serpis.ed.asuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        EditText number1 = (EditText)findViewById(R.id.number1);
        EditText number2 = (EditText)findViewById(R.id.number2);
        TextView resultado = (TextView)findViewById(R.id.resultado);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int suma = num1+num2;

        resultado.setText(Integer.toString(suma));
    }
}
