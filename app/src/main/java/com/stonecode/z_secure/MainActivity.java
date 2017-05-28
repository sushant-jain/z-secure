package com.stonecode.z_secure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String PARAM_UUID = "param_uuid";
    public static final String PARAM_NAME = "param_name";
    private String name;
    private String uuid;
    private TextView tvName,tvUUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = getIntent().getStringExtra(PARAM_NAME);
        uuid = getIntent().getStringExtra(PARAM_UUID);

        tvName = (TextView) findViewById(R.id.name);
        tvUUID = (TextView) findViewById(R.id.uuid);

        tvName.setText(name);
        tvUUID.setText(uuid);
    }
}
