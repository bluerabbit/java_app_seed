package org.gradle;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Executor {

	public static void main(String... args) {
		System.out.println("run Executor#main");

		for (String arg : args) {
			System.out.println(arg);
		}

		if (args.length > 0) {
			createExcelFile(args[0]);
		}
	}

	private static void createExcelFile(String fileName) {
		Workbook wb = new HSSFWorkbook();
		try (FileOutputStream out = new FileOutputStream(fileName);) {
			wb.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
