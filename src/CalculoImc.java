import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
     // entrada 
     Scanner scanner = new Scanner(System.in);

     // 1-pedir para o usuario o seu peso
     System.out.println("Informe seu peso em quilogramas: ");
     double peso = scanner.nextDouble();
     
     // 2- pedir para o usuario informar a altura em metros
     System.out.println("informar a altura: ");
     double altura = scanner.nextDouble();

     // PROCESSAMENTO
     // 3- calcule o icm
     double icm = peso / (altura * altura);

     //SAIDA
     // 4- imprime o resultado do ICM
     System.out.println("seu ICM é: "+icm);
    
     scanner.close();
    }
    
}
