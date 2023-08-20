# Adapter

### O que é ?
O padrão Adapter é um dos padrões estruturais de projeto e é usado para permitir que duas interfaces incompatíveis possam trabalhar juntas. Ele atua como um intermediário entre duas classes ou sistemas que não podem ser diretamente conectados devido a diferenças em suas interfaces.
Adapter também pode ser usado para facilitar a comunicação entre as camadas do sistema, garantindo que elas permaneçam isoladas umas das outras.

### Código 
No exemplo, o intuito é criar uma interface de validação de email que possa ser usado no nosso código sem que necessáriamente o nosso código cliente tenha que conversar diretamente com uma biblioteca especifica.


### Principais componentes do padrão Adapter
<!--ts-->
    *Target (Alvo): É a interface que o cliente espera e com a qual deseja trabalhar.Nesse caso é a EmailValidator;
    *Adapter: É a classe que implementa a interface do Target e também contém uma referência ao objeto que precisa ser adaptado.Nesse caso EmailValidatorAdapter;
    *Adaptee (Adaptado): É a classe ou componente existente que possui a funcionalidade que você deseja adaptar.Nesse caso é a nossa biblioteca.
    *Cliente: É o código que interage com o Target através do Adapter.Nesse caso é o nosso UserUseCase
<!--te-->



### Vídeo exemplo
https://www.youtube.com/watch?v=mSXnIOldzV8