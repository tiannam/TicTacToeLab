package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables
    EditText player1;
    EditText player2;
    Button startButton;
//    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencing winner from second activity
        SharedPreferences sharedPrefs = getSharedPreferences("ly.generalassemb.drewmahrt.tictactoe",MODE_PRIVATE);
        String lastWinner = sharedPrefs.getString("winner","");
        TextView textView = (TextView)findViewById(R.id.last_winner_text);
        textView.setText("The last winner was " + lastWinner);

        player1 = (EditText)findViewById(R.id.player_one_name);
        player1.setText("");
        player2 = (EditText)findViewById(R.id.player_two_name);
        player2.setText("");
        startButton = (Button)findViewById(R.id.start_game_button);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Start second activity while carrying over player names
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                intent.putExtra("playerOne", player1.getText().toString());
                intent.putExtra("playerTwo", player2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
