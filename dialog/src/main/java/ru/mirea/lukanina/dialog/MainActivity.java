package ru.mirea.lukanina.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view)
    {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onClickTimePickerDialog(View view)
    {
        MyTimeDialogFragment timeDialogFragment = new MyTimeDialogFragment();
        TextView textView = findViewById(R.id.textView);
        timeDialogFragment.setTextView(textView);
        timeDialogFragment.show(getSupportFragmentManager(), "time_dialog");
    }

    public void onClickDatePickerDialog(View view)
    {
        MyDateDialogFragment dateDialogFragment = new MyDateDialogFragment();
        TextView textView = findViewById(R.id.textView2);
        dateDialogFragment.setTextView(textView);
        dateDialogFragment.show(getSupportFragmentManager(), "time_dialog");
    }

    public void onClickShowProgressDialog(View view) {
        MyProgressDialogFragment progressDialogFragment = new MyProgressDialogFragment();
        progressDialogFragment.show(getSupportFragmentManager(), "progress_dialog");
    }
}