package xir1n07.remidiuts.telkomschid.yabsnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnSwipe)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(MainActivity.this, SwipeActivity.class);
                        MainActivity.this.startActivity(myIntent);
                    }
                });

        findViewById(R.id.btnTab)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(MainActivity.this, TabsActivity.class);
                        MainActivity.this.startActivity(myIntent);
                    }
                });

        findViewById(R.id.btnSpinner)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(MainActivity.this, SpinnerActivity.class);
                        MainActivity.this.startActivity(myIntent);
                    }
                });
        findViewById(R.id.btnNavdraw)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(MainActivity.this, NavdrawerActivity.class);
                        MainActivity.this.startActivity(myIntent);
                    }
                });


    }
}
