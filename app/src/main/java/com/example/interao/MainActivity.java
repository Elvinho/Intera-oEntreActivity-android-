package com.example.interao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT= "com.example.application.example.EXTRA_TEXT";

  TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton bcc =  (RadioButton)findViewById(R.id.radio_Bcc);
        RadioButton bsi =  (RadioButton)findViewById(R.id.radio_Bsi);
        RadioButton lc =  (RadioButton)findViewById(R.id.radio_Lc);

        bcc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openActivity2();

            }
        });

        bsi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openActivity3();

            }
        });
        lc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openActivity4();

            }
        });

    }

        public void openActivity2 ()
        {

            RadioButton radio_Bcc = (RadioButton) findViewById(R.id.radio_Bcc);
            String Curso = radio_Bcc.getText().toString();
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra(EXTRA_TEXT, Curso);
            startActivity(intent);

        }
    public void openActivity3 ()
    {

        RadioButton radio_Bsi = (RadioButton) findViewById(R.id.radio_Bsi);
        String Curso = radio_Bsi.getText().toString();
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(EXTRA_TEXT, Curso);
        startActivity(intent);

    }
    public void openActivity4 ()
    {

        RadioButton radio_Lc = (RadioButton) findViewById(R.id.radio_Lc);
        String Curso = radio_Lc.getText().toString();
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(EXTRA_TEXT, Curso);
        startActivity(intent);

    }


}
