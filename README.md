# Pilares da Programação Orientada a Objetos (POO)

Este repositório contém um exemplo simples de implementação dos pilares da Programação Orientada a Objetos (POO) em Java. O código envolve três classes principais: `Autodromo`, `Carro`, `Moto`, e uma classe abstrata `Veiculo`. O exemplo ilustra os conceitos dos quatro pilares da POO: Encapsulamento, Abstração, Herança e Polimorfismo.

## Encapsulamento
A classe `Veiculo` demonstra o princípio do encapsulamento, que envolve ocultar os detalhes internos da implementação de uma classe e fornecer métodos públicos para interagir com os atributos privados. Neste exemplo, o atributo `chassi` é encapsulado através de métodos getter e setter.

## Abstração
A abstração é uma técnica para simplificar a complexidade, permitindo que você modele classes com base nas características essenciais. A classe abstrata `Veiculo` é um exemplo de abstração. Ela define um método abstrato `ligar()` que todas as subclasses devem implementar. A abstração permite que você crie um modelo genérico para veículos, com o comportamento esperado em comum.

## Herança
A herança é um mecanismo em que uma classe (subclasse) herda os atributos e métodos de outra classe (superclasse). As classes `Carro` e `Moto` herdam da classe `Veiculo`. Isso permite que as subclasses estendam o comportamento da classe base, mantendo a reutilização de código e a relação de "é um" entre as classes.

## Polimorfismo
O polimorfismo permite que diferentes classes sejam tratadas como objetos de uma classe base em tempo de execução. O polimorfismo é demonstrado quando a variável `coringa` é do tipo `Veiculo`, mas aponta para uma instância de `Moto`. Isso permite que o método `ligar()` seja chamado independentemente do tipo real da instância, ilustrando a capacidade de diferentes objetos responderem ao mesmo método de maneira diferente.

Neste exemplo, o conceito de polimorfismo é utilizado quando a instância `coringa` chama o método `ligar()`, que é implementado de maneira diferente nas classes `Carro` e `Moto`.

Esse código simples demonstra os pilares fundamentais da POO - Encapsulamento, Abstração, Herança e Polimorfismo - em um cenário de um autódromo com carros e motos. Esses princípios são a base para criar sistemas complexos, organizados e de fácil manutenção na programação orientada a objetos.
