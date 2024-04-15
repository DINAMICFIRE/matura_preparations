package other_DepreciationManagement.copy;

import java.util.ArrayList;
import java.util.List;

public class DepreciationCalculator {
	private List<Asset> assets;

	public DepreciationCalculator() {
		assets = new ArrayList<>();
	}

	public void AddAsset(Asset asset) {
		assets.add(asset);
	}
	public void DisplayDepreciationInfo() {
		for (Asset asset : assets) {
			System.out.println(asset);
			for (int i = 1; i <= asset.getUsefulLife(); i++) {
				System.out.printf("Year %d: Accumulated Depreciation: %.2f%n",i,i*asset.CalculateDepreciation());
			}
			System.out.printf("Depreciation: %.2f per year%n",asset.CalculateDepreciation());
		}
		
	}

}
