package placementcell;

public interface IJob {
	String[] findJobsBySalary(int salary);
	String[] findJobsByCity(String city);
}
