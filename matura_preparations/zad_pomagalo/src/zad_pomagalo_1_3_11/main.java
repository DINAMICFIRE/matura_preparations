package zad_pomagalo_1_3_11;

public class main {

	public static void main(String[] args) {
		Client client = new Client("Sasho");
		System.out.println(client.getName());
		NameChanger.changeName(client, "Peter");
		System.out.println(client.getName());
	}

}
