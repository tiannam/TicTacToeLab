package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        String player1 = intent.getStringExtra("playerOne");
        String player2 = intent.getStringExtra("playerTwo");

        playerText.setText(player1 + "'s turn");

//        textView0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(textView0 != "X" || "O"){
//                    if(player1)
//                }
//            }
//        });
//        textView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        textView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        textView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        textView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        textView5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        textView6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        textView7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        textView8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }
}
