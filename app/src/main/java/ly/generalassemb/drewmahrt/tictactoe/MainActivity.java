package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //
    EditText player1;
    EditText player2;
    Button startButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = (EditText)findViewById(R.id.player_one_name);
        player1.setText("");
        player2 = (EditText)findViewById(R.id.player_two_name);
        player2.setText("");
        startButton = (Button)findViewById(R.id.start_game_button);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start second activity

                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                intent.putExtra("playerOne", player1.getText().toString());
                intent.putExtra("playerTwo", player2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
