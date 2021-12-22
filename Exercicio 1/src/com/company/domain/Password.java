package com.company.domain;

public abstract class Password {

    private String senha;

    public Password(String senha) {
        this.senha = senha;
    }

    public abstract void setSenha(String senha);

}
