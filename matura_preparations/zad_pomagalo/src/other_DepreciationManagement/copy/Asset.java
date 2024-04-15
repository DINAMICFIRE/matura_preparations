package other_DepreciationManagement.copy;

public class Asset {
	private int assetId ;
	private String name ;
	private double initialCost ;
	private double residualValue ;
	private int usefulLife;
	
	public Asset(int assetId, String name, double initialCost, double residualValue, int usefulLife) {
		super();
		this.assetId = assetId;
		this.name = name;
		this.initialCost = initialCost;
		this.residualValue = residualValue;
		this.usefulLife = usefulLife;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInitialCost() {
		return initialCost;
	}
	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	public double getResidualValue() {
		return residualValue;
	}
	public void setResidualValue(double residualValue) {
		this.residualValue = residualValue;
	}
	public int getUsefulLife() {
		return usefulLife;
	}
	public void setUsefulLife(int usefulLife) {
		this.usefulLife = usefulLife;
	}
	
	public double CalculateDepreciation() {
		return (initialCost - residualValue)/usefulLife;
	}

	@Override
	public String toString() {
		return String.format("AssetID: %d, Name: %s, Initial Cost: %.2f, Residual Value: %.2f, Useful Life: %d"
				,assetId,name,initialCost,residualValue,usefulLife);
	}
	
	

}
