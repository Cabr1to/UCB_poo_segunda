public class Chamada {
    private String nomeCurso;
    private String nomeProfessor;

    public Chamada(String nome, String nomeP) {
        nomeCurso = nome;
        nomeProfessor = nomeP;
    }

    public void setNomeProfessor(String nomeP) {
        nomeProfessor = nomeP;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }


    public void setNomeCurso(String nome){
        nomeCurso = nome; 
    }

    public String getNomeCurso(){
        return nomeCurso;
    }

    public void mensagem(){
        System.out.println("Bem vindo à Chamada do curso de " + getNomeCurso() + " com o Professor " + getNomeProfessor());
    }
}
