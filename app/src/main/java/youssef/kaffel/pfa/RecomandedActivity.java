package youssef.kaffel.pfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class RecomandedActivity extends AppCompatActivity {
    private Button mButton;
    private Button nButton;

    private Button iButton1;
    private Button iButton2;
    private Button iButton3;
    private Button iButton4;

    private ImageButton saladeChevre;
    private ImageButton saladeMed;
    private ImageButton saladeWaldorf;
    private ImageButton saladeNicoise;

    private double prixSaladeR;
    private String nameSaladeR;

    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomanded);
        prixSaladeR=0.0;
        nameSaladeR="";
        nButton = (Button)findViewById(R.id.facture_btn);
        mButton = (Button)findViewById(R.id.add_plate_btn);

        iButton1=(Button)findViewById(R.id.i_chevrerbtn);
        iButton2=(Button)findViewById(R.id.i_medbtn);
        iButton3=(Button)findViewById(R.id.i_walfordbtn);
        iButton4=(Button)findViewById(R.id.i_nacoisebtn);

        saladeChevre=(ImageButton)findViewById(R.id.salade_chevret);
        saladeMed=(ImageButton)findViewById(R.id.salade_med);
        saladeWaldorf=(ImageButton)findViewById(R.id.salade_walford);
        saladeNicoise=(ImageButton)findViewById(R.id.salade_nacoise);

        description=(TextView)findViewById(R.id.description_ingridient);
//---------------------description buttons------------------------
        iButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                description.setVisibility(View.VISIBLE);
                description.setText("Salade au chèvre chaud:\n" +"\n"+
                        "crottins de chèvre\n" +
                        "poignée de pousses d'épinards\n" +
                        "poignée de pignons\n" +
                        "café de moutarde\n" +
                        "sel, poivre\n" +
                        "laitue romaine\n" +
                        "barquette de tomates cerises\n" +
                        "soupe d'huile d'olive\n" +
                        "soupe de vinaigre balsamique\n"
                        + "\n" +
                        "22DT"+ "\n" );
            }
        });
        iButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                description.setVisibility(View.VISIBLE);
                description.setText("Salade méditerranéenne:\n" + "\n" +
                        "riz\n" +
                        "olives noires dénoyautées\n" +
                        "poivron rouge\n" +
                        "œufs\n" +
                        "citron\n" +
                        "boîte de fonds d’artichauts\n" +
                        "olives vertes dénoyautées\n" +
                        "saucisses de Francfort\n" +
                        "huile d’olive\n" +
                        "sel, poivre\n" + "\n" +
                        "25DT"+ "\n" );
            }
        });
        iButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                description.setVisibility(View.VISIBLE);
                description.setText("Salade Waldorf:\n" + "\n" +
                        "laitue\n" +
                        "céleri blanc\n" +
                        "soupe de mayonnaise\n" +
                        "grappe de raisin noir\n" +
                        "sel, poivre\n" +
                        "pommes acidulées bio\n" +
                        "citron\n" +
                        "cerneaux de noix\n" +
                        "jus d'un citron\n" + "\n" +
                        "28DT"+ "\n" );
            }
        });
        iButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                description.setVisibility(View.VISIBLE);
                description.setText("Salade niçoise:\n" + "\n" +
                        "oeufs\n" +
                        "feuilles de mesclun et de basilic frais\n" +
                        "boîte 200 g de thon égoutté\n" +
                        "olives noires\n" +
                        "soupe d'huile d'olive\n" +
                        "café de moutarde\n" +
                        "tomates cerises\n" +
                        "poivron vert\n" +
                        "boîte d'anchois\n" +
                        "radis\n" +
                        "soupe de vinaigre de vin\n" +
                        "sel, poivre\n" + "\n" +
                        "35DT"
                        + "\n" );
            }
        });
        prixSaladeR=0.0;
        nameSaladeR="";
        //---------------------------------------------------------
        saladeChevre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                saladeChevre.setImageResource(R.drawable.saladechevrechaud);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    saladeChevre.setImageResource(R.drawable.checkimage2);
                    prixSaladeR += 22.0;
                    nameSaladeR += "Salade chevrechaud,";
                }
                else {
                    //Handle de-select state change
                    saladeChevre.setImageResource(R.drawable.saladechevrechaud);
                    prixSaladeR-=22.0;
                    nameSaladeR=nameSaladeR.substring(0,nameSaladeR.length()-"Salade chevrechaud,".length());
                } }});
        saladeMed.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                saladeMed.setImageResource(R.drawable.salademediterraneenne);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    saladeMed.setImageResource(R.drawable.checkimage2);
                    prixSaladeR += 25.0;
                    nameSaladeR += "Salade mediterraneenne,";
                }
                else {
                    //Handle de-select state change
                    saladeMed.setImageResource(R.drawable.salademediterraneenne);
                    prixSaladeR-=25.0;
                    nameSaladeR=nameSaladeR.substring(0,nameSaladeR.length()-"Salade mediterraneenne,".length());
                } }});
        saladeWaldorf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                saladeWaldorf.setImageResource(R.drawable.saladewaldorf);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    saladeWaldorf.setImageResource(R.drawable.checkimage2);
                    prixSaladeR += 28.0;
                    nameSaladeR += "Salade waldorf,";
                }
                else {
                    //Handle de-select state change
                    saladeWaldorf.setImageResource(R.drawable.saladewaldorf);
                    prixSaladeR-=28.0;
                    nameSaladeR=nameSaladeR.substring(0,nameSaladeR.length()-"Salade waldorf,".length());
                } }});
        saladeNicoise.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                saladeNicoise.setImageResource(R.drawable.saladenicoiserapide);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    saladeNicoise.setImageResource(R.drawable.checkimage2);
                    prixSaladeR += 35.0;
                    nameSaladeR += "Salade nicoise rapide,";
                }
                else {
                    //Handle de-select state change
                    saladeNicoise.setImageResource(R.drawable.saladenicoiserapide);
                    prixSaladeR-=35.0;
                    nameSaladeR=nameSaladeR.substring(0,nameSaladeR.length()-"Salade nicoise rapide,".length());
                } }});
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajouterIntent = new Intent(RecomandedActivity.this,MealchoiceActivity.class);
                Intent addIntent = new Intent(RecomandedActivity.this,FactureActivity.class);
                addIntent.putExtra("saladerecname",nameSaladeR);
                addIntent.putExtra("saladerecprice",prixSaladeR);
                startActivity(ajouterIntent);
            }
        });

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ticketIntent = new Intent(RecomandedActivity.this,FactureActivity.class);
                ticketIntent.putExtra("saladerecname",nameSaladeR);
                ticketIntent.putExtra("saladerecprice",prixSaladeR);
                startActivity(ticketIntent);

            }
        });
    }
}