package youssef.kaffel.pfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PetitDejActivity extends AppCompatActivity {
    private  Button nButton;
    private  Button mButton;

    private ImageButton bMatinal;
    private ImageButton bHealthy;
    private ImageButton bGourmet;

    private ImageButton bCroissant;
    private ImageButton bCake;
    private ImageButton bOeuf;
    private ImageButton bGranola;
    private ImageButton bBrus;
    private ImageButton bPancake;

    private double prixPetitDej;
    private String namePetitDej;

    private double prixSupp;
    private String nameSupp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prixPetitDej=0.0;
        prixSupp=0.0;
        namePetitDej="";
        nameSupp="";
        setContentView(R.layout.activity_petit_dej);
        nButton = (Button)findViewById(R.id.facture_btn);
        mButton = (Button)findViewById(R.id.add_plate_btn);

        bMatinal=(ImageButton)findViewById(R.id.pdej_matinal);
        bHealthy=(ImageButton)findViewById(R.id.pdej_healthy);
        bGourmet=(ImageButton)findViewById(R.id.pdej_gourmet);

        bCroissant=(ImageButton)findViewById(R.id.img_s1);
        bCake=(ImageButton)findViewById(R.id.img_s2);
        bOeuf=(ImageButton)findViewById(R.id.img_s3);
        bGranola=(ImageButton)findViewById(R.id.img_s4);
        bBrus=(ImageButton)findViewById(R.id.img_s5);
        bPancake=(ImageButton)findViewById(R.id.img_s6);
        //------------------Petit dej----------------------------
        bMatinal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bMatinal.setImageResource(R.drawable.p_matinal);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bMatinal.setImageResource(R.drawable.checkimage245);
                    prixPetitDej += 8.0;
                    namePetitDej += "Matinal,";
                }
                else {
                    //Handle de-select state change
                    bMatinal.setImageResource(R.drawable.p_matinal);
                    prixPetitDej-=8.0;
                    namePetitDej=namePetitDej.substring(0,namePetitDej.length()-"Matinal,".length());
                } }});
        bHealthy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bHealthy.setImageResource(R.drawable.p_healthy);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bHealthy.setImageResource(R.drawable.checkimage245);
                    prixPetitDej += 15.0;
                    namePetitDej += "Healthy,";
                }
                else {
                    //Handle de-select state change
                    bHealthy.setImageResource(R.drawable.p_healthy);
                    prixPetitDej-=15.0;
                    namePetitDej=namePetitDej.substring(0,namePetitDej.length()-"Healthy,".length());
                } }});
        bGourmet.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bGourmet.setImageResource(R.drawable.p_gourmet);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bGourmet.setImageResource(R.drawable.checkimage245);
                    prixPetitDej += 16.0;
                    namePetitDej += "Gourmet,";
                }
                else {
                    //Handle de-select state change
                    bGourmet.setImageResource(R.drawable.p_gourmet);
                    prixPetitDej-=16.0;
                    namePetitDej=namePetitDej.substring(0,namePetitDej.length()-"Gourmet,".length());
                } }});
        //-----------------------------Supp--------------------------------
        bCroissant.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bCroissant.setImageResource(R.drawable.croissant);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bCroissant .setImageResource(R.drawable.checkimage100);
                    prixSupp += 3;
                    nameSupp += "Croissant,";
                }
                else {
                    //Handle de-select state change
                    bCroissant.setImageResource(R.drawable.croissant);
                    prixSupp-=3;
                    nameSupp=nameSupp.substring(0,nameSupp.length()-"Croissant,".length());
                } }});
        bCake.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bCake.setImageResource(R.drawable.cake);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bCake .setImageResource(R.drawable.checkimage100);
                    prixSupp += 3;
                    nameSupp += "Cake,";
                }
                else {
                    //Handle de-select state change
                    bCake.setImageResource(R.drawable.cake);
                    prixSupp-=3;
                    nameSupp=nameSupp.substring(0,nameSupp.length()-"Cake,".length());
                } }});
        bOeuf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bOeuf.setImageResource(R.drawable.oeuf);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bOeuf .setImageResource(R.drawable.checkimage100);
                    prixSupp += 5;
                    nameSupp += "Oeuf brouillé,";
                }
                else {
                    //Handle de-select state change
                    bOeuf.setImageResource(R.drawable.oeuf);
                    prixSupp-=5;
                    nameSupp=nameSupp.substring(0,nameSupp.length()-"Oeuf brouillé,".length());
                } }});
        bGranola.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bGranola.setImageResource(R.drawable.granola);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bGranola .setImageResource(R.drawable.checkimage100);
                    prixSupp += 6;
                    nameSupp += "Granola,";
                }
                else {
                    //Handle de-select state change
                    bGranola.setImageResource(R.drawable.granola);
                    prixSupp-=6;
                    nameSupp=nameSupp.substring(0,nameSupp.length()-"Granola,".length());
                } }});
        bBrus.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bBrus.setImageResource(R.drawable.bruschettas);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bBrus .setImageResource(R.drawable.checkimage100);
                    prixSupp += 6;
                    nameSupp += "Bruschettas,";
                }
                else {
                    //Handle de-select state change
                    bBrus.setImageResource(R.drawable.bruschettas);
                    prixSupp-=6;
                    nameSupp=nameSupp.substring(0,nameSupp.length()-"Bruschettas,".length());
                } }});
        bPancake.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                bPancake.setImageResource(R.drawable.pancake);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    bPancake .setImageResource(R.drawable.checkimage100);
                    prixSupp += 6;
                    nameSupp += "Pancake,";
                }
                else {
                    //Handle de-select state change
                    bPancake.setImageResource(R.drawable.pancake);
                    prixSupp-=6;
                    nameSupp=nameSupp.substring(0,nameSupp.length()-"Pancake,".length());
                } }});


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajouterIntent = new Intent(PetitDejActivity.this,MealchoiceActivity.class);
                Intent addIntent = new Intent(PetitDejActivity.this,FactureActivity.class);
                addIntent.putExtra("petitdejname",namePetitDej);
                addIntent.putExtra("petitdejprice",prixPetitDej);
                addIntent.putExtra("suppname",nameSupp);
                addIntent.putExtra("suppprice",prixSupp);
                startActivity(ajouterIntent);
            }
        });

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ticketIntent = new Intent(PetitDejActivity.this,FactureActivity.class);
                ticketIntent.putExtra("petitdejname",namePetitDej);
                ticketIntent.putExtra("petitdejprice",prixPetitDej);
                ticketIntent.putExtra("suppname",nameSupp);
                ticketIntent.putExtra("suppprice",prixSupp);
                startActivity(ticketIntent);

            }
        });
    }
}