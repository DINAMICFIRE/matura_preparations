package zad_pomagalo_1_3_15;

import zad_pomagalo_1_3_14.Distances;

public class main {

	public static void main(String[] args) {
		double evkl  = Distances.Evklid(1, 1, 1, 1);
		int manh = Distances.Manhaten(2, 2, 2, 2);
		int chebi = Distances.Chebish(3, 3, 3, 3);
		System.out.println(evkl);
		System.out.println(manh);
		System.out.println(chebi);
	}

}
