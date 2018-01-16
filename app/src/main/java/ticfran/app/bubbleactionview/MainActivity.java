package ticfran.app.bubbleactionview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import frantic.app.bubbleactionview.BubbleActions;
import frantic.app.bubbleactionview.Callback;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                BubbleActions.on(view)
                        .addAction("Star", R.drawable.bubble_star, new Callback() {
                            @Override
                            public void doAction() {
                                Toast.makeText(MainActivity.this, "Star pressed on index " +  "!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addAction("Share", R.drawable.bubble_share, new Callback() {
                            @Override
                            public void doAction() {
                                Toast.makeText(MainActivity.this, "Share pressed on index " +  "!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addAction("Hide", R.drawable.bubble_hide, new Callback() {
                            @Override
                            public void doAction() {
                                Toast.makeText(MainActivity.this, "Hide pressed on index " + "!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                return false;
            }
        });
    }
}
