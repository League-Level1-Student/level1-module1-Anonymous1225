package _06_vault;

public class Agent {
	int a =0;
	public int findCode(Vault polly) {
		while (!polly.tryCode(a)) {
			a++;
		}
		return a;
	}
}
