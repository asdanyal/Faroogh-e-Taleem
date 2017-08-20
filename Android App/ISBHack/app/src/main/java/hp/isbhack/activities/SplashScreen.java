package hp.isbhack.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import hp.isbhack.MainActivity;
import hp.isbhack.R;

public class SplashScreen extends AppCompatActivity implements View.OnClickListener{

    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView = (ImageView) findViewById(R.id.imgLogo);
        button = (Button) findViewById(R.id.tap_to_enter);

        button.setOnClickListener(this);
        imageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tap_to_enter:
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.imgLogo:
                Intent intent1 = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }
}
