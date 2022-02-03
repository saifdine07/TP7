package presentation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = FactureControllerFille.class;
		Author author = (Author) c.getAnnotation(Author.class);
		
		System.out.println(author);

	}

}
