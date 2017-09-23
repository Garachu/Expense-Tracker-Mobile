package com.expensetracker.expense_tracker_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.expensetracker.expense_tracker_mobile.login.LoginActivity;

public class ExpenseViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_view);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);

        // Capture the layout's Textview and set the string as its text
        TextView textView = (TextView) findViewById(R.id.expensesView);

        //Clear TextView content
        textView.setText("");

        String[] toyNames = ExpenseBox.getToyNames();

        //Loop through each toy and append the name to the TextView (add \n for spacing)
        for (String s: toyNames) {

            textView.append(s + "\n");

        }


    }
}
