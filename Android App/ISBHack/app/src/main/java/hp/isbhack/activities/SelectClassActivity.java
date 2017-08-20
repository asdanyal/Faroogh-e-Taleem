package hp.isbhack.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.PopupMenu;

import hp.isbhack.R;

public class SelectClassActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_class);

        button_1 = (Button) findViewById(R.id.btn_1);
        button_2 = (Button) findViewById(R.id.btn_2);
        button_3 = (Button) findViewById(R.id.btn_3);
        button_4 = (Button) findViewById(R.id.btn_4);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_1:
                Intent intent = new Intent(SelectClassActivity.this,SelectLecturesActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btn_2:
                Intent intent2 = new Intent(SelectClassActivity.this,SelectLecturesActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.btn_3:
                Intent intent3 = new Intent(SelectClassActivity.this,SelectLecturesActivity.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.btn_4:
                Intent intent4 = new Intent(SelectClassActivity.this,SelectLecturesActivity.class);
                startActivity(intent4);
                finish();
                break;
        }

    }
}
