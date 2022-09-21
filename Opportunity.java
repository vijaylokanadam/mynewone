package placementcell;

public class Opportunity implements IJob {

	@Override
	public String[] findJobsBySalary(int salary) {
		return new String[] {"programmer", "designer"};
	}

	@Override
	public String[] findJobsByCity(String city) {
		// TODO Auto-generated method stub
		return new String[] {"dba", "netadmin"};
	}

}
