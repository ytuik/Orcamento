# Criando as notas para o projeto

## Funcionalidades

- Adicionar entradas de dinheiro
- Guardar um Gasto
- Calcular Totais
    - Entradas
    - Saidas
    - Dividas
    - Balanco Geral
- Criar uma aba para terceiros/ Vincular a um contato
- Contatos vão ser uma categoria no gasto
- Poder dividir a conta entre pessoas (No form de adicionar o gasto vai ter uma secao para adicionar a pessoa e colocar o valor que ela vai pagar)


## Entidades
### Gasto
- Valor 
    > Double/BigInt (Obrigatorio)
- Nome 
    > String (Obrigatorio)
- Id 
    > Auto gerado pelo banco
- Categorias
    > Array de String (Salvar os Ids das Categorias)

### Categoria
- Nome 
    > String
- IsPessoa 
    > Boolean
