package blockchain;

import java.util.Arrays;

public class Block {

	private String[] transacao;
	private int hashValue;
	private int hashAnterior;

	public Block(String[] transacao, int hashAnterior) {
		super();
		this.transacao = transacao;
		this.hashAnterior = hashAnterior;
		this.hashValue = Arrays.hashCode(new int[] { Arrays.hashCode(transacao), this.hashAnterior });
	}

	public String[] getTransacao() {
		return transacao;
	}

	public int getHashValue() {
		return hashValue;
	}

	public int getHashAnterior() {
		return hashAnterior;
	}

	@Override
	public String toString() {
		return "Block [transacao=" + Arrays.toString(transacao) + ", hashValue=" + hashValue + ", hashAnterior="
				+ hashAnterior + "]";
	}
}
