package zad_pomagalo_1_3_14;

public abstract class Distances {
	public static double Evklid(int x1,int x2,int y1,int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	
public static int Manhaten(int x1,int x2,int y1,int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}

public static int Chebish(int x1,int x2,int y1,int y2) {
	return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
}

	
}
