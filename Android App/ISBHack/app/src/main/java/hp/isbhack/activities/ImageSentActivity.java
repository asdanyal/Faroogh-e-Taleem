package hp.isbhack.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import hp.isbhack.R;

public class ImageSentActivity extends AppCompatActivity implements View.OnClickListener {

    private Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_sent);

        finish = (Button) findViewById(R.id.finish);
        finish.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.finish:
                Intent intent = new Intent(ImageSentActivity.this, SelectClassActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
