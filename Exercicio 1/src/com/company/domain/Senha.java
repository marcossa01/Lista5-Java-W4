package com.company.domain;

public class Senha {

    private final String pattern1;

    public Senha(String pattern) {
        this.pattern1 = pattern;
    }

    public void setSenha(String senha) {

        if (senha.matches(pattern1)) {
            System.out.println("A senha cumpre os critérios de segurança");
        }
        else {
            throw new PasswordException("A senha não cumpre os critérios de segurança");
        }
    }
}
