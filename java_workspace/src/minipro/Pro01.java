package minipro;

public class Pro01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Pokemon_List {
	void 이상해씨(){
		System.out.println("\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠃⠀⡸⠁⢰⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠉⠁⠀⠀⠀⠀⠁⠀⠀⠀⠀⠠⠔⠊⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⢀⡠⠖⠒⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⠟⠛⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⣀⠤⠯⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠑⠊⠁⠀⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⡿⢿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⡠⠂⠀⠀⠀⠀⢀⡠⣴⣶⣾⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⣀⣠⣴⣿⣿⣿⣿⣷⠀⢻⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠺⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⣤⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⢻⣿⣿⣿\n"
				+ "⣿⣿⣿⡿⢁⠠⠀⠀⢀⣴⡆⠀⠈⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⢸⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠀⠀⢿⣿⣿\n"
				+ "⣿⣿⣿⠣⠁⠾⡇⠀⠀⠛⠀⠀⠀⣠⣤⠀⠀⠀⡔⠀⢀⠔⠱⠛⣿⣦⠀⠀⠀⠀⠈⡇⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣸⣤⣿⡼⣿⣿\n"
				+ "⣿⣿⡏⠃⢸⡀⠃⠀⠀⠀⠀⠠⣾⣿⡟⠀⠀⠐⠀⢠⠂⠀⡇⠀⠀⢿⣇⠀⠀⠀⠀⣇⠀⣠⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣿⣿\n"
				+ "⣿⣿⠐⠀⠸⠇⡄⠀⠀⠀⠀⠀⠈⠙⠃⠀⠀⠀⠀⡆⠀⠀⣿⣇⠀⣾⣿⠀⠀⠀⠀⠸⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⠀⠀⠸⠤⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⢟⢁⣀⣀⠼⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⡻⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣞⠢⣄⡀⠀⠠⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠉⠁⠀⣀⡠⠂⠀⠀⠀⠀⠀⠀⠀⠘⠻⠿⠿⠟⠁⠈⢻⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣷⣤⡈⠳⣶⡤⠤⢀⣀⣀⣀⣀⡠⠤⠤⠤⠤⠤⠔⣲⠺⠋⠁⠀⠀⢀⡔⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣷⡤⣉⠒⠤⣀⡀⠀⠀⠀⠀⠀⣀⡠⠔⠊⠀⠀⠀⢀⡠⠔⠁⠀⠀⠀⠀⠀⠀⢰⠀⡔⠀⢀⣀⠀⠀⠀⠹⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⡇⠀⠉⠒⠢⠬⢍⣉⣉⣉⣉⣀⣠⣤⠤⣴⣶⠋⣧⠂⠀⢀⣤⡄⠀⠀⠀⠀⢸⠎⣠⣾⣿⣿⡇⠀⠀⠀⢿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣧⢀⠴⠚⣷⠀⠀⠀⠷⣊⠀⠀⠾⣿⣿⠿⠿⢠⢃⡠⢤⠘⠿⠇⠀⠀⠀⠀⡎⠀⢻⣿⣿⣿⡇⠀⠀⠀⢸⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⣿⣿⠂⠀⠀⠀⠈⠙⣶⣤⣤⣀⣠⣾⣿⠁⢀⡺⠀⠀⠀⠀⠀⠀⣰⠀⠀⠀⠙⠿⠟⠃⠀⠀⠀⣾⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⠁⠀⠀⠀⠀⢀⣾⣿⣿⣿⣮⣟⣹⣿⣶⣿⠃⠀⠀⠀⠀⠀⣼⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡔⢤⢀⢤⠀⣠⣾⣿⣿⣿⣿⣿⣾⡏⠉⠉⠁⠀⠀⠀⠀⣠⣾⣿⣿⣿⡤⢀⢀⢀⠀⣀⠀⣠⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣥⣦⡊⣱⣔⣰⣤⣾⣿⣿⣿⣿⣿⣷⣿⣷⣾⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.001 | 이름:이상해씨 | 타입:풀,독 | 능력치[공격력:118, 방어력:111, 체력:128, 포획확률:20%]");
System.out.println("사용스킬[1.덩쿨채찍 2.몸통박치기 3.오물폭탄 4.씨폭탄 5.파워휩]");
System.out.println("-------------------------------------------------------------");
	}
	
	void 마릴(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠒⠁⠁⠀⠀⠀⠁⠀⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⣀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⢀⣀⣤⣤⣤⣀⠀⠐⡀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠖⠉⢉⣩⣷⣦⣄⠀⠀⠀\n"
				+ "⠀⠀⠄⠊⠀⠉⠈⠉⠉⠒⢄⠀⠀⠀⠀⠀⠀⡀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣷⡀⢰⠀⠀⠀⠀⠀⠀⠀⢰⣧⣴⣾⣿⣿⣿⣿⣿⣷⡀⠀\n"
				+ "⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡄⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡜⠀⠀⠀⠤⢀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀\n"
				+ "⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣷⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠅⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀\n"
				+ "⣧⣄⣀⠀⠀⠀⠀⣀⣠⣴⣾⣿⡟⠀⠀⠀⠀⢡⡀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⡏⠀\n"
				+ "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠙⢲⣙⣿⣿⣿⣿⣿⡿⠿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⡿⠀⠀\n"
				+ "⠀⠈⠻⢿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠐⠁⠀⠉⠉⠁⠉⠁⠀⠀⠀⢀⠤⢀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠸⡿⠿⠛⠋⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⢿⣉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣀⣼⡇⠀⠀⠀⠀⠀⠀⣾⣄⣿⠀⠦⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⢀⣟⣠⡄⠀⠀⠀⠀⠀⠀⠀⠀⡘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⠿⠟⠁⠀⠀⠀⢠⠄⠀⠘⠿⠟⠀⢀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠈⠉⣹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠃⠤⠉⠑⢤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠛⣲⣶⡖⠉⠀⠀⠀⣠⣿⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⣿⠇⢀⠀⠀⠀⠀⠀⠀⠀⡀⣶⡀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠆⡴⠛⠀⠀⢀⣤⣾⣿⣿⣄⣀⣄⡠⠤⣄\n"
				+ "⠀⠀⠀⠀⠀⢠⣿⣾⠿⣦⠀⠀⠀⣄⡀⠀⢿⣿⣷⣤⣤⣤⣒⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠿⢿⣿⣿⣿⣿⣿⣷⣾⡿\n"
				+ "⠀⠀⠀⠀⠀⠀⠛⠁⠀⠹⣧⡀⣸⡟⠛⢿⣿⣿⣿⣿⣿⡿⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡹⠁⠙⠛⠻⠟⠛⠁\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣷⡿⠁⠀⠀⠈⠻⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠁⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠁⠀⠀⠀⠀⠀⠈⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⡶⠄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠄⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠿⢿⣿⠇⠀⠀⠀⠈⠀⠀⠐⠀⠀⠀⠂⠰⣾⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢃⠀⢀⡽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.183 | 이름:마릴 | 타입:물,페어리 | 능력치[공격력:37, 방어력:93, 체력:172, 포획확률:50%]");
System.out.println("사용스킬[1.몸통박치기 2.거품 3.거품광선 4.아쿠아테일 5.누르기]");
System.out.println("-------------------------------------------------------------");
	}
	
	void 파이리(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⢀⠄⠖⠊⠁⠀⠀⠀⠉⠐⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⣤⡴⢶⣦⡀⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⡗⠄⠀⠀⠀⠀⠀⠰⢿⠀⣸⣿⣿⡄⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⣧⣷⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⠟⠀⠀⢡⠀⠀⠀⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣤⣄⠀⠀⠀\n"
				+ "⠀⠀⠀⢹⣿⠀⠀⠀⠀⠀⠀⠀⠿⠿⠟⠁⠀⠀⠀⠘⣄⠀⠐⠁⠘⢲⡂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣷⠀⠀\n"
				+ "⠀⠀⢀⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣦⠀⠀⠀⣠⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠏⠋⠉⣿⣿⡆⠀\n"
				+ "⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡇⠀⠀⠀⠀⠀⠈⢷⡄⣠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀\n"
				+ "⠀⠀⠀⠑⢤⣦⠀⣴⠖⠀⣀⣠⣴⣿⣿⠆⠀⠀⠀⠀⠀⠀⠈⠻⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠁⠀\n"
				+ "⠀⠀⠀⠀⠀⠉⠲⣶⣶⣿⣿⠿⠛⠛⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠙⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣦⣾⡏⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⣀⠤⠶⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢀⠋⠉⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⣫⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡘⢸⡀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠐⠃⢿⠀⠀⠀⠀⢀⣠⣴⣶⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠆⣿⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠋⢀⠏⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⢠⣞⠂⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⢦⣀⣸⡀⠀⠀⠀⠀⠀⠀⢀⠴⠊⠀⣠⣏⠎⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠆⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠤⠤⠤⠀⠐⠈⠀⠀⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣾⠟⠑⠁⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡌⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣶⣦⣤⣤⣄⣀⣀⣀⣀⣠⣤⣤⣶⣾⡿⠟⡋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⠻⠿⠿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠋⠡⠐⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣢⣄⣀⣤⣾⣿⣿⣿⠋⠀⠀⠀⠀⠀⣰⣶⣶⣶⣶⣶⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠠⠊⠉⣹⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠙⠛⠛⠛⠛⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.004 | 이름:파이리 | 타입:불꽃 | 능력치[공격력:116, 방어력:93, 체력:118, 포획확률:20%]");
System.out.println("사용스킬[1.불꽃세례 2.할퀴기 3.니트로차지 4.불꽃튀기기 5.화염방사]");
System.out.println("-------------------------------------------------------------");
	}
	
	void 메타몽(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠤⠊⠉⠉⠉⠂⠤⣀⣀⣀⡀⠠⠤⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠤⠤⢄⣀⣀⣀⠠⠐⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⡀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠈⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠫⠖⣂⡠⠤⢤⣀⠤⣤⠀⠀⠀⠀⠀⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⢀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠒⠤⡀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⡈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠁⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⣠⠚⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡀⠀⠀⠀⠀⠀\n"
				+ "⠀⢀⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣄⠀⠀⠀⠀\n"
				+ "⢀⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⡀⠀⠀\n"
				+ "⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢄⠀\n"
				+ "⢃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠆\n"
				+ "⠈⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸\n"
				+ "⠀⠀⠈⠓⠦⠤⠄⠤⠤⠤⢄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⠦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡤⠤⠤⠤⠤⠤⠤⠤⣀⣀⣀⠤⠊⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠒⠤⠤⣀⣀⣀⣀⣀⡀⠤⠤⠔⠒⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.132 | 이름:메타몽 | 타입:노말 | 능력치[공격력:91, 방어력:91, 체력:134, 포획확률:20%]");
System.out.println("사용스킬[1.변신 2.발버둥]");
System.out.println("-------------------------------------------------------------");
	}
	
	void 치코리타(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣷⣶⣦⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠋⠉⠉⠉⠉⠛⢿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⢀⣤⡴⠶⠛⠛⠛⠛⠿⠿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⢠⠾⠋⠀⢀⣤⣤⣤⡀⠀⠀⠀⠀⠉⠛⢦⡀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⡴⠋⠀⠀⣰⣿⢟⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⢀⡞⠁⠀⠀⢀⣿⣿⣼⣿⡟⣿⠀⠀⠀⠀⠀⠀⢠⣶⣿⡄⠀⠀⠀⠀⠀\n"
				+ "⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⣼⠃⠀⠀⠀⣸⣿⣿⣿⣿⢳⡏⠀⠀⠀⠀⠀⠀⣿⣿⣿⣇⠀⠀⠀⠀⠀\n"
				+ "⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⣸⠇⠀⠀⠀⠀⠛⠛⠿⠿⢿⡾⠁⠀⠀⠀⠀⠀⢸⣿⣾⣿⣿⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⢠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⣤⣀⣀⠀⠀⢸⣿⣿⣿⡟⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣷⡾⠿⠻⢟⡇⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀\n"
				+ "⢻⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⣴⣶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⠟⠁⠀⠀⠀⢠⣧⣤⣤⣤⣤⣤⣤\n"
				+ "⠸⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⠈⢿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠋⠁⠀⠀⠀⠀⠀⣾⠁⠀⠀⠀⢸⢀⡞\n"
				+ "⠀⢻⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀⠉⠁⠀⣴⣶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡆⠀⠀⣀⣼⡞⠀\n"
				+ "⠀⠈⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠏⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡿⠃⠀⠀⣴⣾⣶⡄⠀⠀⣴⣿⣷⣄⣿⣿⣵⣶⣿⡿⠋⠀⠀\n"
				+ "⠀⠀⠈⢿⣿⡇⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⠏⠀⠀⠙⠻⠟⢻⣿⣿⣿⣿⠟⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠹⣿⠀⠀⠀⠀⢀⣴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⡿⠟⠁⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣴⠶⠶⢶⣤⣀⠀⠀⠀⠀⠀⠀⠀⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠁⠀⠀⠀⠀⠈⠙⢷⣄⠀⣀⣤⡀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢸⢃⣠⡦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣋⠀⡇⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⣠⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡏⢳⡇⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣷⣶⣶⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⡀⠀⠀⠀⠀⢸⡇⣸⠁⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣶⣿⣿⣿⣿⣿⣷⣦⣄⡀⢈⣠⡏⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⣰⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠻⠿⠿⠿⠼⠇⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠛⠻⠿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.152 | 이름:치코리타 | 타입:풀 | 능력치[공격력:92, 방어력:122, 체력:128, 포획확률:20%]");
System.out.println("사용스킬[1.덩쿨채찍 2.몸통박치기 3.에너지볼 4.풀묶기 5.누르기]");
System.out.println("-------------------------------------------------------------");
	}
	
	void 토게피(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠖⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠀⠀⠀⠀⠀⠀⡴⠁⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⣰⠒⠦⣀⠀⠀⠀⣾⠀⠉⠙⠲⢄⣀⣀⡼⠁⠀⠀⠀⠀⠘⣤⣀⠀⠀⠀⢀⡤⠖⠺⡆⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠈⠑⠦⣀⣿⠀⠀⣠⠴⠛⢉⡾⠁⠀⠀⠀⠀⠀⠀⠸⣎⠙⠲⣞⠁⠀⠀⠀⣇⣠⠤⠖⠛⠉⠉⣿⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠈⠙⠶⣾⣁⡀⢀⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠹⣆⠀⢈⣳⣤⠶⠛⠉⠀⠀⠀⠀⠀⣰⠇⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠈⠙⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⣾⢻⠀⠀⠀⠀⣿⢳⡀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢸⣿⡿⠀⠀⠀⠀⢻⣿⡇⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡇⠀⠀⢀⣠⠤⣄⠀⠀⠈⠓⠉⢠⣄⢈⣭⡀⣀⣍⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⡰⠙⢿⣄⣠⠴⠋⠀⠀⠈⠳⣄⠀⢀⡴⠃⠈⠋⠀⠙⠉⠘⣦⠀⠀⣀⡴⠛⢦⣄⠀⠀⠈⢧⢀⡀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⡰⠁⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠈⠳⠟⠁⠀⠀⠀⠀⠀⠀⠀⠈⢷⠞⠋⠀⣠⣶⣿⣷⣤⣀⡼⠋⠹⡄⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⢀⣀⣠⣃⠀⠀⠀⢀⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠛⢻⣿⣿⠀⠀⠀⢱⠀⠀⣀⣀⠀\n"
				+ "⠀⣴⠚⠉⠉⠁⠀⠉⣧⠀⠀⠺⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣶⣿⣿⣿⠀⢀⡤⠞⠋⠉⠉⣹⠀\n"
				+ "⠀⠈⠳⣄⡀⠀⠀⢀⡿⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣷⣶⣤⣀⠀⠀⠀⠀⠀⠸⠿⠿⠿⠛⠋⠁⠀⣾⠀⠀⠀⠀⣼⠃⠀\n"
				+ "⠀⠀⠀⠈⠙⠳⣶⠾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⠉⠙⠻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⢀⡾⠁⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣧⡀⢀⣾⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⢿⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⢹⠁⢀⣼⣿⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠘⣇⣾⣿⣿⡿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⡇⠈⢻⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣴⣶⣦⠀⠀⢀⡞⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⡇⠀⠀⢻⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣶⣿⣿⣿⡿⣿⣿⡟⠀⢀⡞⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⡇⠀⠀⣸⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣟⠉⠀⣠⣿⡿⠁⢠⠞⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⡿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣿⣿⣿⣿⡿⠁⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣏⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠋⡠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠞⠛⠻⢷⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⠴⠛⠓⠦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⣀⣤⠀⠀⠀⠈⠉⠙⠛⠶⢶⡦⠤⠤⠤⠤⢤⡶⠶⠶⠛⠉⠀⠀⠀⠀⢀⣀⠉⠳⣄⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⢤⣞⣉⣀⣀⣀⣀⣠⣤⠤⠶⠞⠋⠁⠀⠀⠀⠀⠀⠙⠲⠦⣤⣄⣀⣀⣀⠀⠀⠙⠳⣆⡼⠂⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.175 | 이름:토게피 | 타입:페어리 | 능력치[공격력:67, 방어력:116, 체력:111, 포획확률:0%]");
System.out.println("사용스킬[1.잠재파워 2.쪼기 3.원시의힘 4.사이코쇼크 5.매지컬샤인]");
System.out.println("-------------------------------------------------------------");
	}
	
	void 우파(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠠⠤⠤⠤⠄⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠖⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠢⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢲⣄⠀⠀⠀⠀⢀⠔⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⣄⠀⠀⠀⠀⢀⢶⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠶⡀⠀⠈⢶⡄⠀⠀⢠⠇⠀⠀⠀⠀⠀⣾⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⣦⠀⠘⢆⠀⠀⠀⢰⡎⠀⢀⡄⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⢸⡵⡀⠀⠘⣚⡄⠀⠎⠀⠀⠀⠀⠀⡀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠁⢀⡀⠈⡄⠀⠀⣶⠁⠀⣼⠇⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⢀⣤⣴⣗⣱⣂⣐⣟⣈⣺⣻⣛⡀⠀⠀⠀⠉⠛⠶⠶⠶⢤⣤⣤⣤⣤⣤⡤⠶⠶⠞⠋⠀⠀⣷⣀⡘⣹⣶⣜⣻⣀⣠⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⢠⣿⠏⠀⠀⣿⡿⢹⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠋⠁⠈⣿⡄⠘⣿⡄⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⣼⠏⠀⠀⢸⡿⠁⠀⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠏⠀⠀⠀⠹⣷⠀⢹⣷⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⠁⠀⠀⠈⢇⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⣠⠖⠁⠀⠀⠀⠀⠀⢻⡇⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⠀⠂⠠⢄⠀⠈⠻⠶⣦⣤⣤⣀⣀⠀⠀⠀⠀⢀⣀⣠⠤⠰⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢰⠁⠀⠀⠀⠀⠀⠱⡀⠀⠀⠀⠉⠛⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⡿⠟⠛⣿⣿⣭⣶⠜⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠘⣄⠀⠀⠀⠀⠀⠀⢓⡀⠀⠀⡰⠁⠀⣀⣬⣉⢉⢉⣀⡈⢢⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠣⡀⠀⠀⠀⢀⣬⣦⠀⢠⠁⠀⠀⠙⢿⣿⣿⡿⠟⠁⠀⠳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⢴⣠⣿⣿⣿⣷⣼⠀⠀⠀⣾⣶⣤⣤⣤⣴⣿⠃⠸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⠿⢧⡀⠀⠀⠉⠛⠛⠋⠉⠀⣀⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⠾⠛⠳⣤⡤⠀⠀⠀⣤⣤⣾⡿⠒⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⣠⠞⠀⠀⠀⠀⠘⠻⣿⡀⠀⢀⡘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠒⠒⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.194 | 이름:우파 | 타입:물,땅 | 능력치[공격력:75, 방어력:66, 체력:146, 포획확률:40%]");
System.out.println("사용스킬[1.물대포 2.머드숏 3.진흙폭탄 4.구멍파기 5.누르기]");
System.out.println("-------------------------------------------------------------");
	}
	
	
	void 모래두지(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⣶⠒⠒⠢⠤⣤⣔⣲⣋⡉⣉⣉⣑⠒⠤⣄⣀⣀⡤⠤⠤⢤⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⣿⣷⠀⣤⠖⠉⠈⠀⠀⠀⠀⠈⠙⣻⠶⢬⡁⠀⢀⣴⠾⠛⣽⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⢻⣿⠋⡈⠀⠀⠀⠀⠀⠀⠀⢀⡴⠃⠀⠀⠙⠳⣿⣦⠀⢰⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⢸⠃⠀⡇⠀⢀⣀⣀⣀⣀⣀⡟⠁⠀⠀⠀⠀⠀⣼⣿⣦⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⡎⠀⠠⠓⠉⠉⡏⠀⠐⠀⠉⠙⠶⣤⣀⣤⣄⣠⣿⣿⣿⣿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⢀⠏⡯⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⢠⠋⠀⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⢸⣆⣰⡆⡠⠶⠒⠛⠛⠓⠰⢦⣄⣠⣿⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠈⢿⣿⣿⠀⠀⠀⠀⠀⠀⠠⢄⡼⠃⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⡀⢿⡃⠑⠠⢀⣀⣁⢤⠞⠋⠀⠀⠙⠋⢁⣰⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⢀⠞⠀⠀⠑⣄⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠔⠙⣁⡔⠋⠉⠉⢻⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⡾⣻⠉⠉⠉⢹⣷⣄⠀⠀⠀⢀⡴⠚⠁⠀⠀⣀⡿⢀⣀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⢸⣦⢸⣀⣀⠤⠾⣿⡿⠙⠒⠒⠚⠀⠀⢀⣴⣊⠉⠀⡠⣹⠵⣦⢰⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠚⣦⠀⠀\n"
				+ "⠀⠀⠸⣃⡿⠋⠂⠀⠀⠸⣧⠀⠀⠀⠀⠀⢠⡟⠁⠀⠉⠻⣟⠁⢰⣼⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣁⣼⡏⠀⠀\n"
				+ "⠀⠀⠀⢻⣥⡄⠐⣄⡱⣏⣩⠀⠄⠀⠀⢔⣁⣍⡀⠀⠀⣙⣼⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣀⣀⣀⣀⣠⣤⣶⣍⣥⣴⣾⣿⣿⠃⠀⠀\n"
				+ "⠀⠀⠀⠀⠙⢿⣿⣿⢠⣬⠆⠀⠀⠀⠀⠠⢛⡉⢹⣾⣿⣿⣿⣿⣿⣿⠟⠋⠉⠈⠀⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⡔⠀⠈⡏⠁⠀⠀⠀⠀⠀⠀⠀⠉⠊⠉⠉⠉⠉⠀⡬⠁⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⡼⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠅⠀⠀⠀⣀⠀⠀⠀⢀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⡟⣶⠒⠒⠋⣙⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡯⠒⠓⠤⡴⠀⠤⠖⠚⣹⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⢱⣿⣶⣴⣾⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠆⠀⠀⠇⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⢠⣀⣀⡀⠀⠀⠀⢸⣶⣶⣶⣾⣾⣿⣿⣿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⡠⢾⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠉⠁⠀⠈⠁⠈⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠠⢊⠔⠁⠀⢈⣿⣿⠿⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⢿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠈⠃⠀⠈⠉⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣿⠟⠻⣿⠛⠻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠄⠀⠀⠀⢀⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠴⣄⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.027 | 이름:모래두지 | 타입:땅 | 능력치[공격력:126, 방어력:120, 체력:137, 포획확률:50%]");
System.out.println("사용스킬[1.할퀴기 2.머드숏 3.스톤샤워 4.구멍파기 5.모래지옥]");
System.out.println("-------------------------------------------------------------");
	}
	
	void 고라파덕(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⢀⣠⣶⡶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠤⠤⠶⠶⠶⠴⠿⣵⣿⣿⣥⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣔⣒⣶⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠯⡉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠊⣩⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡇⣰⠧⠒⠒⠦⡀⠀⠀⠀⠀⠀⣠⠖⠚⠉⠛⠢⡄⠀⠀⢱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠋⢠⡇⠀⠀⠂⠀⢸⠀⣀⣀⣀⠸⡁⠀⠀⠁⠀⠀⢸⣰⠶⠦⠧⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠀⠀⢸⡏⠓⠲⠒⣒⠵⠊⠀⠀⠈⠑⠮⣓⣒⣒⠒⠊⢵⠟⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠘⣇⡔⠊⠉⠁⠀⠐⠀⠀⠐⠀⠀⠀⠀⠉⠉⢹⠌⣇⠀⠀⠀⠀⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⠙⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠎⠀⣿⠀⠀⠀⠀⠀⠈⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⠀⠀⠀⠀⠀⢨⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⡶⠞⣿⠀⠀⠀⠀⠀⠀⠀⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⢀⡀⢀⡴⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⢹⡆⠀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⠟⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡎⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠘⢆⠀⠀⠀⠀⢀⡴⠁⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠇⠀⠀⠀⠀⠈⠙⢲⣶⡶⠿⠖⠚⢋⠇⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠈⠲⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠚⠁⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⣠⠎⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠈⠉⠒⠒⠒⠒⠒⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⢀⠜⠁⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⢀⡴⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠗⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠠⠂⠉⠀⠉⠒⠦⠤⣤⣤⣀⣀⣀⣀⣀⣀⣀⣀⣤⠤⠴⠚⠉⠑⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠣⠄⠒⠢⣀⠤⠂⠁⠀⠀⠀⠀⠀⠀⢠⠋⠀⣀⡀⠀⠀⢀⣀⣀⣈⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠈⠒⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.054 | 이름:고라파덕 | 타입:물 | 능력치[공격력:122, 방어력:95, 체력:137, 포획확률:50%]");
System.out.println("사용스킬[1.물대포 2.사념의박치기 3.환상빔 4.아쿠아테일 5.크로스촙]");
System.out.println("-------------------------------------------------------------");
	}
	
	void 슈륙챙이(){
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⢀⡀⠠⠤⠤⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⡠⠐⠈⠀⠀⠀⠀⠀⠀⠀⠢⡀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⡎⠀⠀⠀⠀⠀⠀⣀⠤⠤⢄⡀⢹⡀⢀⢤⠦⢤⡈⢉⣼⣶⡀⠀⠀⠀⠀⠀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⢇⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠈⢁⡾⢣⣮⣠⣿⠿⠿⠿⠛⠒⠠⢤⣤⡴⠋⡐⠂⡠⣈⠓⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠐⠤⠤⠐⠚⠉⠢⢄⣠⠤⢀⠀⢠⣇⠼⠋⣉⢀⣠⣤⣴⣶⣾⣿⣿⣿⠁⣾⣇⣀⣽⣿⣄⣸⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⢄⠀⠀⠀⠀⠀⢉⠂⠜⣁⡀⠤⠽⢿⣿⣿⣿⣿⣿⣿⣿⣿⣄⢿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠑⠤⣤⣤⣾⡿⠗⠉⣀⣤⣤⣤⣀⡀⠉⠛⢿⣿⣿⣿⣿⣿⣷⣯⣽⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠹⠏⣠⠔⠉⠀⠀⠀⠈⠉⠙⠻⣦⣀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⡴⠁⢀⡴⠞⠛⠛⠛⠷⢤⡀⠀⠙⢧⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢠⡼⢁⣴⠋⣠⡶⠶⠶⣦⣄⠀⠙⣦⡀⠈⢿⡄⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣼⠋⠁⠀⠀⡀⠠⠀⠄⢀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⢸⠇⣼⠃⣤⣶⣦⣄⠙⣷⡀⠸⣧⠀⠘⣷⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⣿⠸⣧⢸⣇⣠⡄⢻⠀⢸⡇⠀⣿⠀⠀⣿⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣇⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⢹⡆⠹⣆⡉⠋⣠⡿⠀⣼⠃⠀⣿⠀⠀⣿⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⠻⢦⣈⠙⠛⣉⣠⡾⠃⠀⣰⠏⠀⢸⡿⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⠇⢇⠀⠀⠠⢄⡀⠀⠀⠀⠀⢀⠇\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠫⠳⣄⡉⠙⠛⠋⠉⠀⢀⣴⠏⠀⢠⣿⠃⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠘⢄⠀⠀⠀⠙⠆⠀⢀⠰⠃⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⠛⠷⢶⣶⣶⠿⠛⠁⣠⣾⠿⠃⠀⣰⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠉⠒⠒⠀⠀⠈⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⢄⠀⠀⠀⠰⠿⠛⠁⢀⣠⣾⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣶⣶⡶⠶⣾⣿⣿⠿⠿⢿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣼⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⣿⣿⣿⣷⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠒⠈⠉⠉⠉⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⣶⣶⣶⣶⣿⣿⣿⠿⠟⠉⠀⠀⠀⠀⢸⣿⣿⡟⠉⠁⠀⠈⠀⠉⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣿⣶⣦⣤⣤⣶⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "");
System.out.println("-------------------------------------------------------------\n>>포켓몬 정보<<");
System.out.println("도감번호:No.061 | 이름:슈륙챙이 | 타입:물 | 능력치[공격력:130, 방어력:123, 체력:163, 포획확률:25%]");
System.out.println("사용스킬[1.거품 2.머드숏 3.물의파동 4.진흙폭탄 5.거품광선]");
System.out.println("-------------------------------------------------------------");
	}
	
}