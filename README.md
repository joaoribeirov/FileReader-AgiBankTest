Processador de relatórios de vendas, teste AgiBank.
Relatório contêm vendedor (001), cliente(002) e compra(003).

## Configuração do arquivo de entrada:
Formato: txt
Separador de linha: ç
##
### Dados do vendedor
Os dados do vendedor possuem o identificador 001 e seguem o seguinte formato:
001çCPFçNameçSalary
##
### Dados do cliente
Os dados do cliente possuem o identificador 002 e seguem o seguinte formato:
002çCNPJçNameçBusiness Area
##
### Dados de venda
Os dados de venda possuem o identificador 003 e seguem o seguinte formato:
003çSale IDç[Item ID-Item Quantity-Item Price]çSalesman name
##
Ex.: 
001ç1234567891234çPedroç50000
001ç3245678865434çPauloç40000.99
002ç2345675434544345çJose da SilvaçRural
002ç2345675433444345çEduardo PereiraçRural
003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro
003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo
