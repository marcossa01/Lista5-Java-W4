package com.company.domain;

public class PasswordDificil extends Password{

    public PasswordDificil(String senha) {
        super(senha);
    }

    @Override
    public void setSenha(String senha) {

        String regexDificil = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
        if(senha.matches(regexDificil)) {
            System.out.println("Senha Dificil");
        }
        else {
            throw new PasswordException("A senha não cumpre os critérios de segurança");
        }
    }
}
