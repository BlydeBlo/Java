package sequence;

public class SequenceException extends Exception {

	private static final long serialVersionUID = 1L;

	private String trace;

	public SequenceException(String msg) {
		super(msg);
		this.trace = "\n";
	}

	public void addTrace(String str) {
		this.trace = trace + str + "\n";
	}

	public String toString() {
		return super.toString() + this.trace;
	}

}
