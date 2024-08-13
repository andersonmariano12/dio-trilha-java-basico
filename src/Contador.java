import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Contador {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Informe o primeiro Parametro.");
        int primeiroParametro = sca.nextInt();

        System.out.println("Informe o segundo Parametro");
        int segundoParametro = sca.nextInt();
        

        try{

            contar(primeiroParametro,segundoParametro);
            
        }catch(ParametrosInvalidosException e){

            System.out.println("O segundo Parametro não pode ser maior que o primeiro Parametro.");

        }

    }

    private static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        if (segundoParametro < primeiroParametro){
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoParametro - primeiroParametro;

        for (int i=1;i<=contagem;i++){

            System.out.println("Imprimindo o numero: "+i);

        }

    }
}