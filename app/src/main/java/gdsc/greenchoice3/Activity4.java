package gdsc.greenchoice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        openChoiceLogger();
    }

    public void openChoiceLogger() {
        Button button4_1 = (Button) findViewById(R.id.button4_1);
        Button button4_2 = (Button) findViewById(R.id.button4_2);
        Button button4_3 = (Button) findViewById(R.id.button4_3);

        button4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity4.this, ChoiceLogger.class));
            }
        });

        button4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity4.this, ChoiceLogger.class));
            }
        });

        button4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity4.this, ChoiceLogger.class));
            }
        });
    }
}
