package test;

public class Apple implements Cloneable{

	 private String color;

	    // 생성자 정의
	    public Apple(String color) {
	        this.color = color;
	    }

	    // Getter
	    public String getColor() {
	        return color;
	    }

	    // clone() 메서드 구현
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
