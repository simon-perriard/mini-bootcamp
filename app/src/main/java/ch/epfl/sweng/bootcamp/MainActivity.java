package ch.epfl.sweng.bootcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the GO button
     */
    public void greetUser(View view){
        Intent intent = new Intent(this, GreetingActivity.class);
        startActivity(intent);
    }
}
