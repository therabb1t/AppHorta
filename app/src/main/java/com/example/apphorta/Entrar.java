package com.exemplo.seuapp.activities; // Ajuste seu package

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.exemplo.seuapp.R;
import com.exemplo.seuapp.database.AppDatabase;
import com.exemplo.seuapp.models.Usuario;

public class Entrar extends AppCompatActivity {

    private AppDatabase db;
    private EditText editTextEmail, editTextSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);

        db = AppDatabase.getDatabase(this);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextSenha = findViewById(R.id.edit_text_senha);
        Button buttonLogin = findViewById(R.id.button_login);

        // Popula o DB com os voluntários iniciais (só na primeira execução do app)
        new PopulateDbAsyncTask(db).execute();

        buttonLogin.setOnClickListener(v -> {
            String email = editTextEmail.getText().toString().trim();
            String senha = editTextSenha.getText().toString().trim();

            if (email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(this, "Preencha e-mail e senha.", Toast.LENGTH_SHORT).show();
            } else {
                // Inicia a tarefa de login em background
                new LoginAsyncTask(db, email, senha).execute();
            }
        });
    }

    // --- CLASSE PARA POPULAR O DB NA PRIMEIRA EXECUÇÃO (CUIDADO COM A SENHA!) ---
    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private final AppDatabase db;

        PopulateDbAsyncTask(AppDatabase db) { this.db = db; }

        @Override
        protected Void doInBackground(Void... voids) {
            if (db.usuarioDao().countUsers() == 0) {
                // VOLUNTÁRIOS (tipo: "voluntario") - IDs 1 e 2 do seu SQL
                db.usuarioDao().insert(new Usuario("ANINHA.JUANINHA@gamil.com", "12345", "ANA CASTRO DE ARAUJO", "voluntario"));
                db.usuarioDao().insert(new Usuario("LILI.KAKA@gmail.com", "12345", "Leo Kalil", "voluntario"));

                // USUÁRIO NORMAL (tipo: "normal") - Exemplo
                db.usuarioDao().insert(new Usuario("usuario.normal@teste.com", "67890", "Usuário Normal", "normal"));
            }
            return null;
        }
    }

    // --- CLASSE PARA EXECUTAR A LÓGICA DE LOGIN ---
    private class LoginAsyncTask extends AsyncTask<Void, Void, Usuario> {
        private final AppDatabase db;
        private final String email;
        private final String senha;

        LoginAsyncTask(AppDatabase db, String email, String senha) {
            this.db = db;
            this.email = email;
            this.senha = senha;
        }

        @Override
        protected Usuario doInBackground(Void... voids) {
            return db.usuarioDao().login(email, senha); // Chama a query no Room
        }

        @Override
        protected void onPostExecute(Usuario usuario) {
            if (usuario != null) {
                // LOGIN BEM-SUCEDIDO
                String tipo = usuario.getTipoUsuario();
                Toast.makeText(Entrar.this, "Login SUCESSO! Tipo: " + tipo, Toast.LENGTH_LONG).show();

                // LÓGICA DE REDIRECIONAMENTO
                if ("voluntario".equals(tipo)) {
                    // Navega para a sua classe Voluntario.java
                    startActivity(new Intent(Entrar.this, Voluntario.class));
                } else if ("normal".equals(tipo)) {
                    // Navega para a classe NormalActivity.java
                    startActivity(new Intent(Entrar.this, NormalActivity.class));
                }
                finish(); // Fecha a tela de login
            } else {
                // LOGIN FALHOU
                Toast.makeText(Entrar.this, "E-mail ou Senha incorretos.", Toast.LENGTH_LONG).show();
            }
        }
    }
}