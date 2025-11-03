# calculation-actions-sonarqube

Este projeto foi criado como um repositório de estudo para validar conhecimentos sobre **Integração Contínua (CI)** empregando Java, Maven, GitHub Actions e SonarQube.

## Objetivo

Demonstrar, de forma prática, como construir um pipeline CI/CD básico que:
- Realiza build e testes automatizados utilizando Maven.
- Utiliza GitHub Actions para automação do pipeline.
- Integra análise de qualidade e cobertura de código via SonarQube.

## O que o projeto faz

O repositório contém um exemplo simples de aplicação Java, que serve como base para o pipeline de integração contínua e análise de código. O workflow de CI foi configurado para:

1. **Compilar o projeto Java utilizando Maven**
2. **Executar os testes unitários**
3. **Rodar análise de qualidade do código com SonarQube/SonarCloud**  
   (incluindo análise estática, métricas de bugs, code smells, vulnerabilidades, e cobertura de testes).

## Tecnologias Utilizadas

- **Java 17**
- **Maven**
- **GitHub Actions**
- **SonarQube ou SonarCloud** (dependendo da configuração)

## Estrutura do workflow (CI)

O arquivo de workflow principal (`.github/workflows/ci.yml`, por exemplo) contempla passos como:

- Checagem de código (checkout)
- Setup do Java via actions/setup-java
- Build e execução dos testes via Maven
- Execução do SonarQube Scanner para análise de qualidade do código

## Como executar localmente

1. Clone o repositório:
   ```
   git clone https://github.com/pitombeira00/calculation-actions-sonarqube.git
   ```

2. Execute o build e os testes:
   ```
   mvn clean package
   ```

## Sobre o autor

Projeto mantido para fins de estudo e demonstração por [pitombeira00](https://github.com/pitombeira00).

---

Sinta-se livre para contribuir, estudar e adaptar este repositório para seus próprios experimentos com CI/CD e análise de qualidade de código!