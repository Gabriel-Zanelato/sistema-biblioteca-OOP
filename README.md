
# Sistema de Biblioteca em Java

Este é um projeto simples de gerenciamento de biblioteca, criado para praticar conceitos de programação orientada a objetos (POO) em Java. Desenvolvi este sistema usando o **NetBeans**, e ele está em uma versão inicial, com o código ainda bruto e sem muitas otimizações.

## Funcionalidades

- **Adicionar livros à biblioteca**: Você pode adicionar novos livros à coleção da biblioteca.
- **Listar livros disponíveis**: Exibe todos os livros que ainda não foram emprestados.
- **Empréstimo de livros**: Permite marcar um livro como "emprestado".
- **Devolução de livros**: Marca o livro emprestado como "devolvido" e o torna disponível novamente.

## O que foi utilizado

- **NetBeans IDE**: Todo o desenvolvimento foi feito no NetBeans, então o projeto está no formato nativo da IDE, sem modificações ou otimizações além do básico.
- **Java**: O projeto usa classes e métodos simples para aplicar os conceitos de POO.

## Estrutura do Projeto

As principais classes do projeto são:

- **Autor**: Representa um autor, com nome e nacionalidade.
- **Livro**: Contém as informações de título, autor, ano de publicação e estado (disponível ou emprestado).
- **Biblioteca**: Gerencia o acervo de livros, cuidando da adição, listagem, empréstimos e devoluções.

## Como Rodar o Projeto

1. **Clonar o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. **Abrir o projeto no NetBeans**:
    - No **NetBeans**, clique em **File** > **Open Project** e selecione a pasta onde o projeto foi clonado.
    
3. **Executar o projeto**:
    - Clique com o botão direito no arquivo `Main.java` e selecione **Run File** ou pressione `Shift+F6`.

## Exemplo de Saída

Quando você rodar o programa, verá algo assim no console:

```bash
Livro adicionado: Dom Casmurro
Livro adicionado: Harry Potter e a Pedra Filosofal

Livros disponiveis:
Titulo: Dom Casmurro, Autor: Machado de Assis, Ano: 1899, Disponivel: true
Titulo: Harry Potter e a Pedra Filosofal, Autor: JK Rowling, Ano: 1997, Disponivel: true

Livro emprestado: Dom Casmurro
Livro emprestado: Harry Potter e a Pedra Filosofal

Livro devolvido: Dom Casmurro

Livros apos operacoes:
Titulo: Dom Casmurro, Autor: Machado de Assis, Ano: 1899, Disponivel: true
Titulo: Harry Potter e a Pedra Filosofal, Autor: JK Rowling, Ano: 1997, Disponivel: false
```

## Observações

Este projeto ainda está em uma fase inicial e foi criado com o objetivo principal de praticar Java e POO. Algumas funcionalidades podem ser melhoradas e o código ainda pode ser refatorado. Contribuições e sugestões são bem-vindas!

## Requisitos

- **NetBeans IDE** (versão 12 ou superior)
- **JDK 8** ou superior

## Sobre o Autor

Desenvolvido por **Gabriel Zanelato** como parte de meus estudos e aprimoramento em programação. Este projeto foi uma excelente oportunidade para aplicar conceitos básicos de POO e explorar o desenvolvimento em Java.
