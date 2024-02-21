package gdsc.greenchoice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        openChoiceLogger();
    }

    public void openChoiceLogger() {
        Button button2_1 = (Button) findViewById(R.id.button2_1);
        Button button2_2 = (Button) findViewById(R.id.button2_2);
        Button button2_3 = (Button) findViewById(R.id.button2_3);

        button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this, ChoiceLogger.class));
            }
        });

        button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this, ChoiceLogger.class));
            }
        });

        button2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this, ChoiceLogger.class));
            }
        });
    }
}
