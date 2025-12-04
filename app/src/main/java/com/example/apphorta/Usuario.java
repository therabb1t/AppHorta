package com.example.apphorta;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// A tabela que armazena todos os logins
@Entity(tableName = "usuarios")
public class Usuario {

    // Chave primária: id do seu DB original
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "nome")
    private String nome;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "senha")
    private String senha; // Armazenaremos a senha para este exemplo

    // Campo para diferenciar os logins (CRUCIAL para o redirecionamento)
    @ColumnInfo(name = "tipo_usuario")
    private String tipoUsuario; // "normal" ou "voluntario"

    // Construtor
    public Usuario(String nome, String email, String senha, String tipoUsuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }

    // --- GETTERS E SETTERS (Obrigatórios para o Room) ---
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }
}