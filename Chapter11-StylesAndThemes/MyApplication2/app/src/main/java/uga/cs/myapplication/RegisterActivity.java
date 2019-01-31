package uga.cs.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    Button registerButton;
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
    }
}
