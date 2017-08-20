package hp.isbhack.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import hp.isbhack.R;

public class AttendenceActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence);
        button = (Button) findViewById(R.id.proceed);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.proceed:
                Intent intent = new Intent(AttendenceActivity.this, AttendenceSummary.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
