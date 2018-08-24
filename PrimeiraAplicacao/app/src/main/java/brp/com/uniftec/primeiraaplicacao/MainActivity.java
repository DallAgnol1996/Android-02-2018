package brp.com.uniftec.primeiraaplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nomeEditText;
    private Button digaOlaButton;
    private TextView mensagemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia dos objetos criados atraves do XML
        nomeEditText = findViewById(R.id.nome_edit_Text);
        digaOlaButton = findViewById(R.id.diga_ola_button);
        mensagemTextView = findViewById(R.id.mensagem_text_view);

        //Comportamento do botão

        digaOlaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String mensagem = "Ola" + nomeEditText.getText() + "Bem vindo android";
        mensagemTextView.setText(mensagem);

    }
}
