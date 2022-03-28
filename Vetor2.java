import java.util.Scanner;
public class Vetor2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=5;
        String funcionario[]=new String[n];
        //valor recebido será sem um a mais ex [10] vao contar de 0 - 9

            for (int index = 0; index < funcionario.length; index++) {
                System.out.println("Digite o nome do funcionário");
                funcionario[index]=sc.next();


            }
          for (int index = 0; index < funcionario.length; index++) {
            System.out.println(funcionario[index]);
            }

        sc.close();

    }
    
}