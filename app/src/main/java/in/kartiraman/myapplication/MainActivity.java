package in.kartiraman.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_LONG).show();
       // startService(new Intent(getBaseContext(), OnClearFromRecentService.class));
    }
}
