package com.expensetracker.expense_tracker_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * This is the main activity(the entry point for the app)
 * When app is build and run, the system launches an instance of this Activity and loads its layout
 * */
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.expensetracker.expense_tracker_mobile.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * activity_main
         * is XML file
         * defines the layout for the activity's UI*/
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_login);
    }

    /** Called when the user taps the SignIn button
     * Details in method required for the system to recognize it as compatible with the android:onClick
     * 1. Public access
     * 2. A void return value
     * 3. A View as the only parameter(it is the View object that was clicked)*/
    public void sendMessage(android.view.View view){
        /**
         * The Intent constructor takes two parameters:
         * A Context as its first parameter
         * The Class of the app component to which the system should deliver the Intent
         * */
        Intent intent = new Intent(this, ExpenseViewActivity.class);

        EditText editText = (EditText) findViewById(R.id.username);

        String message = editText.getText().toString();

        /**
         * An Intent can carry data types as key-value pairs called extras.
         * the next activity uses the key to retrieve the text value.
         * It's a good practice to define keys for intent extras using your app's package name as a prefix. This ensures the keys are unique, in case your app interacts with other apps.
         * */
        intent.putExtra(EXTRA_MESSAGE, message);

        //starts an instance of the DisplayMessageActivity specified by the Intent.
        startActivity(intent);
    }


}
