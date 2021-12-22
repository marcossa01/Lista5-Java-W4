package com.company;

import com.company.domain.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*  1. Crie uma classe de Senha. O construtor deve receber uma regex (expressão regular)
        que valida o formato exigido para a senha. Pesquise na Internet quais recursos Java
        fornece para operar com expressões regulares.

        2. Adicione o método public void setValue (String pwd) que permite atribuir uma senha
        de acordo com a exigida pela regex do ponto anterior. Em caso de incompatibilidade,
        o método deve lançar uma exceção.

        a. Discussão: que tipo de exceção você considera mais adequada?
        b. Implemente o método conforme decidido em (2).

        3. Escreva três classes: PasswordForte, PasswordMedia, PasswordFraca, todas elas
        devem estender Password e codificar um regex de acordo com o nível de segurança
        que o nome da classe indica. */

        Scanner sc = new Scanner(System.in);
        /*
        String senha;
        String patternRegex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";

        Senha s1 = new Senha(patternRegex);

        System.out.print("Digite uma senha: ");
        senha = sc.nextLine();

        s1.setSenha(senha);

        System.out.println();
        System.out.println("*******************************************");
        System.out.println();
         */

        String senhaFraca;

        System.out.println("Digite uma senha com os seguintes critérios: ");
        System.out.println("- Máximo 4 caracteres\n- Contenha números");
        System.out.print("Digite a senha: ");
        senhaFraca = sc.nextLine();

        Password p1 = new PasswordFraca(senhaFraca);
        p1.setSenha(senhaFraca);

        System.out.println();
        System.out.println("*******************************************");
        System.out.println();

        String senhaMedia;

        System.out.println("Digite uma senha com os seguintes critérios: ");
        System.out.println("- Máximo 6 caracteres\n-Números\n-Letras minúsculas");
        System.out.print("Digite a senha: ");
        senhaMedia = sc.nextLine();

        Password p2 = new PasswordMedia(senhaMedia);
        p2.setSenha(senhaMedia);

        System.out.println();
        System.out.println("*******************************************");
        System.out.println();

        String senhaDificil;

        System.out.println("Digite uma senha com os seguintes critérios: ");
        System.out.println("- Mínimo 8 caracteres\n-Letras minúsculas\n-Letras Maiúsculas\n-Sem espaçamento\n-Números");
        System.out.print("Digite a senha: ");
        senhaDificil = sc.nextLine();

        Password p3 = new PasswordDificil(senhaDificil);
        p3.setSenha(senhaDificil);

        sc.close();
    }
}
