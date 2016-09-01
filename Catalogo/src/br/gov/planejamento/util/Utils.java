package br.gov.planejamento.util;

public class Utils {

	public static boolean isNumeric(String string){
		return string.matches("-?\\d+(\\.\\d+)?");
	}
}
