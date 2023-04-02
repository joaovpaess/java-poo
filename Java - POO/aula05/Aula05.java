package aula05;

public class Aula05 
{
  public static void main(String[] args) 
  {
    ContaBanco p1 = new ContaBanco();
    p1.setNumConta(1111);
    p1.setDono("Bruce Wayne");
    p1.abrirConta("CP");
    p1.depositar(9999999);
    p1.sacar(150);
    
    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(2222);
    p2.setDono("Peter Parker");
    p2.abrirConta("CC");
    p2.depositar(50);
    p2.sacar(100);
    
    p1.estadoAtual();
    p2.estadoAtual();

  }  
}
