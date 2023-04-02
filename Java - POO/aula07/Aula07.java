package aula07;

public class Aula07 
{
    public static void main(String[] args)
    {
        Lutador l1 = new Lutador("Miguel Diaz", "Estados Unidos", 18, 1.73, 68.4f, 13, 0, 0);
        Lutador l2 = new Lutador("Falcão", "Estados Unidos", 18, 1.73, 70.3f, 10, 3, 0);
        Lutador l3 = new Lutador("Robby Keene", "Estados Unidos", 18, 1.67, 65.2f, 9, 4, 0);
        Lutador l4 = new Lutador("Johnny Lawrence", "Estados Unidos", 54, 1.84, 74.6f, 60, 10, 1);
        Lutador l5 = new Lutador("Daniel Sam", "Estados Unidos", 54, 1.75, 72.1f, 30, 3, 1 );
        Lutador l6 = new Lutador("Chozen Toguchi", "Japão", 55, 1.83, 80.1f, 50, 5, 0);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l6, l5);
        UFC01.lutar();
    }    
}
