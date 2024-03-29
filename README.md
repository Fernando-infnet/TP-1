# Relatório do Projeto TP1 
Neste relatório iremos escrever a resposta para todas as instruções do trabalho, incluindo prints e linhas de código do projeto criado.
## Preparação do Ambiente
![Screenshot from 2024-02-19 18-46-20](https://github.com/Fernando-infnet/TP-1/assets/132312334/20e8ba4a-560b-40d6-a8ee-fcf3054f02d2)

Baixar Intellij no site oficial do software

## Criação de Projeto
![Screenshot from 2024-02-19 18-44-20](https://github.com/Fernando-infnet/TP-1/assets/132312334/d9c75f73-2cee-46a0-b2c6-50b215a2276e)

Uso de linguagem Java, Gradle, e JDK 1.8

## Implementação de classes
Foi escolhido empresa por ser um negócio mais abrangente que é bastante genérico e facilita na interpretação do projeto.
Em uma empresa, a entidade chave é o funcionário, que pode assumir várias funções, tem um nome distinto, salário e localização na empresa, todos atributos relevantes para sua identificação.

![Screenshot from 2024-02-19 20-19-30](https://github.com/Fernando-infnet/TP-1/assets/132312334/bbe31d68-3372-400b-982f-f64f568eab09)

A imagem acima mostra a criação de dois funcionários com atributos que funcionam, e que podem ser chamados para serem mostrados como respectivos valores de funcionário 1 e 2

![Screenshot from 2024-02-19 20-16-34](https://github.com/Fernando-infnet/TP-1/assets/132312334/ca47263c-c342-4e0f-bccd-81f1ae67180d)

## Instanciação de Objetos

![Screenshot from 2024-02-19 18-54-35](https://github.com/Fernando-infnet/TP-1/assets/132312334/f7bc1abd-822b-4209-b7d2-2002218f38d2)

Os seguintes objetos tem como objetivo não serem possíveis de funcionar de acordo com a definição da classe, já que tipos como int, string, não podem ser convertidos durante a inserção de valores sem ocorrer um erro no programa, como o seguinte:

![Screenshot from 2024-02-19 19-03-22](https://github.com/Fernando-infnet/TP-1/assets/132312334/2538e834-8fdf-45f9-8fbf-a2bc6b11176a)

### Análise dos valores dos atributos dos objetos

Mas também é necessário a avaliação de objetos de mesmo tipo, como nesse caso:

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/b15b562f-1310-45a0-93bb-54a7c2c1f43e)

Área é uma string, mas está vazia, o que não é bom para o objeto, se for utilizar do valor deste objeto no futuro.

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/a4c16cbb-555a-4b80-8907-ccfd1684d751)

Salário é int, mas está 0, salário é necessário ser acima de 0, para que seja considerado como tal.
Ambos estes casos resultam nesses erros

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/9982a5c3-f814-40d5-8752-1dc3285fd9d9)

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/8488a980-1237-40a7-8185-8a781dd9aeba)

O construtor da classe:

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/8691df04-34cc-4c35-89b5-266b2f9460d6)

### Validação dos métodos de acesso
O seguinte código consegue mexer nos getters e setters do objeto, inclusive verificar quando um valor é fora do padrão de uso, jogando um erro.

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/16697153-86ad-4e08-bac2-b4ca0d8d0a92)

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/426af7cc-7c0f-4470-a844-1aed8f1d55dc)

## Implementação de Métodos
O Seguinte método pode ser utilizado em um contexto real para calcular aumento de um funcionário da empresa, valores são testado se estão acima de 0 para serem considerados aumento, caso contrário é lançado uma exceção.

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/845de543-8d46-4f99-a5b4-e31664e6b2d9)

![image](https://github.com/Fernando-infnet/TP-1/assets/132312334/1f1ede55-58ed-44d6-954b-91d15bcff714)

## Exploração de Condições
Várias situações durante o relatório são testadas para o bom funcionamento do código, é possível notar a verificação antes e após, durante o construtor e sets, para que seja possível apenas entrar dados confiáveis no objeto.
