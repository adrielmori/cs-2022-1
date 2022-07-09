# Tarefa 011 - Padrões de Codificação (Leiaute e estilo), Reflexão e Programação defensiva - 08/07/2022

## **Padrões de Codificação**

O estilo padronizado de codificação guia os projetos de software de modo com que atinjam objetivos superiores em critérios de qualidade, reprodutividade, implementação uniforme de projetos de software e fazer com que componentes de software sejam reutilizáveis. Uma padronização de nomes, por exemplo, é um pré-requisito para a implementação uniforme do projeto de software.[SANTOS, 2006]
  
 *Descrição de como utilizar:* Para a utilização efetiva desta prática é muito importante o alinhamento com toda a equipe de produção para com que todos os padrões sejam avaliados e de fato utilizados mutuamente.
 
 *Exemplos aplicados:* Uma das práticas de padronização da codificação mais bem disseminada, utilizada e eficaz se trata da identificação - ato de espaçar/separar os níveis de codificação em linhas vazias, buscando separar componentes da implementação com funções e/ou características diferentes.

> int main(){
>	
>	int x, y, aux;
>	double z, w;
>
>	pritnf(“Adicione um valor inteiro\n”);
>	scanf(“%d”, &x);
>	
>	printf("%d", (x+40));
>
>	return 0;
>}

## **Reflexão**

 Sendo geralmente utilizado para criar dinamicamente uma instância de tipo, associar o tipo a um objeto existente ou obter o tipo de um objeto existente e invocar suas funções ou até mesmo acessar suas propriedades e campos, pois a reflexão é uma API usada para examinar ou modificar o comportamento de métodos, classe e interfaces em tempo de execução.
  
 *Descrição de como utilizar:*Sua utilização é muito útil quando precisa-se acessar atributos nos metadados do seu programa; para eliminar e instanciar tipos em um assembly; para criar novos tipos em tempo de execução; para executar a associação tardia, acessar métodos em tipos criados em tempo de execução.
  
 *Exemplos aplicados:*
>import java.lang.reflect.*;
>     public class DumpMethods {
>      public static void main(String args[])
>      {
>         try {
>            Class c = Class.forName(args[0]);
>            Method m[] = c.getDeclaredMethods();
>            for (int i = 0; i < m.length; i++)
>            System.out.println(m[i].toString());
>         }
>         catch (Throwable e) {
>            System.err.println(e);
>         }
>      }
>   }
[MCCLUSKEY, 1998]

## **Programação defensiva**

A programação defensiva trata-se de uma habilidade/implementação conferida ao código de se proteger de entradas inesperadas, ou seja, cuida dos eventos que não deveriam acontecer, como entrada inválidas, eventos que nunca aconteceriam, erros de outros programadores, interações de acoplamento e força de fonte externas sobre o código.

Em geral, programação defensiva é a criação de código para software de computador projetado para evitar questões problemáticas antes que elas surjam e tornar o produto mais estável, sendo que esta prática depende unicamente de uma combinação de eliminação de código desnecessário, garantindo que quantidades suficientes sejam geradas para lidar com todas as ações possíveis do usuário, como também da aplicação das boas práticas de programação.

  *Descrição de como utilizar:* Para colocar em prática a programação defensiva, é fundamental exercer as boas práticas de programação, que compreende os conceitos de conhecer bem a tecnologia de Construção do Software bom como sua linguagem, possibilitando escolher entre aplicar o simples ou sofisticado em cada caso.  Alocação de recursos conscientes, como objetos e parâmetros.  Fazer bom uso dos recursos alocados.  Liberação dos recursos após o uso.
 
  *Exemplos aplicados:*  Um exemplo aplicado para a programação defensiva é Converter para o valor válido mais próximo. Observando o exemplo abaixo, onde temos um método que calcula o valor total de uma compra em um estabelecimento qualquer. Ele recebe os itens do carrinho e um valor de desconto opcional.



>public class Cart{
>	public IEnumerable<CartItem> Items { get; set; }
>	public double CalculateTotal(double discount) {
>		double total = 0.0d
>
>		foreach (var cartItem in Items) {
>			total += cartItem.Value * cartItem.Quantity;}
>
>		total -= discount;
>
>		total = Math.Max(0.0d, total);
>
>		return total;
>	}
>}

O método Math.Max retorna o maior valor entre 0 e o total calculado. Ou seja, o total calculado será sempre maior ou igual a zero (isso se os requisitos do sistema permitirem que compras resultem em zero). 
  
# Bibliografia
SANTOS, Firmino. Padrões para Codificação (Coding Standards). Disponível em:https://www.angelfire.com/nt2/softwarequality/padrao_codificacao.pdf. Acesso em: 08 de jul. de 2022.

MCCLUSKEY, Glen. Technical Article. Using Java Reflection, 1998. Disponível em: https://www.oracle.com/technical-resources/articles/java/javareflection.html#:~:text=Reflection%20is%20a%20feature%20in,its%20members%20and%20display%20them.. Acesso em: 08 de jul. de 2022.



