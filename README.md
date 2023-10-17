**Projeto Biblioteca: Sistema de Gerenciamento de Livros e Empréstimos**

Este projeto implementa um sistema de gerenciamento de biblioteca em Java, permitindo a criação, remoção, busca, empréstimo e devolução de livros. Abaixo estão os detalhes das classes e métodos implementados:

### Classe `Livro`:

A classe `Livro` representa um livro na biblioteca e possui os seguintes atributos:

- `titulo` (String): título do livro.
- `autor` (String): autor do livro.
- `isbn` (String): número de identificação único do livro.
- `emprestado` (boolean): indica se o livro está emprestado ou não.

Métodos:

- `reservar()`: reserva o livro se ele não estiver emprestado. Retorna `true` se a reserva for bem-sucedida, `false` se o livro já estiver emprestado.
- `devolver()`: marca o livro como disponível se estiver emprestado. Retorna `true` se a devolução for bem-sucedida, `false` se o livro não estiver emprestado.
- `exibir_info()`: retorna uma string com as informações do livro, incluindo título, autor, ISBN e status de empréstimo.

### Classe `Biblioteca`:

A classe `Biblioteca` representa o catálogo de livros e possui os seguintes métodos:

- `adicionarLivro(String titulo, String autor, String isbn)`: adiciona um livro ao catálogo.
- `removerLivro(String isbn)`: remove um livro do catálogo com base no ISBN.
- `buscarPorTitulo(String titulo)`: retorna uma lista com todos os livros que contêm o título especificado.
- `emprestarLivro(String isbn)`: tenta emprestar um livro usando o ISBN. Retorna `true` se o livro foi emprestado com sucesso, `false` se o livro não foi encontrado ou já está emprestado.
- `devolverLivro(String isbn)`: devolve um livro usando o ISBN. Retorna `true` se a devolução foi bem-sucedida, `false` se o livro não foi encontrado ou não estava emprestado.
- `listarLivros()`: retorna uma lista com todos os livros do catálogo.

### Como Usar:

1. **Criando Livros:**
   ```java
   Biblioteca biblioteca = new Biblioteca();
   biblioteca.adicionarLivro("Título do Livro", "Autor do Livro", "1234567890");
   ```

2. **Buscando Livros por Título:**
   ```java
   ArrayList<Livro> livrosEncontrados = biblioteca.buscarPorTitulo("Título");
   ```

3. **Emprestando Livros:**
   ```java
   boolean emprestadoComSucesso = biblioteca.emprestarLivro("1234567890");
   ```

4. **Devolvendo Livros:**
   ```java
   boolean devolvidoComSucesso = biblioteca.devolverLivro("1234567890");
   ```

5. **Listando Todos os Livros:**
   ```java
   ArrayList<Livro> todosLivros = biblioteca.listarLivros();
   ```

Este é um projeto básico de gerenciamento de biblioteca em Java, com funcionalidades principais para adição, remoção, busca, empréstimo e devolução de livros. Sinta-se à vontade para expandir e melhorar o projeto conforme suas necessidades!
