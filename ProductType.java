
public enum ProductType {

	Apple ("Apple"),
	Orange ("Orange");
	
	private final String name;

	
	private ProductType(String name) {
		this.name = name;
	}


	@Override
    public String toString() {
        return name;
    }
	
}
