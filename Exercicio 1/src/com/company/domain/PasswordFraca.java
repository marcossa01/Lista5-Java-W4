package com.company.domain;

public class PasswordFraca extends Password {

    public PasswordFraca(String senha) {
        super(senha);
    }

    @Override
    public void setSenha(String senha) {
        String regexFraco = "(?=.*[0-9]).{4}";

        if (senha.matches(regexFraco)) {
            System.out.println("Senha Fraca!");
        }
        else {
            throw new PasswordException("A senha não cumpre os critérios de segurança");
        }
    }
}
