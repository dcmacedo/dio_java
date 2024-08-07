import list.OperacoesBasicas.ListaTarefa;
import list.Ordenacao.OrdenacaoPessoa;
import list.Pesquisa.CatalogoLivros;
import set.OperacoesBasicas.ConjuntoConvidados;
import set.Pesquisa.AgendaContatos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1",2020);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2",2021);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2",2022);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3",2023);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4",1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20,1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30,1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25,1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17,1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4",1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
        */

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Danilo", 123456);
        agendaContatos.adicionarContato("Danilo", 0);
        agendaContatos.adicionarContato("Danilo Macedo", 111111);
        agendaContatos.adicionarContato("Danilo Cotrim Macedo", 222222);
        agendaContatos.adicionarContato("Isabeli", 7891011);
        agendaContatos.adicionarContato("Sirlene", 123456);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Isabeli"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Danilo", 456789));

        agendaContatos.exibirContatos();
    }
}