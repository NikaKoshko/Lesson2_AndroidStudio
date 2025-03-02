package ru.mirea.lukanina.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view)
    {
        EditText editText = (EditText) findViewById(R.id.editTextText);
        String text = editText.getText().toString();
        int numberCharacters = text.length();

        String toastMessage = "СТУДЕНТ №14 ГРУППА БСБО-09-21 Количество символов - " + numberCharacters;

        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}