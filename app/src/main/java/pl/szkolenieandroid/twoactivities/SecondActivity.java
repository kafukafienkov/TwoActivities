package pl.szkolenieandroid.twoactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        String myData = extras.getString(FirstActivity.IMIE_KEY);

        ((TextView) findViewById(R.id.textView)).setText(myData);
    }

    public void backToFirst(View view) {

        String response = "Michal";
        Intent responseIntent = new Intent();
        responseIntent.putExtra("response", response);
        setResult(1, responseIntent);

      //  finish();
    }
}
