Me desafiei a criar um pequeno jogo da velha. No meu primeiro semestre cursando Analise e Desenvolvimento de Sistemas, tive uma cadeira de Logica de Programação e uma das linguagens
para o aprendizado era JAVA. Como ja tinha uma certa noção com logica de programação eu resolvi fazer este pequeno desafio logo no primeiro dia de aula.
A ideia era desenvolver um jogo da velha onde duas pessoas podiam jogar através do console e eu não queria pesquisar nada relacionado a ajuda em nenhum momento. A unica pesquisa que eu fiz
foi sobre a documentaçao do JAVA e como utilizar a sintaxe.

O codigo em si:
Eu sou iniciante, então com certeza existem outros projetos melhores ou com menos linhas de codigos ou bem estruturados. Mas a satisfação de criar algo com as proprias mãos é melhor.
tem sim como melhorar e penso em dar uma refatorada no futuro, mas JAVA ainda não é meu foco então não vou transformar em um objetivo curto.

O projeto:
Eu utilizei um vetor para definir a posição de cada elemento na estrutura do jogo.
no começo eu ia utilizar um vetor com dados em booleanos para verificar se foram preenchidos ou não,
mas decidi fazer com caracteres mesmo. O vetor é iniciado com um loop que define um conteudo '' vazio para cada posiçao.
Há certas variaveis "global" iniciadas e eu utilizei scanners para obter a resposta. A logica para o jogo iniciar e não parar é com um loop WHILE,
onde se for 1 ele continua, caso 0 ele para(tambem pode ser uma logica booleana).

A partida:
Quando o jogador digita o numero para começar a variavel contJogo recebe 1 e o loop inicia, começando o jogo. cada linha é impressa com a respectiva posiçao do vetor que foi iniciado como uma string ''.
A logica para alternar entre os jogadores é com um booleano vezX, onde ela esta iniciada como TRUE, logo a primeira jogada é do X, depois que o movimento é confirmado é alternado para FALSE e a vez do O inicia.

Da escolha:
Quando na vez X ou O, o jogador tera de escolher um numero de 0 a 9, que representa cada posiçao no "tabuleiro", há certas validaçoes para caso a resposta seja menor, maior ou diferente do esperado o jogo é finalizado, se a posiçao correta é decrementado em X-- para que se possa fazer uma comparaçao com o array, se a posição nao estiver vazia a posição é preenchida com uma string 'X' ou 'O'.
Se a posição já esta preenchida então será feito a pergunta para que o jogador responda novamente escolhendo outra posição. Após escolher há uma pergunta de confirmação ou de sair do jogo e por fim alterna o valor vezX.

Da vitoria:
A cada jogada é feita uma verificaçao de todas as possiveis vitorias, e se caso uma linha preenchida o jogo é imediatamente finalizado indicando o vencedor. Se por acaso todas as posiçoes forem preenchidas e não houver um vencedor ocasionando um empate, o jogo tambem será encerrado com uma mensagem de empate.

Resumo:
Novamente eu sei que é uma logica e sintaxe bem simples e há como adicionar mais funções e eliminar linhas, mas levando em conta que JAVA não é o meu foco e esta foi a segunda vez que eu entrei em contato com ela eu estou bem feliz e posso reaproveitar essa logica com outras linguagens e ir aperfeiçoando ela, novamente o processo de criar é a melhor parte.
