package br.com.blimas.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.btn_jogar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityMoedaSorteada = new Intent(getApplicationContext(), Activity_Sorteado.class);

                //passa valores para a outra activity
                int numeroSorteado = new Random().nextInt(2);
                activityMoedaSorteada.putExtra("numero", numeroSorteado);

                startActivity(activityMoedaSorteada);
            }
        });
    }
}
