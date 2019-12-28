package br.com.blimas.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_Sorteado extends AppCompatActivity {

    private Button botaoVoltar;
    private ImageView exibeMoedaSorteada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteado);

        botaoVoltar = findViewById(R.id.btn_voltar);
        exibeMoedaSorteada = findViewById(R.id.moeda_sorteada);

        //recuperar dados da mainactivity
        Bundle dadosRecebidos = getIntent().getExtras();
        int numeroSorteado = dadosRecebidos.getInt("numero");

        if(numeroSorteado == 0){
            exibeMoedaSorteada.setImageResource(R.drawable.moeda_cara);
        }else {
            exibeMoedaSorteada.setImageResource(R.drawable.moeda_coroa);
        }

        //evento de clique para o botao voltar
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finaliza activity_sorteado
                finish();
            }
        });
    }
}
