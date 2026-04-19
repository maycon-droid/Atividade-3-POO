## Questão 4 ##
* letra A
Arrays primitivos tem os dados armazenados diretamente nele, armazenados em um bloco contiguo na memoria
Em um array de objetos são armazenados os endereços dos do objeto de forma contigua, mas os objetos estão espalhados na memória
* Letra B
1. Na criação do array o construtor apenas cria o array com todas as posições inicializadas como null, então eh necessario também construir os objetos após o array
2. Verificação de null, sem verificar se um objeto esta null,  o código pode quebrar ao tentar usar getters, a exemplo 