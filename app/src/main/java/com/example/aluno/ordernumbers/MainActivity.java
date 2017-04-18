package com.example.aluno.ordernumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEdit;
    Button mButton1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit = (EditText)findViewById(R.id.editText);
        mButton1 = (Button)findViewById(R.id.button1);
        textView = (TextView)findViewById(R.id.textView);

        mButton1.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        String numbers = mEdit.getText().toString();

        String[] parts = numbers.split(" ");

        ArrayList<Integer> n1 = new ArrayList<Integer>();

        for(int n = 0; n < parts.length; n++) {
            n1.add(Integer.parseInt(parts[n]));
        }

        Collections.sort(n1);

        String str = Arrays.toString(n1.toArray());

        textView.setText(str);

    }
}
