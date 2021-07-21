package youssef.kaffel.pfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DessertActivity extends AppCompatActivity {
    private Button mButton;
    private Button nButton;
    private ImageButton bTarteCitron;
    private ImageButton bTiramisu;
    private ImageButton bTiramisuNutella;
    private ImageButton bRedVelvet;
    private ImageButton bCheeseCake;
    private ImageButton bFondantChocolat;
    private double prixDessert;
    private String nameDessert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prixDessert=0.0;
        nameDessert="";
        setContentView(R.layout.activity_dessert);

        nButton = (Button)findViewById(R.id.facture_btn);
        mButton = (Button)findViewById(R.id.add_plate_btn);

        bTarteCitron = (ImageButton)findViewById(R.id.d_1);
        bTiramisu = (ImageButton)findViewById(R.id.d_2);
        bTiramisuNutella= (ImageButton)findViewById(R.id.d_3);
        bRedVelvet = (ImageButton)findViewById(R.id.d_4);
        bCheeseCake= (ImageButton)findViewById(R.id.d_5);
        bFondantChocolat = (ImageButton)findViewById(R.id.d_6);
        //----------------------------------------------------
        bTarteCitron.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bTarteCitron.setImageResource(R.drawable.tartecitron);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bTarteCitron.setImageResource(R.drawable.checkimage238);
                    prixDessert += 5.9;
                    nameDessert += "Tarte au citron,";
                }
                else {
                    //Handle de-select state change
                    bTarteCitron.setImageResource(R.drawable.tartecitron);
                    prixDessert-=5.9;
                    nameDessert=nameDessert.substring(0,nameDessert.length()-"Tarte au citron,".length());
                } }});
        bTiramisu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bTiramisu.setImageResource(R.drawable.tiramisucafe);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bTiramisu.setImageResource(R.drawable.checkimage238);
                    prixDessert += 5.9;
                    nameDessert += "Tiramisu au café,";
                }
                else {
                    //Handle de-select state change
                    bTiramisu.setImageResource(R.drawable.tiramisucafe);
                    prixDessert-=5.9;
                    nameDessert=nameDessert.substring(0,nameDessert.length()-"Tiramisu au café,".length());
                } }});
        bTiramisuNutella.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bTiramisuNutella.setImageResource(R.drawable.tiramisuspeculoos);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bTiramisuNutella.setImageResource(R.drawable.checkimage238);
                    prixDessert += 5.9;
                    nameDessert += "Tiramisu spécalus-nutella,";
                }
                else {
                    //Handle de-select state change
                    bTiramisuNutella.setImageResource(R.drawable.tiramisuspeculoos);
                    prixDessert-=5.9;
                    nameDessert=nameDessert.substring(0,nameDessert.length()-"Tiramisu spécalus-nutella,".length());
                } }});
        bRedVelvet.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bRedVelvet.setImageResource(R.drawable.redvelvet);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bRedVelvet.setImageResource(R.drawable.checkimage238);
                    prixDessert += 6.9;
                    nameDessert += "Red Velvet,";
                }
                else {
                    //Handle de-select state change
                    bRedVelvet.setImageResource(R.drawable.redvelvet);
                    prixDessert-=6.9;
                    nameDessert=nameDessert.substring(0,nameDessert.length()-"Red Velvet,".length());
                } }});
        bCheeseCake.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bCheeseCake.setImageResource(R.drawable.cheesecakecaramel);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bCheeseCake.setImageResource(R.drawable.checkimage238);
                    prixDessert += 6.9;
                    nameDessert += "Cheesecake caramel,";
                }
                else {
                    //Handle de-select state change
                    bCheeseCake.setImageResource(R.drawable.cheesecakecaramel);
                    prixDessert-=6.9;
                    nameDessert=nameDessert.substring(0,nameDessert.length()-"Cheesecake caramel,".length());
                } }});
        bFondantChocolat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bFondantChocolat.setImageResource(R.drawable.fondantchoco);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bFondantChocolat.setImageResource(R.drawable.checkimage238);
                    prixDessert += 6.5;
                    nameDessert += "Fondant Chocolat,";
                }
                else {
                    //Handle de-select state change
                    bFondantChocolat.setImageResource(R.drawable.fondantchoco);
                    prixDessert-=6.5;
                    nameDessert=nameDessert.substring(0,nameDessert.length()-"Fondant Chocolat,".length());
                } }});

        //-----------------------------------------------
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajouterIntent = new Intent(DessertActivity.this,MealchoiceActivity.class);
                Intent addIntent = new Intent(DessertActivity.this,FactureActivity.class);
                addIntent.putExtra("desertname",nameDessert);
                addIntent.putExtra("desertprice",prixDessert);
                startActivity(ajouterIntent);
            }
        });

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ticketIntent = new Intent(DessertActivity.this,FactureActivity.class);
                ticketIntent.putExtra("desertname",nameDessert);
                ticketIntent.putExtra("desertprice",prixDessert);
                startActivity(ticketIntent);

            }
        });
    }
}