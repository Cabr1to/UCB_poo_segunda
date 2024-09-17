import java.util.Scanner;
public class ChamadaTest{

public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     Chamada minhaChamada = new Chamada("Física", "Luis");


     System.out.println("Nome do curso inicial é " + minhaChamada.getNomeCurso()+"\nProfessor: " + minhaChamada.getNomeProfessor());


     System.out.println("Coloque o nome do curso: ");
     String curso = input.nextLine();
     minhaChamada.setNomeCurso(curso); 

     System.out.println("Escolha o professor do curso: ");
     String prof = input.nextLine();
     minhaChamada.setNomeProfessor(prof);
     
     System.out.println(); 
     minhaChamada.mensagem();
     } 
}