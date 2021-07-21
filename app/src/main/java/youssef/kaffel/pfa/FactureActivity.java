package youssef.kaffel.pfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FactureActivity extends AppCompatActivity {
    private Button factureBtn;

    private TextView baseText;
    private TextView basePrice;

    private  TextView ingText;
    private TextView ingPrice;

    private  TextView sauceText;
    private TextView saucePrice;

    private  TextView saladeText;
    private TextView saladePrice;

    private  TextView dessertText;
    private TextView dessertPrice;

    private  TextView petitdejText;
    private TextView petitdejPrice;

    private TextView suppPrice;
    private TextView suppText;

    private TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facture);


        baseText = (TextView)findViewById(R.id.base_txt) ;
        basePrice = (TextView) findViewById(R.id.base_price);
        ingText = (TextView)findViewById(R.id.ing_txt) ;
        ingPrice = (TextView) findViewById(R.id.ing_price);
        sauceText = (TextView)findViewById(R.id.sauce_txt) ;
        saucePrice = (TextView) findViewById(R.id.sauce_price);
        saladeText = (TextView) findViewById(R.id.saladerec_txt);
        saladePrice = (TextView) findViewById((R.id.saladerec_price)) ;
        dessertText = (TextView) findViewById(R.id.dessert_txt);
        dessertPrice = (TextView) findViewById(R.id.dessert_price);
        petitdejText= (TextView) findViewById(R.id.petitdej_txt);
        petitdejPrice = (TextView) findViewById(R.id.petitdej_price);
        suppText = (TextView) findViewById(R.id.supp_txt);
        suppPrice = (TextView) findViewById(R.id.supp_price) ;



        total = (TextView)findViewById(R.id.total_txt) ;

        Bundle extras = getIntent().getExtras();

        String strnb = extras.getString("nbase");
        double float1 = extras.getDouble("pbase",0.0);
        String strpb = String.valueOf(float1);
        if (strpb=="null")
                strpb ="";
        if (strnb=="null")
            strpb ="";
        strpb += "DT";
      String strni =extras.getString("ning");
        double float2 = extras.getDouble("ping",0.0);
        String strpi = String.valueOf(float2);
        if  (strpi=="null")
            strpi ="";
        if  (strni=="null")
            strni ="";
        strpi += "DT";
        String strns =extras.getString("nsauce");
        double float3 = extras.getDouble("psauce",0.0);
        String strps = String.valueOf(float3);
        if (strps=="null")
            strps ="";
        if (strns=="null")
            strns ="";
        strps += "DT";

        String strdn = extras.getString("desertname");
        double float4 = extras.getDouble("desertprice",0.0);
        String strdp = String.valueOf(float4);
        if (strdp=="null")
            strdp ="";
        if (strdn=="null")
            strdn ="";
        strdp += "DT";

        String strpdn = extras.getString("petitdejname");
        double float5 = extras.getDouble("petitdejprice",0.0);
        String strpdp = String.valueOf(float5);
        if (strpdp=="null")
            strpdp ="";
        if (strpdn=="null")
            strpdn ="";
        strpdp += "DT";

        String strsuppn = extras.getString("suppname");
        double float6 = extras.getDouble("suppprice",0.0);
        String strsuppp = String.valueOf(float6);
        if (strsuppp=="null")
            strsuppp ="";
        if (strsuppn=="null")
            strsuppn ="";
        strsuppp += "DT";

        String strrecn = extras.getString("saladerecname");
        double float7 = extras.getDouble("saladerecprice",0.0);
        String strrecp = String.valueOf(float7);
        if (strrecp=="null")
            strrecp ="";
        if (strrecn=="null")
            strrecn ="";
        strrecp += "DT";



        double dTotal =float1+float2+float3+float4+float5+float6+float7;
        String stotal = String.valueOf(dTotal);


        baseText.setText(strnb);
        basePrice.setText(strpb);
        ingText.setText(strni);
        ingPrice.setText(strpi);
        sauceText.setText(strns);
        saucePrice.setText(strps);
        dessertPrice.setText(strdp);
        dessertText.setText(strdn);
        petitdejPrice.setText(strpdp);
        petitdejText.setText(strpdn);
        suppText.setText(strsuppn);
        suppPrice.setText(strsuppp);
        saladeText.setText(strrecn);
        saladePrice.setText(strrecp);

        total.setText(stotal+"DT");



        factureBtn=(Button)findViewById(R.id.fin_commande);
        factureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finIntent = new Intent(FactureActivity.this,FinCommandeActivity.class);
                startActivity(finIntent);
            }
        });
    }
}