# Java Backend Foundations - Lógica e Estrutura Core

> **Projeto de Especialização:** O alicerce da minha jornada no desenvolvimento Backend.
> **Linguagem:** Java (JDK 17+) | **Foco:** Lógica, Estrutura de Dados e Resiliência.

---

## 📑 Índice

* [📍 Sobre o Repositório](#-sobre-o-repositório)
* [📂 Estrutura de Pastas](#-estrutura-de-pastas)
* [🛠️ Destaques Técnicos](#️-destaques-técnicos)
* [🚀 Módulos Implementados](#-módulos-implementados)
* [🔜 Próximos Passos](#-próximos-passos)

---

## 📍 Sobre o Repositório

O foco aqui é o **Java Core**. Os desafios contidos neste repositório foram projetados para simular problemas reais de backend, onde a precisão matemática e o tratamento de erros são mais importantes que a estética visual. Cada módulo explora um conceito específico: desde a validação geométrica até a gestão direta de índices em arrays.

---

## 📂 Estrutura de Pastas

```bash
├── 01-triangle-classifier/    # Validação e Classificação Geométrica
│   └── src/
│       └── Triangle.java      # Lógica de negócio e condicionais
├── 02-vector-manipulator/     # Gestão de Arrays e Memória
│   └── src/
│       └── VectorChange.java  # Manipulação de índices e Buffer
├── .gitignore                 # Filtro de arquivos binários e IDE
└── README.md                  # Documentação técnica
```

---

## 🛠️ Destaques Técnicos

Neste repositório, priorizo práticas que garantem a estabilidade do software em ambiente de produção:

### 🛡️ Programação Defensiva (`try-catch`)

Utilizo blocos de tratamento de exceção para evitar que o programa encerre abruptamente caso o usuário insira caracteres em vez de números.

```java
try {
    int posicao = sc.nextInt();
    // processamento...
} catch (InputMismatchException e) {
    System.out.println("ERRO! Digite apenas números inteiros.");
    sc.next(); // Limpeza de rastro no buffer
}
```

### 🧹 Gestão de Buffer do Scanner

Implementação de limpezas estratégicas de buffer (`sc.nextLine()`) para permitir a transição suave entre a leitura de dados numéricos e textuais, evitando o erro comum de "pular" entradas do usuário.

---

## 🚀 Módulos Implementados

**1. Triangle Classifier:**
Um motor de regras que utiliza vetores para armazenar dimensões e aplica o teorema da desigualdade triangular para validar e classificar formas geométricas.

**2. Vector Manipulator:**
Um laboratório de manipulação de memória que permite alterar estados específicos de um array, traduzindo a lógica humana (1-5) para a lógica computacional (0-4) de forma transparente.

---

## 🔜 Próximos Passos

A evolução deste repositório seguirá o cronograma de especialização Backend:

1. **Analisador de Notas:** Implementação de alocação dinâmica de memória baseada no input do usuário.
2. **Introdução à POO:** Refatoração dos desafios atuais para o paradigma de Orientação a Objetos (Classes e Métodos).
3. **Persistência:** Integração futura com JDBC para salvar estados em bancos de dados SQL.

---

## 📫 Contato

* Email: **jorge.paiv4@gmail.com**
* LinkedIn: [Jorge Henrique](https://www.linkedin.com/in/jorge-henrique-16b567263/)
