
public class TestShape {

	public static void main(String[] args) {
		AreaRect r=new AreaRect();
		r.getDimension();
		System.out.println("\n\n");
		
		AreaSquare s=new AreaSquare();
		s.getDimension();
		System.out.println("\n\n");
		
		DemoAnonymous demo=new DemoAnonymous() {
			
			@Override
			public void getDimension() {
				// TODO Auto-generated method stub
				System.out.println("anonymous class");
			}
		};
		demo.getDimension();
	}
}
