package blockchain;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockchainPrograma {

	public static void main(String[] args) {

		// Demonstração de hash
		String statement = "Hello World!";
		int hashValue = statement.hashCode();
		System.out.println("O código hash é: " + hashValue);

		// Demonstração com dois hash
		String[] list1 = { "Maria", "João", "Paulo" };
		String[] list2 = { "Maria", "João", "Paulo" };
		int hashCode1 = Arrays.hashCode(list1);
		int hashCode2 = Arrays.hashCode(list2);
		System.out.println("O código hash da lista 1 é: " + hashCode1);
		System.out.println("O código hash da lista 2 é: " + hashCode2);
		System.out.println("-----------------------------------------");

		// Demonstração de blocos

		// Bloco 1
		ArrayList<Block> blockChain = new ArrayList<Block>();
		String[] info1 = { "Informação de transações 1" };
		Block block1 = new Block(info1, 0);
		blockChain.add(block1);
		System.out.println("Bloco 1 é: " + block1.toString());
		System.out.println("-------------------------------------------------");
		System.out.println("Blockchain é: " + blockChain.toString());
		System.out.println("=================================================");

		// Bloco 2
		String[] info2 = { "Informação de transações 2" };
		Block block2 = new Block(info2, block1.getHashValue());
		blockChain.add(block2);
		System.out.println("Bloco 2 é: " + block2.toString());
		System.out.println("-------------------------------------------------");
		System.out.println("Blockchain é: " + blockChain.toString());
		System.out.println("=================================================");

		// Bloco 3
		String[] info3 = { "Informação de transações 3" };
		Block block3 = new Block(info3, block2.getHashValue());
		blockChain.add(block3);
		System.out.println("Bloco 3 é: " + block3.toString());
		System.out.println("-------------------------------------------------");
		System.out.println("Blockchain é: " + blockChain.toString());
		System.out.println("=================================================");

	}

}
