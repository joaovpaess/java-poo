package exercicio;

public class Principal 
{
    public static void main(String[] args)
    {
       Pessoa p1 = new Pessoa("João Victor", 19, "M");
       Pessoa p2 = new Pessoa("Ana Carolina", 46, "F");

       Livro l1 = new Livro("A marca de Atena", "Rick Riordan", 480, p1);
       Livro l2 = new Livro("O poder do subconsciente", "Joseph Murphy", 283, p2);

       l1.abrir();
       l1.folhear(300);
       l1.avancarPag();
       System.out.println(l1.detalhes());

       l2.abrir();
       l2.folhear(100);
       l2.avancarPag();
       l2.avancarPag();
        l2.avancarPag();
        System.out.println(l2.detalhes());
    }
}    
