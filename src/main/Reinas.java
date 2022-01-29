package main;

import java.util.ArrayList;

public class Reinas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero();
	}
	
	static boolean val = true;
	static String reina = "REINA";
	static int count = 0;
	
	public static void Tablero() {
	    
	    String [][]tablero = creaTablero();
	    
	    String cc [][] = tablero;
    	for (int i = 0; i < cc.length; i++) {
    		for (int j = 0; j < cc[0].length; j++){
				if(cc[i][j].equals(reina)) {
					count++;
				}
			}
    	}	
    	
    	validarTablero(cc);
    	
	    if(count==8&&val) {
	    	System.out.println("ATACANDO");
	    }else if(count<8){
	    	System.out.println("NECECITAS USAR 8 REINAS");
	    }else if(count>8){
	    	System.out.println("SOLO PUEDES USAR 8 REINAS");
	    }else if(count==8&& !val){
    		System.out.println("NO ATACANDO");
    	}
    }
	
	public static void validarTablero(String cc [][]) {
		if(cc[0][0].equals(reina)&&cc[1][4].equals(reina)&&cc[2][7].equals(reina)
	    		&&cc[3][5].equals(reina)&&cc[4][2].equals(reina)&&cc[5][6].equals(reina)
	    		&&cc[6][1].equals(reina)&&cc[7][3].equals(reina)&&count==8) {
				val = false;
	    	}
	}
	
	//Modificar oreden para ver si funciona la logica
	public static String [][] creaTablero() {
		String tablero[][] = new String[8][8];
		tablero[0][0] = "REINA";
		tablero[0][1] = "";
		tablero[0][2] = "";
		tablero[0][3] = "";
		tablero[0][4] = "";
		tablero[0][5] = "";
	    tablero[0][6] = "";
	    tablero[0][7] = "";
	    tablero[1][0] = "";
		tablero[1][1] = "";
		tablero[1][2] = "";
		tablero[1][3] = "";
		tablero[1][4] = "REINA";
		tablero[1][5] = "";
	    tablero[1][6] = "";
	    tablero[1][7] = "";
	    tablero[2][0] = "";
		tablero[2][1] = "";
		tablero[2][2] = "";
		tablero[2][3] = "";
		tablero[2][4] = "";
		tablero[2][5] = "";
	    tablero[2][6] = "";
	    tablero[2][7] = "REINA";
	    tablero[3][0] = "";
		tablero[3][1] = "";
		tablero[3][2] = "";
		tablero[3][3] = "";
		tablero[3][4] = "";
		tablero[3][5] = "REINA";
	    tablero[3][6] = "";
	    tablero[3][7] = "";
	    tablero[4][0] = "";
		tablero[4][1] = "";
		tablero[4][2] = "REINA";
		tablero[4][3] = "";
		tablero[4][4] = "";
		tablero[4][5] = "";
	    tablero[4][6] = "";
	    tablero[4][7] = "";
	    tablero[5][0] = "";
		tablero[5][1] = "";
		tablero[5][2] = "";
		tablero[5][3] = "";
		tablero[5][4] = "";
		tablero[5][5] = "";
	    tablero[5][6] = "REINA";
	    tablero[5][7] = "";
	    tablero[6][0] = "";
		tablero[6][1] = "REINA";
		tablero[6][2] = "";
		tablero[6][3] = "";
		tablero[6][4] = "";
		tablero[6][5] = "";
	    tablero[6][6] = "";
	    tablero[6][7] = "";
	    tablero[7][0] = "";
		tablero[7][1] = "";
		tablero[7][2] = "";
		tablero[7][3] = "REINA";
		tablero[7][4] = "";
		tablero[7][5] = "";
	    tablero[7][6] = "";
	    tablero[7][7] = "";
	    
	    return tablero;
	}

}
