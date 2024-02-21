package gdsc.greenchoice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class ChoiceLogger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice_logger);

        openImpact();

        Button btn = (Button)findViewById(R.id.buttonhome2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoiceLogger.this, Log.class));
            }
        });
    }

    public void openImpact() {
        Button buttonCL = (Button) findViewById(R.id.buttonCL);

        buttonCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoiceLogger.this, Impact.class));
            }
        });


    }
}
