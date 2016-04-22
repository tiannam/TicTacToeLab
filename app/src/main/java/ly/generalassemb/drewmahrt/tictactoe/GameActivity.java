package ly.generalassemb.drewmahrt.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter tAdapter;

    TextView textView0 = (TextView)findViewById(R.id.textView);
    TextView textView1 = (TextView)findViewById(R.id.textView);
    TextView textView2 = (TextView)findViewById(R.id.textView);
    TextView textView3 = (TextView)findViewById(R.id.textView);
    TextView textView4 = (TextView)findViewById(R.id.textView);
    TextView textView5 = (TextView)findViewById(R.id.textView);
    TextView textView6 = (TextView)findViewById(R.id.textView);
    TextView textView7 = (TextView)findViewById(R.id.textView);
    TextView textView8 = (TextView)findViewById(R.id.textView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        textView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
