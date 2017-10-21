package domain.entity.ContractInfo;

public class Bonus {
	private String typeBonus;
	private float value;
	private float percentBonus;
	private String itemBonus;
	public String getTypeBonus() {
		return typeBonus;
	}
	public void setTypeBonus(String typeBonus) {
		this.typeBonus = typeBonus;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public float getPercentBonus() {
		return percentBonus;
	}
	public void setPercentBonus(float percentBonus) {
		this.percentBonus = percentBonus;
	}
	public String getItemBonus() {
		return itemBonus;
	}
	public void setItemBonus(String itemBonus) {
		this.itemBonus = itemBonus;
	}
	
}
