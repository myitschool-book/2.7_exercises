package ru.samsung.itschool.book.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by d.yacenko on 31.03.17.
 */

public class ComeBackActivity extends AppCompatActivity {
    EditText et;
    Button bt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comebackactivity);
        et= (EditText) findViewById(R.id.et);
        bt= (Button) findViewById(R.id.bt);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent();
                i.putExtra("et",et.getText().toString());
                setResult(RESULT_OK, i);
                finish();
            }
        };
        bt.setOnClickListener(listener);
    }
}
