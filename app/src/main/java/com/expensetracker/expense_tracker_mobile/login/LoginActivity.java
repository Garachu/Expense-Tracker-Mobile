package com.expensetracker.expense_tracker_mobile.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.expensetracker.expense_tracker_mobile.ExpenseViewActivity;
import com.expensetracker.expense_tracker_mobile.R;

public class LoginActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.expensetracker.expense_tracker_mobile.login.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

}

