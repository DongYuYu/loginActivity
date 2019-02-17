package uga.cs.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    Button registerButton;
    Button loginButton;
    EditText name;
    EditText password;

    EditText address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.editText);
        password = findViewById(R.id.editText3);
        address = findViewById(R.id.editText2);
        registerButton = findViewById(R.id.registerButton);

        loginButton = findViewById(R.id.button3);

        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String uName = name.getText().toString();
                String uPassword = password.getText().toString();
                String uAddress = address.getText().toString();
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);





                intent.putExtra("name", uName);
                intent.putExtra("passWord", uPassword);
                intent.putExtra("address", uAddress);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tag", "RActivitiy start");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("tag", "RActivity Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("tag", "RActivity pause");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("tag", "RActivity Stop");
    }
}
