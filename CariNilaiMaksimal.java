class CariNilaiMaksimal {
	public static void main (String[] args){
		int nilai1 = 7;
		int nilai2 = 4;
		int nilai3 = 9;
		
		int maksimal = 0;

		maksimal = nilai1 >= maksimal ? nilai1 : maksimal;
		maksimal = nilai2 >= maksimal ? nilai2 : maksimal;
		maksimal = nilai3 >= maksimal ? nilai3 : maksimal;
		
		System.out.println("Nilai maksimal dari nilai " + nilai1 + ", " + nilai2 + " dan " + nilai3);
		System.out.println("Adalah = " + maksimal);
	}
}
