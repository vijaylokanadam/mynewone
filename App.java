package placementcell;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IJob j1=new Opportunity();
		String[]jobs = j1.findJobsByCity("Bangalore");
		for(String j : jobs)
			System.out.println(j);
		
	}

}
