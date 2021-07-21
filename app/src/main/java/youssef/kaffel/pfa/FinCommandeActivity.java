package youssef.kaffel.pfa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FinCommandeActivity extends AppCompatActivity {
    private Button dButton;
    private Button mButton;
    private LinearLayout dView;
    private TextView mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_commande);
        dButton=(Button)findViewById(R.id.b_adomicile);
        mButton=(Button)findViewById(R.id.b_cheznous);
        dView=(LinearLayout) findViewById(R.id.view_adomicile);
        mView=(TextView) findViewById(R.id.view_cheznous);
        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dView.setVisibility(View.VISIBLE);
                mView.setVisibility(View.GONE);
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mView.setVisibility(View.VISIBLE);
                dView.setVisibility(View.GONE);
            }
        });
    }
}