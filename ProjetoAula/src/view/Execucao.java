package view;

import model.Aluno;
import javax.swing.JOptionPane;

public class Execucao {
	public static void main(String[] args) {
		Aluno ps = new Aluno();
		ps.setNome(JOptionPane.showInputDialog(null, "Nome: "	));
		ps.setEnd(JOptionPane.showInputDialog(null, "Endereço: "	));
		ps.setBairro(JOptionPane.showInputDialog(null, "Bairro: "	));
		ps.setCep(JOptionPane.showInputDialog(null, "CEP: "	));
		ps.setCid(JOptionPane.showInputDialog(null, "Cidade: "	));
		ps.setEst(JOptionPane.showInputDialog(null, "Estado: "	));

		System.out.println(ps.getNome());
		System.out.println(ps.getEnd() );
		System.out.println(ps.getBairro());
		System.out.println(ps.getCep());
		System.out.println(ps.getCid());
		System.out.println(ps.getEst());
	}
}