package com.example.worldclock;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.os.Bundle;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=findViewById(R.id.gettime12);
        Button button2=findViewById(R.id.gettime24);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
              Calendar calendar =Calendar.getInstance();
              SimpleDateFormat timeFormat=new SimpleDateFormat("hh:mm:ss");
              String time12= timeFormat.format(calendar.getTime());

                textView = findViewById(R.id.sydney_time);
                textView.setText(time12);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Calendar calendar =Calendar.getInstance();
                SimpleDateFormat timeFormat=new SimpleDateFormat("HH:mm:ss");
                String time24= timeFormat.format(calendar.getTime());

                textView = findViewById(R.id.sydney_time);
                textView.setText(time24);

            }
        });









    }
}
