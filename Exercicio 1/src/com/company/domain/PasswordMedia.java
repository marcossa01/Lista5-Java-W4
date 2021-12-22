package com.company.domain;

public class PasswordMedia extends Password {

    public PasswordMedia(String senha) {
        super(senha);
    }

    @Override
    public void setSenha(String senha) {
        String regexMedio = "(?=.*[0-9])(?=.*[a-z]).{6}";

        if (senha.matches(regexMedio)) {
            System.out.println("Senha média");
        }
        else{
            throw new PasswordException("A senha não cumpre os critérios de segurança");
        }

    }
}
