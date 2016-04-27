package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    //Variables
    TextView playerText;
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
    String currentPlayer = "player1";
    String lastWinner;


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
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView0.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");

            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView1.setText("X");
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView1.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView2.setText("X");
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView2.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView3.setText("X");
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView3.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPlayer1Turn) {
                    textView4.setText("X");
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView4.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView5.setText("X");
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView5.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView6.setText("X");
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView6.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView7.setText("X");
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView7.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isPlayer1Turn) {
                    textView8.setText("X");
                    currentPlayer = player1;
                    nextPlayer = player2;
                } else {
                    textView8.setText("O");
                    currentPlayer = player2;
                    nextPlayer = player1;
                }
                checkWin();
                playerText.setText(nextPlayer + "'s turn");
            }
        });



    }//end of on create

    public void checkWin(){


        if(textView0.getText() == "X" && textView1.getText() == "X" && textView2.getText() == "X" ||
                textView0.getText() == "O" && textView1.getText() == "O" && textView2.getText() == "O") {
            Toast.makeText(GameActivity.this, currentPlayer + " wins!", Toast.LENGTH_SHORT).show();
        } else if (textView3.getText() == "X" && textView4.getText() == "X" && textView5.getText() == "X" ||
                textView3.getText() == "O" && textView4.getText() == "O" && textView5.getText() == "O"){
            Toast.makeText(GameActivity.this, currentPlayer + " wins!", Toast.LENGTH_SHORT).show();
        } else if (textView6.getText() == "X" && textView7.getText() == "X" && textView8.getText() == "X" ||
                textView6.getText() == "O" && textView7.getText() == "O" && textView8.getText() == "O"){
            Toast.makeText(GameActivity.this, currentPlayer + " wins", Toast.LENGTH_SHORT).show();
        } else if (textView0.getText() == "X" && textView4.getText() == "X" && textView8.getText() == "X" ||
                textView0.getText() == "O" && textView4.getText() == "O" && textView8.getText() == "O"){
            Toast.makeText(GameActivity.this, currentPlayer + " wins", Toast.LENGTH_SHORT).show();
        } else if (textView2.getText() == "X" && textView4.getText() == "X" && textView6.getText() == "X" ||
                textView2.getText() == "O" && textView4.getText() == "O" && textView6.getText() == "O"){
            Toast.makeText(GameActivity.this, currentPlayer + " wins", Toast.LENGTH_SHORT).show();
        } else if (textView0.getText() == "X" && textView3.getText() == "X" && textView6.getText() == "X" ||
                textView0.getText() == "O" && textView3.getText() == "O" && textView6.getText() == "O"){
            Toast.makeText(GameActivity.this, currentPlayer + " wins", Toast.LENGTH_SHORT).show();
        } else if (textView1.getText() == "X" && textView4.getText() == "X" && textView7.getText() == "X" ||
                textView1.getText() == "O" && textView4.getText() == "O" && textView7.getText() == "O"){
            Toast.makeText(GameActivity.this, currentPlayer + " wins", Toast.LENGTH_SHORT).show();
        } else if (textView2.getText() == "X" && textView5.getText() == "X" && textView8.getText() == "X" ||
                textView2.getText() == "O" && textView5.getText() == "O" && textView8.getText() == "O") {
            Toast.makeText(GameActivity.this, currentPlayer + " wins", Toast.LENGTH_SHORT).show();
        } else if (count > 7){
            Toast.makeText(GameActivity.this, "Draw!", Toast.LENGTH_SHORT).show();}

         lastWinner = currentPlayer;


        isPlayer1Turn = !isPlayer1Turn;
        count++;

        SharedPreferences sharedPrefs = getSharedPreferences("ly.generalassemb.drewmahrt.tictactoe",MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPrefs.edit();

        editor.putString("winner", lastWinner);

        editor.commit();

    }

}
