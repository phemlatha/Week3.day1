package Week3.assinhments;

public class SingleInheitance {

	public static class Computer {
		public void computerModel() {
			System.out.println("im model of computer");
		}
	}

	public static class Desktop extends Computer {
		public void desktopSize() {
			System.out.println("im Desktop size");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop dObj = new Desktop();
		dObj.computerModel();
		dObj.desktopSize();

	}

}
