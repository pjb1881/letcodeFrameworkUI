package com.web.letcode.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ObjectRepoReader {
	Logger log = Logger.getLogger(this.getClass().getSimpleName());

	static FileInputStream file;
	static HSSFWorkbook workbook;
	String path;

	public ObjectRepoReader(String path) {
		try {
			file = new FileInputStream(path);// give file path here
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// @SuppressWarnings("unused")
	public Map<String, Map<String, String>> generateOR(String orSheetName) {
		try {
			if (workbook == null)
				workbook = new HSSFWorkbook(file);
		} catch (IOException e1) {
			log.error("Workbook is empty, Pls create or read Workbook "+workbook+" : \nException is.."+e1.fillInStackTrace());
//			e1.printStackTrace();
		}
		HSSFSheet sheet = workbook.getSheet(orSheetName);
		int nRowCount = sheet.getLastRowNum();
		// Row header1 = sheet.getRow(0);
		// int nColumnCount = header1.getLastCellNum();
		log.info("Sheet Name ::" + orSheetName);

		Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>();
		for (int j = 1; j <= nRowCount; j++) {
			try {
				String cell = sheet.getRow(j).getCell(0).getStringCellValue().trim();
				String proType = sheet.getRow(j).getCell(1).getStringCellValue().trim();
				String ProValue = sheet.getRow(j).getCell(2).getStringCellValue();// .trim();
				Map<String, String> map2 = new HashMap<String, String>();

				if (cell != null) {
					if (proType != null) {
						map2.put(sheet.getRow(0).getCell(1).getStringCellValue(), proType);
					} else {
						map2.put(sheet.getRow(0).getCell(1).getStringCellValue(), "");
					}
					if (ProValue != null) {
						map2.put(sheet.getRow(0).getCell(2).getStringCellValue(), ProValue);
					} else {
						map2.put(sheet.getRow(0).getCell(2).getStringCellValue(), "");
					}
					map.put(cell, map2);
				}
			} catch (Exception e) {
				log.info(e);
			}
		}
		return map;
	}
}
