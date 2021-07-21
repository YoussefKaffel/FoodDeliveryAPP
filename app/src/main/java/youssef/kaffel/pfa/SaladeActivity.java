package youssef.kaffel.pfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SaladeActivity extends AppCompatActivity {
   private ImageButton bSaladeP;
    private ImageButton bSaladeR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salade);
        bSaladeP=(ImageButton)findViewById(R.id.salade_per);
        bSaladeR=(ImageButton)findViewById(R.id.salade_rec);
        bSaladeR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RecommandedIntent = new Intent(SaladeActivity.this,RecomandedActivity.class);
                startActivity(RecommandedIntent);
            }
        });
        bSaladeP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PersonalisedIntent = new Intent(SaladeActivity.this,CommandeActivity.class);
                startActivity(PersonalisedIntent);
            }
        });
    }
}