# Trabalho de Compiladores - Geração de Código HTML para Cartas Yu-Gi-Oh!


## Realizador
- Árlisson Alves da Silva Silveira

## Descrição do Trabalho

O trabalho foi realizado como parte da disciplina de Compiladores, no 6º período do curso de Engenharia de Computação do Instituto Federal Fluminense. O objetivo principal do projeto foi desenvolver um compilador utilizando a linguagem de programação Java e a ferramenta ANTLR4.

A proposta do compilador consistiu em criar uma linguagem capaz de gerar código HTML a partir da descrição de cartas do jogo Yu-Gi-Oh! fornecida pelo usuário.

Para atingir esse objetivo, foram aplicados conceitos e técnicas aprendidos ao longo da disciplina de Compiladores, tais como análise léxica, análise sintática e geração de código. A ferramenta ANTLR4 foi escolhida devido à sua capacidade de facilitar a implementação desses processos.

No processo de desenvolvimento, foram definidas regras gramaticais utilizando a sintaxe do ANTLR4 para descrever a estrutura e o formato das cartas do Yu-Gi-Oh!. Em seguida, foram implementados os analisadores léxicos e sintáticos, responsáveis por identificar e validar a sintaxe correta das descrições das cartas fornecidas pelo usuário.

Uma vez que as descrições das cartas são corretamente processadas e validadas, o compilador gera o código HTML correspondente a cada carta, respeitando as especificações de formatação e estilos definidos para a exibição das informações da carta.

O trabalho foi uma oportunidade para aplicar os conhecimentos teóricos adquiridos na disciplina de Compiladores em um projeto prático e relevante. Além disso, permitiu explorar as capacidades da linguagem Java e da ferramenta ANTLR4 na implementação de um compilador funcional.

No final, o resultado obtido foi um compilador eficiente e robusto, capaz de receber descrições de cartas Yu-Gi-Oh! e gerar o código HTML correspondente, possibilitando a visualização das informações das cartas em um formato adequado para exibição em um navegador web.

## Sobre a linguagem

A linguagem desenvolvida é bem simples, é uma linguagem de descrição, não é possível realizaar operações matemátcas, nem comparações, ou outras operações lógicas. A ideia é que o usuário apenas descreva as especificações de uma carta de Yu-Gi-Oh! e a partiri disso, a carta seja gerada como saída em um arquivo HTML.

## Sobre cartas do jogo Yu-Gi-Oh!
### Exemplo de uma carta de monstro
![Atributos de uma carta de monstro](https://github.com/arlisson/Compiladores/blob/main/assets/carta.png)

#### Existem alguns monstros especiais, como os monstros XYZ, que possuem rank no lugar do nível, mas é apenas uma mudança visual e gramátical.


### Exemplo de uma carta de magia/armadilha
![Carta magica](https://github.com/arlisson/Compiladores/blob/main/assets/Polymerization.png)

#### Uma carta de magia/armadilha é semelhante a uma carta de monstro, porém não possui nível, nem tipo, nem pontos de ataque ou defesa. Além disso seu atributo é fixo, e não varia como o de um monstro.

## Regras da linguagem

Como dito anteriormente a linguagem é uma linguagem de definição, mas mesmo assim não está isenta de regras.
### Declaração de cartas
#### Carta de Monstro
- CARTA-MONSTRO: TIPO-DO-MONSTRO(SEMPR EEM LETRAS MAIÚSCULAS); /*não se esqueça do ';' no final de cada linha de comando*/
  
	NOME: "Nome do monstro" (sempre entre aspas duplas); /*não se esqueça do ';' no final de cada linha de comando*/

	LEVEL: (um número inteiro maior do que 0 e menor ou igual a 12); /*não se esqueça do ';' no final de cada linha de comando*/

	ATRIBUTO: ATRIBUTO DO MONSTRO (UM DOS CINCO ATRIBUTOS POSSÍVEIS, SEMPRE ME MAIÚSCULO); /*não se esqueça do ';' no final de cada linha de comando*/

	TIPO: DRAGÃO (UM DOS MUITOS TIPOS POSSÍVEIS, SEMPRE EM MAIÚSUCULO);	/*não se esqueça do ';' no final de cada linha de comando*/

	ATAQUE: 3000 (Um número inteiro maior ou igual a 0 e menor ou igual a 999999); /*não se esqueça do ';' no final de cada linha de comando*/

	DEFESA: 2500 (Um número inteiro maior ou igual a 0 e menor ou igual a 999999); /*não se esqueça do ';' no final de cada linha de comando*/

	DESCRICAO: "Descrição da carta" (sempre entre aspas duplas); /*não se esqueça do ';' no final de cada linha de comando*/

	IMAGEM: "imagem.jpg" (sempre entre aspas duplas); /*não se esqueça do ';' no final de cada linha de comando*/

#### Carta mágica/aramdilha
- CARTA-MAGICA: MAGIA-NORMAL;
  
	NOME: "Espadas da Luz Reveladora";

	DESCRICAO: "Descrição da carta";

	IMAGEM: "reveladora.jpg";



