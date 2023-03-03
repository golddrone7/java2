package generic;

public class Product<Tv, M> {
	private Tv kind;
	private M model;
	
	public Tv getKind() { return this.kind;}
	public M getModel() {return this.model;}
	
	public void setKind(Tv kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
	
	
}
