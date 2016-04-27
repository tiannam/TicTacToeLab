package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

//    EditText player1;
//    EditText player2;

    TextView playerText;

//    ArrayList<String> arrayList = new ArrayList<>();
//    ArrayAdapter tAdapter;

    TextView textView0;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    boolean isPlayer1Turn = true;
    int count = 0;
    String nextPlayer = "player1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        playerText = (TextView) findViewById(R.id.game_message_text);

        Intent intent = getIntent();
        final String player1 = intent.getStringExtra("playerOne");
        final String player2 = intent.getStringExtra("playerTwo");

        playerText.setText(player1 + "'s turn");

        textView0 = (TextView) findViewById(R.id.textView);
        textView1 = (TextView) findViewById(R.id.textView2);
        textView2 = (TextView) findViewById(R.id.textView3);
        textView3 = (TextView) findViewById(R.id.textView4);
        textView4 = (TextView) findViewById(R.id.textView5);
        textView5 = (TextView) findViewById(R.id.textView6);
        textView6 = (TextView) findViewById(R.id.textView7);
        textView7 = (TextView) findViewById(R.id.textView8);
        textView8 = (TextView) findViewById(R.id.textView9);

        textView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPlayer1Turn) {
                    textView0.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView0.setText("O");
                    nextPlayer = "player1";
                }
                isPlayer1Turn = !isPlayer1Turn;
                count++;
                playerText.setText(nextPlayer + "'s turn");

            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView1.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView1.setText("O");
                    nextPlayer = "player1";
                }
                isPlayer1Turn = !isPlayer1Turn;
                count++;
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView2.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView2.setText("O");
                    nextPlayer = "player1";
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (isPlayer1Turn) {
                    textView3.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView3.setText("O");
                    nextPlayer = "player1";
                }
                isPlayer1Turn = !isPlayer1Turn;
                count++;
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (isPlayer1Turn) {
                    textView4.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView4.setText("O");
                    nextPlayer = "player1";
                }
                isPlayer1Turn = !isPlayer1Turn;
                count++;
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (isPlayer1Turn) {
                    textView5.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView5.setText("O");
                    nextPlayer = "player1";
                }
                isPlayer1Turn = !isPlayer1Turn;
                count++;
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (isPlayer1Turn) {
                    textView6.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView6.setText("O");
                    nextPlayer = "player1";
                }
                isPlayer1Turn = !isPlayer1Turn;
                count++;
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (isPlayer1Turn) {
                    textView7.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView7.setText("O");
                    nextPlayer = "player1";
                }
                isPlayer1Turn = !isPlayer1Turn;
                count++;
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean player1 = true;

                if (isPlayer1Turn) {
                    textView8.setText("X");
                    nextPlayer = "player2";
                } else {
                    textView8.setText("O");
                    nextPlayer = "player1";
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });



    }//end of on create

    public void checkWin(){

        if(textView0.getText() == textView1.getText() &&  textView1.getText() == textView2.getText()){
            Toast.makeText(GameActivity.this, "player X wins", Toast.LENGTH_SHORT).show();
        } else if (textView3.getText() == textView4.getText() && textView4.getText() == textView5.getText()){
            Toast.makeText(GameActivity.this, "player X wins", Toast.LENGTH_SHORT).show();
        } else if (textView6.getText() == textView7.getText() && textView7.getText() == textView8.getText()){
            Toast.makeText(GameActivity.this, "player X wins", Toast.LENGTH_SHORT).show();
        } else if (textView0.getText() == textView4.getText() && textView4.getText() == textView8.getText()){
            Toast.makeText(GameActivity.this, "player X wins", Toast.LENGTH_SHORT).show();
        } else if (textView2.getText() == textView4.getText() && textView4.getText() == textView6.getText()){
            Toast.makeText(GameActivity.this, "player wins", Toast.LENGTH_SHORT).show();
        } else if (textView0.getText() == textView3.getText() && textView3.getText() == textView6.getText()){
            Toast.makeText(GameActivity.this, "player wins", Toast.LENGTH_SHORT).show();
        } else if (textView1.getText() == textView4.getText() && textView4.getText() == textView7.getText()){
            Toast.makeText(GameActivity.this, "player wins", Toast.LENGTH_SHORT).show();
        } else if (textView2.getText() == textView5.getText() && textView5.getText() == textView8.getText()){
            Toast.makeText(GameActivity.this, "player wins", Toast.LENGTH_SHORT).show();
        } else {Toast.makeText(GameActivity.this, "Draw!", Toast.LENGTH_SHORT).show();}

        isPlayer1Turn = !isPlayer1Turn;
        count++;
    }

}
