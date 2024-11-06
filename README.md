# CRUD de Gibis em Java
Este projeto implementa um CRUD (Create, Read, Update, Delete) simples para gerenciar um acervo de gibis em Java. A aplicação permite adicionar, listar, alterar e excluir informações de gibis, como nome, ano, autor e categoria, por meio de um menu interativo no terminal.

 ###Funcionalidades
O programa apresenta as seguintes funcionalidades:

**Cadastrar Gibi:** Permite inserir informações de um gibi (nome, ano, autor, categoria).
###Relatórios:
* Listar todos os gibis cadastrados.
* Consultar gibis por autor.
* Consultar gibis por categoria.
**Alterar Gibi:** Permite modificar os dados de um gibi existente, identificando-o pelo ID.
**Excluir Gibi:** Remove um gibi do acervo pelo seu ID.
**Sair:** Encerra o programa.
# Estrutura de Classes
Classe Trabalhogibi2
É a classe principal que contém o menu interativo e controla as operações do CRUD com uma lista de gibis.

Classe gibi
Essa classe representa o modelo de um gibi e inclui atributos como:

ID: identificador único para cada gibi.
Ano: ano de lançamento do gibi.
Nome: título do gibi.
Autor: autor do gibi.
Categoria: gênero ou tipo do gibi.
A classe gibi também possui um método imprimirGibi para exibir os detalhes de um gibi.

# Pré-requisitos
Java: A aplicação é desenvolvida em Java, então é necessário ter o JDK instalado no sistema para compilar e executar o código.
Executando o Código
Clone o Repositório ou copie o código-fonte em um ambiente de desenvolvimento Java (como IntelliJ IDEA ou Eclipse).
Compile o arquivo Trabalhogibi2.java.
Execute a classe Trabalhogibi2.
Ao iniciar o programa, o usuário verá um menu interativo onde pode inserir um número para selecionar uma das opções disponíveis (como "1" para cadastrar um gibi).

Exemplo de Uso
Escolha 1 para cadastrar um gibi, depois insira os detalhes (nome, ano, autor e categoria).
Escolha 2 para acessar os relatórios e listar todos os gibis cadastrados, ou filtrar por autor ou categoria.
Escolha 3 para alterar os dados de um gibi existente, digitando o ID do gibi e os novos valores.
Escolha 4 para excluir um gibi, fornecendo seu ID.
Escolha 5 para encerrar o programa.
