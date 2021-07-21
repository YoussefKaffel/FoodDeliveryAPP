package youssef.kaffel.pfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MealchoiceActivity extends AppCompatActivity {
    private Button Buttonsalade;
    private Button ButtonDessert;
    private Button ButtonPetitDej;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mealchoice2);
        ButtonDessert = (Button) findViewById(R.id.dessert_m_bu);
         Buttonsalade = (Button) findViewById(R.id.salade_m_bu);
         ButtonPetitDej=(Button) findViewById(R.id.petitdej_m_bu);
         Buttonsalade.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent commanderIntent = new Intent(MealchoiceActivity.this,SaladeActivity.class);
                 startActivity(commanderIntent);
             }
         });
        ButtonPetitDej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent petitdejIntent = new Intent(MealchoiceActivity.this,PetitDejActivity.class);
                startActivity(petitdejIntent);
            }
        });ButtonDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertIntent = new Intent(MealchoiceActivity.this,DessertActivity.class);
                startActivity(dessertIntent);
            }
        });
    }
}