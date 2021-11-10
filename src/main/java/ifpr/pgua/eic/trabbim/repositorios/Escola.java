package ifpr.pgua.eic.trabbim.repositorios;

import java.time.LocalDate;
import java.util.ArrayList;

import ifpr.pgua.eic.trabbim.modelos.Aluno;
import ifpr.pgua.eic.trabbim.modelos.Curso;
import ifpr.pgua.eic.trabbim.modelos.Professor;

public class Escola {
    
    private String nome;

    private String telefone;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Curso> cursos;

    public Escola(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void povoa(){
        
    }

    public boolean cadastrarAluno ( String cpf, String nome, String email, String telefone, LocalDate dataMatricula ){
        return false;
    }
    
    public boolean cadastrarProfessor ( String cpf, String nome, String email, String telefone, double salario ){
        return false;
    }
    
    public boolean cadastrarCurso ( int codigo, String nome, String descricao, int cargaHoraria, Professor professor ){
        return false;
    }
    
    public boolean matricularAluno ( Aluno aluno, Curso curso ){
        return false;
    }
    
    public boolean desmatricular ( Aluno aluno, Curso curso ){
        return false;
    }
    
    public ArrayList<Aluno> listarAlunos(){
        return null;
    }
    
    public ArrayList<Professor> listarProfessores (){
        return null;
    }
    
    public ArrayList<Curso> listarCursos(){
        return null;
    }
    
    public ArrayList<Aluno> listarAlunosMatriculados ( Curso curso ){
        return null;
    }
    
    public Aluno buscarAlunoCpf ( String cpf ){
        return null;
    }
    
    public Professor buscarProfessorCpf ( String cpf ){
        return null;
    }
    
    public Curso buscarCurso ( String nome ){
        return null;
    }
}
