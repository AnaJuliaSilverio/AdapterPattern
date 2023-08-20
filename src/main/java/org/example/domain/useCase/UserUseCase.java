package org.example.domain.useCase;

import org.example.adapter.EmailValidator;
import org.example.domain.entity.User;

import java.util.Scanner;

public class UserUseCase {
    private EmailValidator emailValidator;
    private Scanner scanner = new Scanner(System.in);

    public UserUseCase(EmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    public User registerUser(){

        System.out.println("Digite seu nome: ");
        String name =scanner.next();
        String email = receiveEmail();
        System.out.println("Digite sua senha: ");
        String password =scanner.next();

        return new User(name,email,password);
    }

    public String receiveEmail(){
        String email;
        while (true){
            System.out.println("Digite seu email: ");
            email =scanner.next();
            if (!emailValidator.isEmail(email)){
                System.out.println("Email Invalido!");
            }else break;
        }
        return email;
    }
}
