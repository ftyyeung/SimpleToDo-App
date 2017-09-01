package com.codepath.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Edit Item");
        setContentView(R.layout.activity_edit_item);
        etEditText = (EditText)findViewById(R.id.etEditText);
        etEditText.setText(getIntent().getStringExtra("text"));
        etEditText.setSelection(etEditText.getText().length());
    }

    public void onSave(View v){
        etEditText = (EditText)findViewById(R.id.etEditText);
        Intent data = new Intent();
        data.putExtra("newText", etEditText.getText().toString());
        data.putExtra("pos", getIntent().getExtras().getInt("pos"));
        data.putExtra("code", 200);
        setResult(RESULT_OK, data);
        finish();
    }
}
