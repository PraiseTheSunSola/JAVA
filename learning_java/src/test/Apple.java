package test;

public class Apple implements Cloneable{

	 private String color;

	    // ������ ����
	    public Apple(String color) {
	        this.color = color;
	    }

	    // Getter
	    public String getColor() {
	        return color;
	    }

	    // clone() �޼��� ����
	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    @Override
	    public String toString() {
	        return "Apple{" +
	                "color='" + color + '\'' +
	                '}';
	    }
	
}
