package validaraprovacao;
/**Importando o pacote Scanner para dentro do programa**/
import java.util.Scanner;

/**
 *
 * @author Hygor
 */
public class ValidarAprovacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**Linha com o título do programa para o usuário**/
    System.out.println(" ### Sistema para verificar aprovação na materia de Java ### ");
    
    /**Capturando a nota do usuário**/
    Scanner scanner = new Scanner (System.in);
    System.out.println("Informe a sua nota: ");
    int nota = scanner.nextInt(); /** scanner.nextInt() é utilizado para capturar número. **/
          
     /** IF ELSE para validar a nota do aluno**/
    if (nota >=7){
    System.out.println("Parabéns você foi aprovado na materia do Jarbas!!");
    
    } else if (nota>5){
    System.out.println("Você está de recuperação. Faça uma nova prova.");
    
    } else{
    System.out.println("Você está reprovado.");
    }
        }
 
    }