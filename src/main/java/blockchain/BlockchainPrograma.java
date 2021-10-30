package blockchain;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockchainPrograma {

	public static void main(String[] args) {

		// Demonstra��o de hash
		String statement = "Hello World!";
		int hashValue = statement.hashCode();
		System.out.println("O c�digo hash �: " + hashValue);

		// Demonstra��o com dois hash
		String[] list1 = { "Maria", "Jo�o", "Paulo" };
		String[] list2 = { "Maria", "Jo�o", "Paulo" };
		int hashCode1 = Arrays.hashCode(list1);
		int hashCode2 = Arrays.hashCode(list2);
		System.out.println("O c�digo hash da lista 1 �: " + hashCode1);
		System.out.println("O c�digo hash da lista 2 �: " + hashCode2);
		System.out.println("-----------------------------------------");

		// Demonstra��o de blocos

		// Bloco 1
		ArrayList<Block> blockChain = new ArrayList<Block>();
		String[] info1 = { "Informa��o de transa��es 1" };
		Block block1 = new Block(info1, 0);
		blockChain.add(block1);
		System.out.println("Bloco 1 �: " + block1.toString());
		System.out.println("-------------------------------------------------");
		System.out.println("Blockchain �: " + blockChain.toString());
		System.out.println("=================================================");

		// Bloco 2
		String[] info2 = { "Informa��o de transa��es 2" };
		Block block2 = new Block(info2, block1.getHashValue());
		blockChain.add(block2);
		System.out.println("Bloco 2 �: " + block2.toString());
		System.out.println("-------------------------------------------------");
		System.out.println("Blockchain �: " + blockChain.toString());
		System.out.println("=================================================");

		// Bloco 3
		String[] info3 = { "Informa��o de transa��es 3" };
		Block block3 = new Block(info3, block2.getHashValue());
		blockChain.add(block3);
		System.out.println("Bloco 3 �: " + block3.toString());
		System.out.println("-------------------------------------------------");
		System.out.println("Blockchain �: " + blockChain.toString());
		System.out.println("=================================================");

	}

}
