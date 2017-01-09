package com.example.teo.a11ratingbar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {
    RatingBar ratingBar1;//Khai báo RatingBar là một đánh giá bằng sao.
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
        //Ánh xa
        ratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);
        button = (Button) findViewById(R.id.button1);
        //Performing action on Button
        //Thực hiện hành động
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Getting the rating and display it on the toast
                //Lấy ratting và hiển thị nó trên toast
                //getRating() trả về một float nên chúng ta sử dụng String.valueOf()
                //để ép về kiểu về String.
                String rating = String.valueOf(ratingBar1.getRating());
                Toast.makeText(getApplicationContext(), rating , Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
