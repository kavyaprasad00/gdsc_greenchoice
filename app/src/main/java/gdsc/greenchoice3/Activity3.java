package gdsc.greenchoice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        openChoiceLogger();
    }

    public void openChoiceLogger() {
        Button button3_1 = (Button) findViewById(R.id.button3_1);
        Button button3_2 = (Button) findViewById(R.id.button3_2);
        Button button3_3 = (Button) findViewById(R.id.button3_3);

        button3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this, ChoiceLogger.class));
            }
        });

        button3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this, ChoiceLogger.class));
            }
        });

        button3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this, ChoiceLogger.class));
            }
        });
    }
}
