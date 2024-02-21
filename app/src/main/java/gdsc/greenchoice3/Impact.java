package gdsc.greenchoice3;

import android.widget.ProgressBar;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Impact extends AppCompatActivity {
    private int dailyPercent = 30;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.impact);
        ProgressBar dailyProgress = (ProgressBar) findViewById(R.id.daily_progress);
        dailyProgress.setProgress(dailyPercent, true);

        TextView percentString = (TextView) findViewById(R.id.daily_percent);
        percentString.setText(dailyPercent + "%");

        Button btnI = (Button)findViewById(R.id.buttonimpact);

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Impact.this, Log.class));
            }
        });
    }
}

