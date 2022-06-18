### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


**1. Qual o comando para obter a versão instalada do Git?**
*git --version*
**2. Qual o efeito da execução de cada um dos comandos abaixo?**
  **a. git help:** *Mostrar os comando Git que são usados com mais frequência.*

  **b. git help checkout:** *Descreve como funciona o comando checkout, com opções e exemplificações.*

  **c. git help merge:** *Descreve o funcionamento do comando merge, junto com opções e exemplos.*

  **d. git init:** *Cria um repositório vazio.*

  **e. git add --all:** *Adiciona uma lista com todos novos arquivos dentro do repositósio, sejam adicionados ou removidos.*

  **f. git add -u:** *Adiciona apenas os arquivos modificados e removidos; Ignora arquivos novos que foram criados.*

  **g. git config -l:** *Lista todas as variáveis definidas no arquivo de configuração.*

  **h. git mv a.txt b.txt:** *Comando para renomear arquivos aonde, neste caso, o arquivo "a.txt" está sendo renomeado para "b.txf".*

  **i. git reset --hard:** *Comando que redefine o HEAD atual para o estado especificado excluindo todas as alterações recentes que ocasionalmente foram comitadas ou não.*

  **j. git log -27:** *Este comando mostra uma lista com os últimos 27 commits feitos.*

**3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?**
*"git add ." e "git commit -m "New commit".*

**4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?**
*"git diff".*

**5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?**
*"git status".*

**6. Qual o comando para efetuar um _commit_?**
*git commit*

**7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?**
*"git restore test.txt".*

**8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.**
*Adicionando o nome do diretório em questão para ".gitignore".*

**9. O que acontece se o seu repositório local for acidentalmente removido?**
*Pode-se clona-lo este repositório excluido caso esteja disponível em outra plataforma.*

**10. Como clonar um repositório remoto?**
*"git clone".*

**11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?**
*"git log --pretty=oneline".*

**12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?**
*".gitconfig".*

**13. Qual o comando para criar um repositório local?**
*"git init".*

**14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?**
*.git*

**15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)**
*git add -u*

**16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?**
*A sigla "SHA'' significa secure hash algorithm (algoritmo de hash seguro). o SHA1 embaralha determinado arquivo, imagem ou texto para que seja gerado um conjunto de caracteres identificadores, funcionando como uma criptografia utilizando o método hash. Esta resolutiva garante maior segunça para o que esta sendo transmitido pelo git.*

**17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?**
*HEAD.*

**18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?**
*Não.*

**19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório? git reset --soft HEAD~1 git reset --hard**
*git reset --soft HEAD~1 irá mudar o HEAD para o commit determidodo e todos os arquivos modificados vão ficar em estado de serem comitados. git reset --hard descartará todos as mudanças até o commit indicado.*

**20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?**
*"git clean -fd".*

**21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?**
*".gitignore".*

**22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?**
*Adicionar o .class em ".gitignore".*

**23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.**

**24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando git shortlog -sne?**
* Mostra uma lista com os nomes de quem já fez commit e quantos commits foram efetuados, sendo ordenados em ordem descrescente de commits.*

**25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?**
*Indica o endereço do repositório remoto.*

**26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?**
*git tag*

**27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?**
*"git tag -l "2.0"."*

**28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?**
*Cria a tag **3.4-gold** adicionado com a descrição "minha versão gold".*

**29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?**
*Listar todos os dados da tag.*

**30. O que o comando **git push origin 3.4-gold** teria como efeito?**
*O repositório remoto como o repositório local iria atualizar para a tag 3.4-gold.*

**31. Após executar um commit, qual o efeito de **git commit --amend**?**
*Adiciona as últimas alterações realizado no último commit feito.*

**32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?**
*Os dados que foram adicionado e modificado no arquivo não será comitados.*

**33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?**
*Como já foi realizado o commit anteriormente, o comando não terá efeito algum.*

**34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?**
*git reset HEAD a.txt reseta o arquivo de taxto a.txt para o HEAD, e git checkout -- a.txt restaura o arquivo.*

**35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.**
*De forma breve, o comando comara o HEAD com commits anteriores feitos em relação a ele.*
