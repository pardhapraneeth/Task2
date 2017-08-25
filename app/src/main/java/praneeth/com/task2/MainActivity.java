package praneeth.com.task2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.spark.submitbutton.SubmitButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton mradibutton1 =(RadioButton)findViewById(R.id.radioButton);
        final RadioButton mradibutton2 =(RadioButton)findViewById(R.id.radioButton2);
        final RadioButton mradibutton3 =(RadioButton)findViewById(R.id.radioButton3);

        RadioGroup mradiogroup = (RadioGroup)findViewById(R.id.radioGroup);

        SubmitButton sb = (SubmitButton) findViewById(R.id.btn3);
        final TextView text=(TextView)findViewById(R.id.textView);
        final EditText edit1 = (EditText) findViewById(R.id.editText);

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                
                try {
                    double result = new Double(edit1.getText().toString());
                    if (mradibutton2.isChecked()) {

                        result = Converter.Celcius(result);
                    } else if (mradibutton3.isChecked()) {
                        result = Converter.Farenheit(result);
                    } else if(mradibutton1.isChecked()) {
                        result = Converter.miles(result);
                    }
                    else{
                       Toast.makeText(getApplicationContext(),"Select Radio Button",Toast.LENGTH_SHORT).show();
                        result= Double.parseDouble(null);

                    }

                    text.setText("  RESULT = "+ new Double(result).toString());
                }
                catch(Exception e){


                    Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
                    text.setText("                       Enter Valid Input");


                }


            }
        });



    }
}
