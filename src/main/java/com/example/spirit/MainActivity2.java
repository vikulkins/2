package com.example.spirit;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.spirit.databinding.ActivityMainBinding;
import com.example.spirit.databinding.ActivitySecondBinding;
import com.example.spirit.databinding.ActivityThirdBinding;

public class MainActivity2 extends AppCompatActivity {
    ActivityThirdBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        Bundle arguments = getIntent().getExtras();

        String name = arguments.getString("name");
        binding.helloName.setText("Hello " + name);
        setContentView(view);

        binding.exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("name", name);
                finish();
                startActivity(intent);
            }
        });
    }
}