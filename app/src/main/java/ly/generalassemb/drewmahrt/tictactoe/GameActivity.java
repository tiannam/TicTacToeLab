package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    EditText player1;
    EditText player2;

    TextView playerText;

    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter tAdapter;

    TextView textView0;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        playerText = (TextView)findViewById(R.id.game_message_text);

        Intent intent = getIntent();
        final String player1 = intent.getStringExtra("playerOne");
        final String player2 = intent.getStringExtra("playerTwo");

        playerText.setText(player1 + "'s turn");

        textView0 = (TextView)findViewById(R.id.textView);
        textView1 = (TextView)findViewById(R.id.textView2);
        textView2 = (TextView)findViewById(R.id.textView3);
        textView3 = (TextView)findViewById(R.id.textView4);
        textView4 = (TextView)findViewById(R.id.textView5);
        textView5 = (TextView)findViewById(R.id.textView6);
        textView6 = (TextView)findViewById(R.id.textView7);
        textView7 = (TextView)findViewById(R.id.textView8);
        textView8 = (TextView)findViewById(R.id.textView9);


        textView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if(player1){
                    textView0.setText("X");
                    }else {
                        textView0.setText("O");
                }
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (player1){
                    textView1.setText("X");
                }else {
                    textView1.setText("O");
                }

            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (player1){
                    textView2.setText("X");
                }else {
                    textView2.setText("O");
                }
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (player1){
                    textView3.setText("X");
                }else {
                    textView3.setText("O");
                }
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (player1){
                    textView4.setText("X");
                }else {
                    textView4.setText("O");
                }
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (player1){
                    textView5.setText("X");
                }else {
                    textView5.setText("O");
                }
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (player1){
                    textView6.setText("X");
                }else {
                    textView6.setText("O");
                }
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (player1){
                    textView7.setText("X");
                }else {
                    textView7.setText("O");
                }
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (player1){
                    textView8.setText("X");
                }else {
                    textView8.setText("O");
                }
            }
        });

    }
}
