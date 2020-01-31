package edu.sp.p0123456.mapp_share_var;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-- get the UI to display the variables
        tv1 = findViewById(R.id.txt1);
        tv2 = findViewById(R.id.txt2);
        tv3 = findViewById(R.id.txt3);

        // -- access the shared variables in MyData
        tv1.setText("myvar: " +MyData.myvar);
        tv2.setText("special: " +MyData.special);
        tv3.setText("No of users: " + MyData.users.size());
    }

    public void addUser(View view) {
        //-- add a random user in the linked list
        User u = new User();
        // random name & age, reuse special and myvar for demo
        u.name = MyData.special + MyData.myvar;
        u.age = (int)(Math.random()*80+1);
        MyData.myvar++;
        // add to linked list
        MyData.users.add(u);

        tv3.setText("No of users: " + MyData.users.size());
        tv1.setText("myvar: " +MyData.myvar);
    }

    public void next(View view) {
        // go to another Activity
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
