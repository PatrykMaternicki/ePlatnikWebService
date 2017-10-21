package domain.entity.ContractInfo;

public class Contract {

	private String typeContract;
	private String startTimeContract;
	private String endTimeContract;
	private int freeDay;
	private ContractProperties contractProperties = new ContractProperties();
	private Bonus bonus = new Bonus();
	private Float jobPosition;
	public String getTypeContract() {
		return typeContract;
	}
	public void setTypeContract(String typeContract) {
		this.typeContract = typeContract;
	}
	public String getStartTimeContract() {
		return startTimeContract;
	}
	public void setStartTimeContract(String startTimeContract) {
		this.startTimeContract = startTimeContract;
	}
	public String getEndTimeContract() {
		return endTimeContract;
	}
	public void setEndTimeContract(String endTimeContract) {
		this.endTimeContract = endTimeContract;
	}
	public int getFreeDay() {
		return freeDay;
	}
	public void setFreeDay(int freeDay) {
		this.freeDay = freeDay;
	}
	public ContractProperties getContractProperties() {
		return contractProperties;
	}
	public void setContractProperties(ContractProperties contractProperties) {
		this.contractProperties = contractProperties;
	}
	public Bonus getBonus() {
		return bonus;
	}
	public void setBonus(Bonus bonus) {
		this.bonus = bonus;
	}
	public Float getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(Float jobPosition) {
		this.jobPosition = jobPosition;
	}
	
	
}
