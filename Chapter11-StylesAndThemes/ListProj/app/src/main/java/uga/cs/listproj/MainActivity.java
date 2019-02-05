package uga.cs.listproj;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] countries = {"India", "China", "Taiwan"};
    String[] positions = {"geo:13.092300,80.230000", "geo:35.861660,104.195396", "geo:22.999727,120.227000"};
    int[] images = {R.drawable.india, R.drawable.china, R.drawable.usa};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.dynamic);
        //ArrayAdapter<String> arrayAdapter =
        //        new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,countries);

        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.item_layout, R.id.textView, countries);
        MyAdapater arrayAdapter = new MyAdapater(countries, images, MainActivity.this);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) listView.getItemAtPosition(position);
//                Toast.makeText(MainActivity.this, "you select " + item, Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
//                intent.putExtra("Position", position);
                Uri geoUri = Uri.parse(positions[position]);


                Intent intent = new Intent(Intent.ACTION_VIEW, geoUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

    }
}
