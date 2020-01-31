package edu.sp.p0123456.mapp_share_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // show the content of shared data in UI
        tv = findViewById(R.id.mytxt);
        showContent();
    }
    void showContent(){
        // loop thru linked list and display content
        int n= MyData.users.size();
        String content = "";
        for(int i = 0; i<n; i++){
            // get each user in linked list
            User u = MyData.users.get(i);
            // append info in string with a new line
            content += u.name + ": " + u.age +"\n";
        }
        // display string in UI
        tv.setText(content);
    }
}
