public class Driver {

	public static void main(String[] args) {
		Rational z = new Rational(5, 10);
		Rational x = new Rational(8, 9);
		String joemama = new String("licky");

		System.out.println(z.equals(x));
		System.out.println(z.compareTo(x));
		System.out.println(z.equals(joemama));
		System.out.println(z.compareTo(joemama));
}
}
