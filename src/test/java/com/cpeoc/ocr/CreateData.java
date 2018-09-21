package com.cpeoc.ocr;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateData {
	public static void main(String[] args) throws Exception {
		
		
		Map<String, String> pm = new HashMap<String, String>();
		pm.put("1194", "经典款");
		
		Map<String, String> am = getExcelData();
		Object[] amkeyarray = am.keySet().toArray();
		Object[] pmkeyarray = pm.keySet().toArray();
		int x = 0;
		for (Object amkey : amkeyarray) {
			for (Object pmkey : pmkeyarray) {
		
				System.out.println("[江西]四季无忧个人意外保险经典款,"+pm.get(pmkey)+","+pmkey.toString()+","+am.get(amkey)+","+amkey.toString());
				x++;
			}
		}
		System.out.println(x);


	}
	
	public static Map<String, String> getExcelData() throws Exception{
		
		Map<String, String> map = new HashMap<>();
		File file = new File("data.xls");
		
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new HSSFWorkbook(fis);
	
		ExcelUtil eu = new ExcelUtil(wb);
		
		List<List<String>> readList = eu.read(0);
		for (List<String> list : readList) {
				map.put(list.get(0), list.get(1));
		}

		return map;
		
	}
	
	
}
