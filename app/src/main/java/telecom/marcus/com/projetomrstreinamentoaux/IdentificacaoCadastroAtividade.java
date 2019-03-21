package telecom.marcus.com.projetomrstreinamentoaux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IdentificacaoCadastroAtividade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.identificacao_cadastro_atividade);
    }

    public void seguinte(View view) {
        startActivity(new Intent(this, CadastroAtividades.class));
    }
}
