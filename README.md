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

O foco aqui é o **Java Core**. Os desafios contidos neste repositório foram projetados para simular problemas reais de backend, onde a precisão matemática e o tratamento de erros são mais importantes que a estética visual. Cada módulo explora um conceito específico: desde a validação geométrica até a arquitetura modular com alocação dinâmica.

---

## 📂 Estrutura de Pastas

```bash
├── 01-triangle-classifier/    # Validação e Classificação Geométrica
│   └── src/
│       └── Triangle.java      # Lógica de negócio e condicionais
├── 02-vector-manipulator/     # Gestão de Arrays e Memória
│   └── src/
│       └── VectorChange.java  # Manipulação de índices e Buffer
├── 03-dynamic-performance-analyzer/ # Arquitetura Modular e Estatística
│   └── src/
│       └── DynamicPerformanceAnalyzer.java 
├── .gitignore                       # Filtro de arquivos binários e IDE
└── README.md                        # Documentação técnica
```

---

## 🛠️ Destaques Técnicos

Neste repositório, priorizo práticas que garantem a estabilidade do software em ambiente de produção:

### 🛡️ Programação Defensiva e Validação Proativa

Além do uso de `try-catch` para capturar falhas críticas de entrada, o projeto implementa **validações proativas** para garantir que o estado da memória (como o tamanho de um array) seja sempre válido antes da execução.

```java
if (qtd <= 0) {
    System.out.println("ERRO! A quantidade deve ser maior que zero!");
    continue; // Prevenção de NegativeArraySizeException
}
```

### 🧩 Arquitetura Modular (SoC)

Aplicação do princípio de **Separação de Preocupações**. O código é dividido em métodos estáticos especializados, facilitando a manutenção e os testes unitários. O `main` atua exclusivamente como um orquestrador de alto nível.

---

## 🚀 Módulos Implementados

**1. Triangle Classifier:**
Um motor de regras que utiliza vetores para armazenar dimensões e aplica o teorema da desigualdade triangular para validar e classificar formas geométricas.

**2. Vector Manipulator:**
Um laboratório de manipulação de memória que permite alterar estados específicos de um array, traduzindo a lógica humana (1-5) para a lógica computacional (0-4) de forma transparente.

**3. Dynamic Performance Analyzer:**
Sistema de análise estatística que utiliza **alocação dinâmica de memória** baseada no input do usuário. Implementa métodos independentes para cálculo de média, identificação de extremos (maior/menor nota) e geração de relatórios formatados.

---

## 🔜 Próximos Passos

A evolução deste repositório seguirá o cronograma de especialização Backend:

1.  **Migração para POO:** Refatoração do Analisador de Notas para o paradigma de **Orientação a Objetos**, utilizando Classes, Atributos, Encapsulamento e Métodos de Instância.
2.  **Gestão de Coleções:** Evolução do uso de Arrays fixos para `ArrayList` e outras estruturas da Java Collections API.
3.  **Persistência:** Integração futura com JDBC para salvar estados em bancos de dados SQL.

---

## 📫 Contato

* Email: **jorge.paiv4@gmail.com**
* LinkedIn: [Jorge Henrique](https://www.linkedin.com/in/jorge-henrique-16b567263/)