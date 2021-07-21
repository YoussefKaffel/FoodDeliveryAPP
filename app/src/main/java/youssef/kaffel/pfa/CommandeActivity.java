package youssef.kaffel.pfa;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CommandeActivity extends AppCompatActivity {
    private Button mButton;
    private Button nButton;
    //------------------------bases-----------------
    private ImageButton bougourButton;
    private ImageButton rizButton;
    private ImageButton laitueButton;
    private ImageButton patesButton;
   //-------------------------ingerdient------------------
    //4
    private ImageButton ingButton;
    private ImageButton ingCrevMielButton;
    private ImageButton ingCrevNatButton;
    private ImageButton ingCrevEpicButton;
    private ImageButton ingChampButton;
    //3
    private ImageButton ingEscalHerbButton;
    private ImageButton ingEscalMielButton;
    private ImageButton ingEscalEpicButton;
    private ImageButton ingFromageParmButton;
    private ImageButton ingSalacubeMozzaButton;
    private ImageButton ingAnanasButton;
    private ImageButton ingThonButton;
    private ImageButton ingTomateSecheButton;
    private ImageButton ingNoixButton;
//1.5
    private ImageButton ingJambonButton;
    private ImageButton ingRicottaButton;
    private ImageButton ingPimentButton;
    private ImageButton ingHaricotButton;
    private ImageButton ingOnionCrButton;
    private ImageButton ingTomateCeriseButton;
    private ImageButton ingMaisButton;
    private ImageButton ingDatteButton;
    private ImageButton ingAbricotButton;
    private ImageButton ingNoisetteButton;
    private ImageButton ingPommeDeTerreButton;
    private ImageButton ingSardineButton;
    //1
    private ImageButton ingBetteraveButton;
    private ImageButton ingPimentComcmbreButton;
    private ImageButton ingCarotteButton;
    private ImageButton ingChouxButton;
    private ImageButton ingLentilleButton;
    private ImageButton ingOeufPoButton;
    private ImageButton ingOeufButton;
    private ImageButton ingOliveButton;
    //0.5
    private ImageButton ingZestaButton;
    private ImageButton ingChiaButton;
    private ImageButton ingTourneSolButton;
    private ImageButton ingSesameButton;
    //---------------Sauces------------
    private ImageButton sVinaigretteButton;
    private ImageButton sMielMoutardeButton;
    private ImageButton sAsiatiqueButton;
    private ImageButton sMielBalsimiqueButton;
    private ImageButton sEpicieButton;
    private ImageButton sGrequeButton;
    private ImageButton sAgrumesButton;
    private ImageButton sPestoButton;
    //-------------Prix---------------

    private double prixBase;
    private double prixIng;
    private double prixSauce;
    private double prixTot;
//-------------String------------
    private String nameBase;
    private String nameIng;
    private String nameSauce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commande);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());
//--------------------buttomButtons-------------------
        nButton = (Button)findViewById(R.id.btn_ajout);
        mButton = (Button)findViewById(R.id.btn_tofact);
//-------------------Bases---------------------
        bougourButton = (ImageButton)findViewById((R.id.img_b1)) ;
        rizButton= (ImageButton)findViewById(R.id.img_b2);
        laitueButton = (ImageButton)findViewById(R.id.img_b3);
        patesButton = (ImageButton)findViewById(R.id.img_b4);
//-------------------ing---------------------------------
        //4
        ingCrevMielButton = (ImageButton)findViewById((R.id.img_41));
        ingCrevNatButton= (ImageButton)findViewById((R.id.img_42));
        ingCrevEpicButton= (ImageButton)findViewById((R.id.img_43));
        ingChampButton= (ImageButton)findViewById((R.id.img_44));
        //3
        ingEscalHerbButton= (ImageButton)findViewById((R.id.img_31));
        ingEscalMielButton= (ImageButton)findViewById((R.id.img_32));
        ingEscalEpicButton= (ImageButton)findViewById((R.id.img_33));
        ingFromageParmButton= (ImageButton)findViewById((R.id.img_34));
        ingSalacubeMozzaButton= (ImageButton)findViewById((R.id.img_35));
        ingAnanasButton= (ImageButton)findViewById((R.id.img_36));
        ingThonButton= (ImageButton)findViewById((R.id.img_37));
        ingTomateSecheButton= (ImageButton)findViewById((R.id.img_38));
        ingNoixButton= (ImageButton)findViewById((R.id.img_39));
        //1.5
        ingJambonButton= (ImageButton)findViewById((R.id.img_21));
        ingRicottaButton= (ImageButton)findViewById((R.id.img_22));
        ingPimentButton= (ImageButton)findViewById((R.id.img_23));
        ingHaricotButton= (ImageButton)findViewById((R.id.img_24));
        ingOnionCrButton= (ImageButton)findViewById((R.id.img_25));
        ingTomateCeriseButton= (ImageButton)findViewById((R.id.img_26));
        ingMaisButton= (ImageButton)findViewById((R.id.img_27));
        ingDatteButton= (ImageButton)findViewById((R.id.img_28));
        ingAbricotButton= (ImageButton)findViewById((R.id.img_29));
        ingNoisetteButton= (ImageButton)findViewById((R.id.img_210));
        ingPommeDeTerreButton= (ImageButton)findViewById((R.id.img_211));
        ingSardineButton= (ImageButton)findViewById((R.id.img_212));
        //1
        ingBetteraveButton= (ImageButton)findViewById((R.id.img_11));
        ingPimentComcmbreButton= (ImageButton)findViewById((R.id.img_12));
        ingCarotteButton= (ImageButton)findViewById((R.id.img_13));
        ingChouxButton= (ImageButton)findViewById((R.id.img_14));
        ingLentilleButton= (ImageButton)findViewById((R.id.img_15));
        ingOeufPoButton= (ImageButton)findViewById((R.id.img_16));
        ingOeufButton= (ImageButton)findViewById((R.id.img_17));
        ingOliveButton= (ImageButton)findViewById((R.id.img_18));
        //0.5
        ingZestaButton= (ImageButton)findViewById((R.id.img_051));
        ingChiaButton= (ImageButton)findViewById((R.id.img_052));
        ingTourneSolButton= (ImageButton)findViewById((R.id.img_053));
        ingSesameButton= (ImageButton)findViewById((R.id.img_054));
        //-------------Sauce-----------
        sVinaigretteButton= (ImageButton)findViewById((R.id.img_s1));
        sMielMoutardeButton= (ImageButton)findViewById((R.id.img_s2));
        sAsiatiqueButton= (ImageButton)findViewById((R.id.img_s3));
        sMielBalsimiqueButton= (ImageButton)findViewById((R.id.img_s4));
        sEpicieButton= (ImageButton)findViewById((R.id.img_s5));
        sGrequeButton= (ImageButton)findViewById((R.id.img_s6));
        sAgrumesButton= (ImageButton)findViewById((R.id.img_s7));
        sPestoButton= (ImageButton)findViewById((R.id.img_s8));




//------------------------------BaseButtons--------------------------------------

        bougourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bougourButton.setImageResource(R.drawable.checkimage);
                rizButton.setImageResource(R.drawable.baseriz);
                laitueButton.setImageResource(R.drawable.baselaitue);
                patesButton.setImageResource(R.drawable.basepatecomplete);
                nameBase = "Bougour";
                prixBase = 3.2;
            }
        });

        rizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bougourButton.setImageResource(R.drawable.baseboulgour);
                rizButton.setImageResource(R.drawable.checkimage);
                laitueButton.setImageResource(R.drawable.baselaitue);
                patesButton.setImageResource(R.drawable.basepatecomplete);
                nameBase = "riz";
                prixBase = 3.2;
            }
        });

        laitueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bougourButton.setImageResource(R.drawable.baseboulgour);
                rizButton.setImageResource(R.drawable.baseriz);
                laitueButton.setImageResource(R.drawable.checkimage);
                patesButton.setImageResource(R.drawable.basepatecomplete);
                nameBase = "Laitue";
                prixBase = 3.2;
            }
        });


        patesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bougourButton.setImageResource(R.drawable.baseboulgour);
                rizButton.setImageResource(R.drawable.baseriz);
                laitueButton.setImageResource(R.drawable.baselaitue);
                patesButton.setImageResource(R.drawable.checkimage);
                nameBase = "Pates";
                prixBase = 3.2;
            }
        });
      /* rizButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                .setImageResource(R.drawable.);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    .setImageResource(R.drawable.checkimage);
                } else {
                    //Handle de-select state change
                    .setImageResource(R.drawable.);

                }

            }

        });*/
        //------
        nameIng="";
        prixIng=0.0;
        nameSauce="";
        prixIng=0.0;

        //------------------------ingredients---------------
        //4
        ingCrevMielButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingCrevMielButton.setImageResource(R.drawable.ingcrevamande);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingCrevMielButton.setImageResource(R.drawable.checkimage);
                    prixIng+=4.8;
                    nameIng+="Crevette miel-amande,";

                } else {
                    //Handle de-select state change
                    ingCrevMielButton.setImageResource(R.drawable.ingcrevamande);
                    prixIng-=4.8;
                    nameIng=nameIng.substring(0,nameIng.length()-"Crevette miel-amande,".length());
                }

            }

        });
        ingCrevNatButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingCrevNatButton.setImageResource(R.drawable.ingcrevnat);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingCrevNatButton.setImageResource(R.drawable.checkimage);
                    prixIng+=4;
                    nameIng+="Crevette Nature,";

                } else {
                    //Handle de-select state change
                    ingCrevNatButton.setImageResource(R.drawable.ingcrevnat);
                    prixIng-=4;
                    nameIng=nameIng.substring(0,nameIng.length()-"Crevette Nature,".length());
                }

            }

        });
        ingCrevEpicButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingCrevEpicButton.setImageResource(R.drawable.ingcrevepic);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingCrevEpicButton.setImageResource(R.drawable.checkimage);
                    prixIng+=4;
                    nameIng+="Crevette épicié,";

                } else {
                    //Handle de-select state change
                    ingCrevEpicButton.setImageResource(R.drawable.ingcrevepic);
                    prixIng-=4;
                    nameIng=nameIng.substring(0,nameIng.length()-"Crevette épicié,".length());
                }

            }

        });
        ingChampButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingChampButton.setImageResource(R.drawable.ingchamp);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingChampButton.setImageResource(R.drawable.checkimage);
                    prixIng+=4;
                    nameIng+="Champignon,";

                } else {
                    //Handle de-select state change
                    ingChampButton.setImageResource(R.drawable.ingchamp);
                    prixIng-=4;
                    nameIng=nameIng.substring(0,nameIng.length()-"Champignon,".length());
                }

            }

        });

        //3
        ingEscalHerbButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingEscalHerbButton.setImageResource(R.drawable.ingscalopeherb);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingEscalHerbButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Escalope aux herbes,";

                } else {
                    //Handle de-select state change
                    ingEscalHerbButton.setImageResource(R.drawable.ingscalopeherb);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Escalope aux herbes,".length());
                }

            }

        });
        ingEscalMielButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingEscalMielButton.setImageResource(R.drawable.ingscalopemiel);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingEscalMielButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Escalope miel-sésame,";

                } else {
                    //Handle de-select state change
                    ingEscalMielButton.setImageResource(R.drawable.ingscalopemiel);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Escalope miel-sésame,".length());
                }

            }

        });
        ingEscalEpicButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingEscalEpicButton.setImageResource(R.drawable.ingescalopeepic);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingEscalEpicButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Escalope Epice,";

                } else {
                    //Handle de-select state change
                    ingEscalEpicButton.setImageResource(R.drawable.ingescalopeepic);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Escalope Epice,".length());
                }

            }

        });
        ingFromageParmButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingFromageParmButton.setImageResource(R.drawable.ingfromageparmesan);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingFromageParmButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Fromage et Parmeson,";

                } else {
                    //Handle de-select state change
                    ingFromageParmButton.setImageResource(R.drawable.ingfromageparmesan);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Fromage et Parmeson,".length());
                }

            }

        });
        ingSalacubeMozzaButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingSalacubeMozzaButton.setImageResource(R.drawable.ingstracciatella);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingSalacubeMozzaButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Salacube+Mozzarella+Stracciatelia,";

                } else {
                    //Handle de-select state change
                    ingSalacubeMozzaButton.setImageResource(R.drawable.ingstracciatella);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Salacube+Mozzarella+Stracciatelia,".length());
                }

            }

        });
        ingAnanasButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingAnanasButton.setImageResource(R.drawable.ingananas);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingAnanasButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Ananas,";

                } else {
                    //Handle de-select state change
                    ingAnanasButton.setImageResource(R.drawable.ingananas);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Ananas,".length());
                }

            }

        });
        ingThonButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingThonButton.setImageResource(R.drawable.ingthon);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingThonButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Thon,";

                } else {
                    //Handle de-select state change
                    ingThonButton.setImageResource(R.drawable.ingthon);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Thon,".length());
                }

            }

        });
        ingTomateSecheButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingTomateSecheButton.setImageResource(R.drawable.ingtomateseche);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingTomateSecheButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Tomate séchée,";

                } else {
                    //Handle de-select state change
                    ingTomateSecheButton.setImageResource(R.drawable.ingtomateseche);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Tomate séchée,".length());
                }

            }

        });
        ingNoixButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingNoixButton.setImageResource(R.drawable.ingnoix);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingNoixButton.setImageResource(R.drawable.checkimage);
                    prixIng+=3;
                    nameIng+="Noix,";

                } else {
                    //Handle de-select state change
                    ingNoixButton.setImageResource(R.drawable.ingnoix);
                    prixIng-=3;
                    nameIng=nameIng.substring(0,nameIng.length()-"Noix,".length());
                }

            }

        });
        //---------------1.5--------------
        ingJambonButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingJambonButton.setImageResource(R.drawable.ingjambon);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingJambonButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Jambon,";

                } else {
                    //Handle de-select state change
                    ingJambonButton.setImageResource(R.drawable.ingjambon);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Jambon,".length());
                }

            }

        });
        ingRicottaButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingRicottaButton.setImageResource(R.drawable.basericotta);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingRicottaButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Ricotta,"; }
                else {
                    //Handle de-select state change
                    ingRicottaButton.setImageResource(R.drawable.basericotta);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Ricotta,".length());
                } }});
        ingPimentButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingPimentButton.setImageResource(R.drawable.ingaubergine);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingPimentButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Piment Aubergine,"; }
                else {
                    //Handle de-select state change
                    ingPimentButton.setImageResource(R.drawable.ingaubergine);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Piment Aubergine,".length());
                } }});
        ingHaricotButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingHaricotButton.setImageResource(R.drawable.ingharricotrouge);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingHaricotButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Haricot rouge,"; }
                else {
                    //Handle de-select state change
                    ingHaricotButton.setImageResource(R.drawable.ingharricotrouge);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Haricot rouge,".length());
                } }});
        ingOnionCrButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingOnionCrButton.setImageResource(R.drawable.ingonioioncaram);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingOnionCrButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Onion caramélisé,"; }
                else {
                    //Handle de-select state change
                    ingOnionCrButton.setImageResource(R.drawable.ingonioioncaram);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Onion caramélisé,".length());
                } }});
        ingTomateCeriseButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingTomateCeriseButton.setImageResource(R.drawable.tomatecerise);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingTomateCeriseButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Tomate cerise,"; }
                else {
                    //Handle de-select state change
                    ingTomateCeriseButton.setImageResource(R.drawable.tomatecerise);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Tomate cerise,".length());
                } }});
        ingMaisButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingMaisButton.setImageResource(R.drawable.ingmais);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingMaisButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Mais,"; }
                else {
                    //Handle de-select state change
                    ingMaisButton.setImageResource(R.drawable.ingmais);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Mais,".length());
                } }});
        ingDatteButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingDatteButton.setImageResource(R.drawable.ingdattekiwi);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingDatteButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Dattes et kiwi,"; }
                else {
                    //Handle de-select state change
                    ingDatteButton.setImageResource(R.drawable.ingdattekiwi);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Dattes et kiwi,".length());
                } }});
        ingAbricotButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingAbricotButton.setImageResource(R.drawable.ingabricotsec);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingAbricotButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Abricots raisin secs,"; }
                else {
                    //Handle de-select state change
                    ingAbricotButton.setImageResource(R.drawable.ingabricotsec);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Abricots raisin secs,".length());
                } }});
        ingNoisetteButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingNoisetteButton.setImageResource(R.drawable.ingnoisette);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingNoisetteButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Noisette,"; }
                else {
                    //Handle de-select state change
                    ingNoisetteButton.setImageResource(R.drawable.ingnoisette);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Noisette,".length());
                } }});
        ingPommeDeTerreButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingPommeDeTerreButton.setImageResource(R.drawable.pommesdeterre);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingPommeDeTerreButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Pomme de terre épiciée,"; }
                else {
                    //Handle de-select state change
                    ingPommeDeTerreButton.setImageResource(R.drawable.pommesdeterre);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Pomme de terre épiciée,".length());
                } }});
        ingSardineButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingSardineButton.setImageResource(R.drawable.ingsardine);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingSardineButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.5;
                    nameIng+="Sardine marinée,"; }
                else {
                    //Handle de-select state change
                    ingSardineButton.setImageResource(R.drawable.ingsardine);
                    prixIng-=1.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Sardine marinée,".length());
                } }});
        //----------------- 1 ---------------
        ingBetteraveButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingBetteraveButton.setImageResource(R.drawable.ingbeterave);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingBetteraveButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.0;
                    nameIng+="Betterave,"; }
                else {
                    //Handle de-select state change
                    ingBetteraveButton.setImageResource(R.drawable.ingbeterave);
                    prixIng-=1.0;
                    nameIng=nameIng.substring(0,nameIng.length()-"Betterave,".length());
                } }});
        ingPimentComcmbreButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingPimentComcmbreButton.setImageResource(R.drawable.ingpimentcomcombre);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingPimentComcmbreButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.0;
                    nameIng+="Piment et concombre,"; }
                else {
                    //Handle de-select state change
                    ingPimentComcmbreButton.setImageResource(R.drawable.ingpimentcomcombre);
                    prixIng-=1.0;
                    nameIng=nameIng.substring(0,nameIng.length()-"Piment et concombre,".length());
                } }});
        ingCarotteButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingCarotteButton.setImageResource(R.drawable.ingcarottepommedeterre);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingCarotteButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.0;
                    nameIng+="Carotte et pomme de terre,"; }
                else {
                    //Handle de-select state change
                    ingCarotteButton.setImageResource(R.drawable.ingcarottepommedeterre);
                    prixIng-=1.0;
                    nameIng=nameIng.substring(0,nameIng.length()-"Carotte et pomme de terre,".length());
                } }});
        ingChouxButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingChouxButton.setImageResource(R.drawable.ingchou);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingChouxButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.0;
                    nameIng+="Choux vert et Laitue,"; }
                else {
                    //Handle de-select state change
                    ingChouxButton.setImageResource(R.drawable.ingchou);
                    prixIng-=1.0;
                    nameIng=nameIng.substring(0,nameIng.length()-"Choux vert et Laitue,".length());
                } }});
        ingLentilleButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingLentilleButton.setImageResource(R.drawable.inglentilles);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingLentilleButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.0;
                    nameIng+="Lentille,"; }
                else {
                    //Handle de-select state change
                    ingLentilleButton.setImageResource(R.drawable.inglentilles);
                    prixIng-=1.0;
                    nameIng=nameIng.substring(0,nameIng.length()-"Lentille,".length());
                } }});
        ingOeufPoButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingOeufPoButton.setImageResource(R.drawable.ingoeufpoche);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingOeufPoButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.0;
                    nameIng+="Oeuf poché,"; }
                else {
                    //Handle de-select state change
                    ingOeufPoButton.setImageResource(R.drawable.ingoeufpoche);
                    prixIng-=1.0;
                    nameIng=nameIng.substring(0,nameIng.length()-"Oeuf poché,".length());
                } }});

        ingOeufButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingOeufButton.setImageResource(R.drawable.ingoeuf);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingOeufButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.0;
                    nameIng+="Oeuf,"; }
                else {
                    //Handle de-select state change
                    ingOeufButton.setImageResource(R.drawable.ingoeuf);
                    prixIng-=1.0;
                    nameIng=nameIng.substring(0,nameIng.length()-"Oeuf,".length());
                } }});
        ingOliveButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingOliveButton.setImageResource(R.drawable.ingolive);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingOliveButton.setImageResource(R.drawable.checkimage);
                    prixIng+=1.0;
                    nameIng+="Olive,"; }
                else {
                    //Handle de-select state change
                    ingOliveButton.setImageResource(R.drawable.ingolive);
                    prixIng-=1.0;
                    nameIng=nameIng.substring(0,nameIng.length()-"Olive,".length());
                } }});
        ingZestaButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingZestaButton.setImageResource(R.drawable.ingzestaciron);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingZestaButton.setImageResource(R.drawable.checkimage);
                    prixIng+=0.5;
                    nameIng+="Zesta de citron,"; }
                else {
                    //Handle de-select state change
                    ingZestaButton.setImageResource(R.drawable.ingzestaciron);
                    prixIng-=0.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Zesta de citron,".length());
                } }});
        ingChiaButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingChiaButton.setImageResource(R.drawable.ingchia);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingChiaButton.setImageResource(R.drawable.checkimage);
                    prixIng+=0.5;
                    nameIng+="Graine de lin/Chia,"; }
                else {
                    //Handle de-select state change
                    ingChiaButton.setImageResource(R.drawable.ingchia);
                    prixIng-=0.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Graine de lin/Chia,".length());
                } }});
        ingTourneSolButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingTourneSolButton.setImageResource(R.drawable.ingchia);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingTourneSolButton.setImageResource(R.drawable.checkimage);
                    prixIng+=0.5;
                    nameIng+="Graine de tournesol,"; }
                else {
                    //Handle de-select state change
                    ingTourneSolButton.setImageResource(R.drawable.ingchia);
                    prixIng-=0.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Graine de tournesol,".length());
                } }});
        ingSesameButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                ingSesameButton.setImageResource(R.drawable.ingsesame);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    ingSesameButton.setImageResource(R.drawable.checkimage);
                    prixIng+=0.5;
                    nameIng+="Sésame,"; }
                else {
                    //Handle de-select state change
                    ingSesameButton.setImageResource(R.drawable.ingsesame);
                    prixIng-=0.5;
                    nameIng=nameIng.substring(0,nameIng.length()-"Sésame,".length());
                } }});

        //------------------Les Sauces
        sVinaigretteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                //Set the button's appearance
                sVinaigretteButton.setImageResource(R.drawable.saucevinaigrette);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    sVinaigretteButton.setImageResource(R.drawable.checkimage);
                    nameSauce+="Sauce Vinaigrette,"; }
                else {
                    //Handle de-select state change
                    sVinaigretteButton.setImageResource(R.drawable.saucevinaigrette);
                    nameSauce=nameSauce.substring(0,nameSauce.length()-"Sauce Vinaigrette,".length());
                } }});
        sMielMoutardeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                //Set the button's appearance
                sMielMoutardeButton.setImageResource(R.drawable.saucemielmoutarde);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    sMielMoutardeButton.setImageResource(R.drawable.checkimage);
                    nameSauce+="Sauce miel moutarde à l'ancienne,"; }
                else {
                    //Handle de-select state change
                    sMielMoutardeButton.setImageResource(R.drawable.saucemielmoutarde);
                    nameSauce=nameSauce.substring(0,nameSauce.length()-"Sauce miel moutarde à l'ancienne,".length());
                } }});
        sAsiatiqueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                //Set the button's appearance
                sAsiatiqueButton.setImageResource(R.drawable.sauceasiatique);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    sAsiatiqueButton.setImageResource(R.drawable.checkimage);
                    nameSauce+="Sauce asiatique,"; }
                else {
                    //Handle de-select state change
                    sAsiatiqueButton.setImageResource(R.drawable.sauceasiatique);
                    nameSauce=nameSauce.substring(0,nameSauce.length()-"Sauce asiatique,".length());
                } }});
        sMielBalsimiqueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                //Set the button's appearance
                sMielBalsimiqueButton.setImageResource(R.drawable.saucemielbalsamique);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    sMielBalsimiqueButton.setImageResource(R.drawable.checkimage);
                    nameSauce+="Sauce miel balsamique,"; }
                else {
                    //Handle de-select state change
                    sMielBalsimiqueButton.setImageResource(R.drawable.saucemielbalsamique);
                    nameSauce=nameSauce.substring(0,nameSauce.length()-"Sauce miel balsamique,".length());
                } }});
        sEpicieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                //Set the button's appearance
                sEpicieButton.setImageResource(R.drawable.sauceepice);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    sEpicieButton.setImageResource(R.drawable.checkimage);
                    nameSauce+="Sauce épiciée,"; }
                else {
                    //Handle de-select state change
                    sEpicieButton.setImageResource(R.drawable.sauceepice);
                    nameSauce=nameSauce.substring(0,nameSauce.length()-"Sauce épiciée,".length());
                } }});
        sGrequeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                //Set the button's appearance
                sGrequeButton.setImageResource(R.drawable.saucegrecque);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    sGrequeButton.setImageResource(R.drawable.checkimage);
                    nameSauce+="Sauce grecque,"; }
                else {
                    //Handle de-select state change
                    sGrequeButton.setImageResource(R.drawable.saucegrecque);
                    nameSauce=nameSauce.substring(0,nameSauce.length()-"Sauce grecque,".length());
                } }});
        sAgrumesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                //Set the button's appearance
                sAgrumesButton.setImageResource(R.drawable.sauceargume);
                button.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    sAgrumesButton.setImageResource(R.drawable.checkimage);
                    nameSauce+="Sauce agrumes,"; }
                else {
                    //Handle de-select state change
                    sAgrumesButton.setImageResource(R.drawable.sauceargume);
                    nameSauce=nameSauce.substring(0,nameSauce.length()-"Sauce agrumes,".length());
                } }});
        sPestoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                //Set the button's appearance
                sPestoButton.setImageResource(R.drawable.saucepesto);
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    sPestoButton.setImageResource(R.drawable.checkimage);
                    nameSauce+="Sauce pesto,"; }
                else {
                    //Handle de-select state change
                    sPestoButton.setImageResource(R.drawable.saucepesto);
                    nameSauce=nameSauce.substring(0,nameSauce.length()-"Sauce pesto,".length());
                } }});


//-----------------------------------------------------------------------------------




        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajoutIntent = new Intent(CommandeActivity.this,MealchoiceActivity.class);
                Intent addIntent = new Intent(CommandeActivity.this,FactureActivity.class);
                addIntent.putExtra("nbase", nameBase);
                addIntent.putExtra("pbase", prixBase);
                addIntent.putExtra("ning", nameIng);
                addIntent.putExtra("ping", prixIng);
                addIntent.putExtra("nsauce", nameSauce);
                addIntent.putExtra("psauce", prixSauce);
                startActivity(ajoutIntent);


            }
        });
        prixSauce=0.0;
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent factureIntent = new Intent(CommandeActivity.this,FactureActivity.class);
                factureIntent.putExtra("nbase", nameBase);
                factureIntent.putExtra("pbase", prixBase);
                factureIntent.putExtra("ning", nameIng);
                factureIntent.putExtra("ping", prixIng);
                factureIntent.putExtra("nsauce", nameSauce);
                factureIntent.putExtra("psauce", prixSauce);
                startActivity(factureIntent);

            }
        });

    }
}