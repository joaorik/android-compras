package net.leocadio.joao.sistemadecompras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Desenvolvimento Android
 * Joao Leocadio - TADS 5 Semestre
 */

public class ComprasActivity extends AppCompatActivity {

    private CheckBox ChkArroz, ChkLeite, ChkCarne, ChkFeijao, ChkRefri;
    private Button BtnTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);

        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick()
    {
        ChkArroz = (CheckBox)findViewById(R.id.ChkArroz);
        ChkLeite = (CheckBox)findViewById(R.id.ChkLeite);
        ChkCarne = (CheckBox)findViewById(R.id.ChkCarne);
        ChkFeijao = (CheckBox)findViewById(R.id.ChkFeijao);
        ChkRefri = (CheckBox)findViewById(R.id.ChkRefri);

        BtnTotal = (Button)findViewById(R.id.BtnTotal);

        BtnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                StringBuilder result = new StringBuilder();
                result.append("Itens selecionados:");
                double total = 0;

                if (ChkArroz.isChecked()) {
                    result.append("\nArroz: R$ 2,69");
                    total += 2.69;
                }
                if (ChkLeite.isChecked()) {
                    result.append("\nLeite: R$ 5,00");
                    total += 5.00;
                }
                if (ChkCarne.isChecked()) {
                    result.append("\nCarne: R$ 10,00");
                    total += 10.00;
                }
                if (ChkFeijao.isChecked()) {
                    result.append("\nFeijão: R$ 2,30");
                    total += 2.30;
                }
                if (ChkRefri.isChecked()) {
                    result.append("\nRefrigerante: R$2,00");
                    total += 2.00;
                }

                result.append("\nTotal R$: ").append(total);
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
