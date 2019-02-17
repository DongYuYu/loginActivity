package uga.cs.listproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity {
    TextView title;

    String[] countries = {"India", "China", "Taiwan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        title = findViewById(R.id.textView2);
        int countryindex = getIntent().getExtras().getInt("Position");






        title.setText(countries[countryindex]);
    }
}
