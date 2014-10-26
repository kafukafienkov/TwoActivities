package pl.szkolenieandroid.twoactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public static final String IMIE_KEY= "name";
    public void goToSecondAction(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String someValue = "Jan";
        intent.putExtra(IMIE_KEY, someValue);

        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle extras = data.getExtras();
        extras.getStringArrayList(IMIE_KEY);

        Toast.makeText(this, "Some text", Toast.LENGTH_LONG).show();

    }
}
