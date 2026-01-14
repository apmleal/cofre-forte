# 💰 CaixaForte

**CaixaForte** é uma API backend desenvolvida em Java com foco em estudo e aplicação de tecnologias modernas, arquitetura limpa e boas práticas de engenharia de software. O objetivo do projeto é gerenciar salário pessoal por meio de receitas, despesas e **caixinhas financeiras**, permitindo organização, automação e análise financeira.

---

## 🎯 Objetivos do Projeto

- Aplicar **Java moderno (Java 21+)**
- Praticar **DDD + Clean Architecture**
- Explorar **eventos, mensageria e observabilidade**
- Criar uma API escalável, segura e bem documentada
- Servir como **projeto de portfólio** e laboratório técnico

---

## 🧱 Stack Tecnológica

- **Java 21**
- **Spring Boot 3.4+**
- **Spring Web / Validation / Security**
- **Spring Data JPA + Hibernate 6**
- **PostgreSQL**
- **Flyway** (migrations)
- **JWT / OAuth2**
- **Testcontainers**
- **Docker / Docker Compose**
- **OpenAPI (Swagger)**
- **Micrometer + Prometheus + Grafana**

---

## 🗂️ Arquitetura

```
├── application
│   ├── usecase
│   ├── dto
│   └── service
├── domain
│   ├── entity
│   ├── valueobject
│   ├── event
│   └── repository
├── infrastructure
│   ├── persistence
│   ├── messaging
│   ├── security
│   └── config
├── interfaces
│   ├── controller
│   └── mapper
```

---

## 📆 Cronograma de Desenvolvimento

### 🟢 Fase 1 — Fundação (Semana 1)

- Criar repositório Git
- Configurar Spring Boot + Java 21
- Definir arquitetura do projeto
- Configurar PostgreSQL + Flyway
- Docker Compose (API + Banco)
- Swagger / OpenAPI

### 🟢 Fase 2 — Domínio Financeiro (Semana 2)

- Entidades: Receita, Despesa, Caixinha, Lançamento
- Value Objects
- Repositórios de domínio
- Casos de uso

### 🟡 Fase 3 — API REST (Semana 3)

- Controllers REST
- DTOs
- Mappers
- Validações
- Padrão de erros

### 🟡 Fase 4 — Regras Financeiras (Semana 4)

- Distribuição de salário
- Transferências entre caixinhas
- Saldo geral
- Fechamento mensal

### 🔵 Fase 5 — Segurança (Semana 5)

- Spring Security
- JWT
- Controle de acesso

### 🔵 Fase 6 — Eventos e Mensageria (Semana 6)

- Domain Events
- Kafka ou RabbitMQ
- Processamento assíncrono

### 🔴 Fase 7 — Observabilidade e Qualidade (Semana 7)

- Logs
- Métricas
- Testes
- Testcontainers
- ArchUnit

### 🟣 Fase 8 — Evoluções Futuras

- Redis
- Relatórios
- Open Finance
- Frontend

---

## 👨‍💻 Autor

**Andrei Petro**
