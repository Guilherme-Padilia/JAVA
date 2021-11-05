import java.util.Scanner;


class media
{
    public static void main(String[]arg)
    {
        Scanner tec = new Scanner(System.in);
        float media = 1;
        System.out.println("Escreva sua nota da primeira Prova: ");
        float nota1 = tec.nextFloat();
        System.out.println("Escreva sua nota da segunda Prova: ");
        float nota2 = tec.nextFloat();
        
        if(nota1>10)
        {
            System.out.println("Sua nota está incorreta");
        } else if(nota2>10)
                {
                System.out.println("Sua nota está incorreta");
                } else {
                     media = (nota1 + nota2)/2;
                     System.out.println("Sua média final é: "+media);
                        } if(media >= 6)
                        {
                            System.out.println("Você está aprovado      PARABÉNS!!!!!");
                                }else{
                                    System.out.println("Você está reprovado     VAI ESTUDAR!!!!");    
                                }
}
}