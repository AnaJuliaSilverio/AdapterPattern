package org.example;

import org.example.adapter.EmailValidator;
import org.example.adapter.EmailValidatorAdapter;
import org.example.domain.entity.User;
import org.example.domain.useCase.UserUseCase;

public class Main
{
    public static void main( String[] args )
    {
        EmailValidator emailValidator = new EmailValidatorAdapter();
        UserUseCase useCase = new UserUseCase(emailValidator);
        User user = useCase.registerUser();
    }
}
