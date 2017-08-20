package hp.isbhack.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import hp.isbhack.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.button);

        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button:
                Intent intent = new Intent(LoginActivity.this, SelectClassActivity.class);
                startActivity(intent);
                finish();
                break;
        }

    }
}
