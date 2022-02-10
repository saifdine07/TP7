package presentation;

public class Test {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = FactureController.class;
		Author author = (Author) c.getAnnotation(Author.class);
		
		System.out.println(author);

	}

}
