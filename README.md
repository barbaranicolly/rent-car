# RentCar

Sistema de aluguer de carros desenvolvido em Java.

## Funcionalidades
- Registo de um aluguer com veículo, data de início e data de fim
- Cálculo do valor por hora ou por dia, conforme a duração
- Cálculo do imposto através de uma interface (TaxService)
- Geração da fatura com valor base, imposto e total

## Tecnologias
- Java
- IntelliJ IDEA

## Estrutura
- `application`: classe Program (execução)
- `model.entities`: CarRental, Vehicle, Invoice
- `model.service`: RentalService, TaxService, BrazilTaxService

## Como executar
1. Clona o repositório
2. Abre no IntelliJ
3. Executa a classe Program
