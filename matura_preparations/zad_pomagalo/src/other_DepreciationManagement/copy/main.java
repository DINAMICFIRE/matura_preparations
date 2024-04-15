package other_DepreciationManagement.copy;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DepreciationCalculator calc = new DepreciationCalculator();
		System.out.print("How many products are you calculation:");
		int n = Integer.parseInt(scan.nextLine());
		if(n < 3 && n > 10000) {
			return;
		}
		//1 Laptop 2000 500 5
		
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("\\s+");
			int id = Integer.parseInt(input[0]);
			String name = input[1];
			double initialCost  = Double.parseDouble(input[2]);
			double residualValue = Double.parseDouble(input[3]);
			int usefulLife =  Integer.parseInt(input[4]);
			
			Asset asset = new Asset(id,name,initialCost,residualValue,usefulLife);
			calc.AddAsset(asset);
		}
		calc.DisplayDepreciationInfo();
	}

}
