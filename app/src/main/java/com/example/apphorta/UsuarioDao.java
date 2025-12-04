package com.example.apphorta; // Ajuste seu package
// Se usar subpastas: package com.example.apphorta.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

// O Room implementa esta interface em tempo de execução
@Dao
public interface UsuarioDao {

    // Query de Login: busca o usuário por email E senha
    @Query("SELECT * FROM usuarios WHERE email = :email AND senha = :senha LIMIT 1")
    Usuario login(String email, String senha);

    // Insere um novo usuário (usado para cadastrar ou popular os voluntários iniciais)
    @Insert
    void insert(Usuario usuario);

    // Conta o número de usuários (para evitar duplicação ao popular o DB)
    @Query("SELECT COUNT(id) FROM usuarios")
    int countUsers();
}