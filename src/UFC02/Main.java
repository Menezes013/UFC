package UFC02;

public class Main {
    public static void main(String[] args) {
        Lutador L[] = new Lutador [5];

        L[0] = new Lutador ("Miguel", "Brasil", 20,
                1.75f, 78.9f, 11, 4, 5 );

        L[1] = new Lutador ("Mauricio", "França", 21, 1.85f,
                 83.5f, 15, 2, 5);

        L[2] = new Lutador ("João", "Estados Unidos", 23, 1.85f,
                 83.3f, 10, 8,6);

        L[3] = new Lutador ("Pedro", "Espanha", 25, 1.84f,
                 86.4f, 15, 8, 8);

        L[4] = new Lutador("Guilherme", "Japão", 28, 1.96f,
                 87.7f, 9, 2, 5);


        Luta UFC03 = new Luta();
        UFC03.marcarLuta(L[1], L[2]);
        UFC03.lutar();
        L[1].status();
        L[2].status();


    }
}