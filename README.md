<h1 align="center"> C214 - Turma B </h1>
<p align="center"> Exercícios práticos sobre Design Pattern</p>

<p align="center">
<img src="https://img.shields.io/static/v1?label=License&message=MIT&color=00bfff&style=plastic"/>

<img src="https://img.shields.io/static/v1?label=LP&message=Java&color=daa520&style=plastic"/>

<img src="https://img.shields.io/static/v1?label=GD&message=Maven&color=9acd32&style=plastic"/>

<img src="https://img.shields.io/static/v1?label=IDE&message=IntelliJ&color=5f9ea0&style=plastic"/>
</p>

<h4 align="center"> :small_orange_diamond: Em desenvolvimento... </h4>

### :books: Exercícios Práticos

- [x] Exercício 01: Design Pattern Strategy
- [ ] Exercício 02: Design Pattern Observer

### :point_right: Tecnologias

- Gerenciador de dependências: Maven
- Dependência: JUnit
- Linguagem de Programação: Java
- IDE: IntelliJ

### :heavy_check_mark: Execução

Para a execução dos projetos, é possível fazer o download do código direto do GitHub ou através do git clone https://github.com/MaMBassi/C214B-DesignPattern.git. Contudo, para a segunda opção, é necessário ter o [Git](https://git-scm.com) instalado.

- Abrir o arquivo no seu editor escolhido;

- Instalar as dependências do pom.xml;

- Executar a classe Principal.

### :computer: Exercício 01 - Sistema de Ordenar Dados

- Algoritmos de Ordenação:
  - ArraySort: ordena os dados, em ordem crescente, utilizando o método .sort( ) do Collections;
  - InsertionSort: ordena os dados, em ordem crescente, utilizando o Algoritmo Insertion Sort;
  - BubbleSort: ordena os dados, em ordem crescente, utilizando o Algoritmo Bubble Sort;

- src/main/java/package:
  -  Principal: classe main que será executada para o sistema ordenar os dados de uma lista pré-definida, de acordo com o algoritmo de ordenação escolhido.
  -  SistemaOrdenarDados: classe abstrata.
  -  AlgoritmoOrdenar: interface.
  -  /algoritmo:
     - AlgoritmoAS, AlgoritmoIS, AlgoritmoBS: família de Algoritmos.  

### :mag: Testes unitários

1. Caso de teste: Verificar se será ordenado com o algoritmo escolhido:
   - testeArraySort, testeInsertionSort, testeBubbleSort.
2. Caso de teste: Verificar o resultado da ordenação de cada algoritmo:
   - testeArraySortResultado, testeInsertionSortResultado, testeBubbleSortResultado.

Para executar os testes, ir em src > test > package > TestSistemaOrdenarDados. No IntelliJ, para executar os testes, é necessário apertar o símbolo de play (:arrow_forward:) da classe para executar todos os testes ou o símbolo de play de cada @Test para executar os testes individualmente.

### :woman: Autora
:link: https://github.com/MaMBassi

### :small_blue_diamond: Licença
MIT

