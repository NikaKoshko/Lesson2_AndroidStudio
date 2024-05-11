package ru.mirea.lukanina.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Создаем и возвращаем новый экземпляр ProgressDialog
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Подождите..."); // Устанавливаем сообщение
        progressDialog.setIndeterminate(true); // Устанавливаем, что прогресс неопределенный
        progressDialog.setCancelable(false); // Запрещаем закрытие диалога кнопкой "Назад"

        return progressDialog;
    }
}
