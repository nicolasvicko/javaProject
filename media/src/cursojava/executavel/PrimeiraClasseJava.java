package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe:");
		String pai = JOptionPane.showInputDialog("Nome do Pai:");
		String matricula = JOptionPane.showInputDialog("Data da Matrícula:");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Nome da escola:");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);

		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue());
		}

		System.out.println(aluno1.toString());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

		/* Equals e Hashcode(diferenciar objetos) */

	}

}
