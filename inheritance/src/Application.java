public class Application {

	public static void main(String[] args) {
		Invoice tv = new Invoice();
		tv.setRatePerUnit(20000.00);
		tv.setInvoiceNumber(101);
		tv.setQuantity(9);
		System.out.println(tv);
	}

}
