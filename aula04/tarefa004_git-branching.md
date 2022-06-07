### Tarefa 004: Git Branching - 03/06/2021
**1. Qual o nome do branch padrão do Git?**

*A branch principalse chama "main"*

**2. O que o comando **<code>git branch nome</code>** realiza?**

*Nomeia a branch com o nome "nome".*

**3. Como criar um branch a partir de um commit específico?**

*Pode-se criar pelo comando "git branch name commit".*

**4. Em um repositório, qual o efeito do comando <code>git checkout -b bugfix/234</code>?**

*Cria a branch bugfix/234 e atualiza a branch atual para ela.*

**5. Qual o comando para se alternar para um branch de nome experimento2?**

*"git checkout experimento2".*

**6. Em um repositório com dois branches, b1 e b2, onde b1 é o corrente, qual o efeito do comando <code>git branch</code>?**

*Mostrará as branches que estão neste repositório. Na branch b1 estará um * para representar que a branch está nele.*

**7. O que o comando <code>git checkout -b</code> nome faz?**

*Cria uma nova branch nomeada com nome e troca para o mesmo.*

**8. Qual a função do <code> comando git branch -d teste</code>?**

*Deleta o branch com o nome de "teste".*

**9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.**

git branch experimento 

git checkout experimento 

touch arquivo.txt 

git add arquivo.txt 

git commit -m "adicionado arquivo.txt" 

git checkout main 

git merge experimento
