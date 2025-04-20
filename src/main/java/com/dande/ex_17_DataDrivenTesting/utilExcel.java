package com.dande.ex_17_DataDrivenTesting;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class utilExcel {

    static Workbook book;
    static Sheet sheet;

    public static String sheetpath = System.getProperty("user.dir") + "/src/test/resources/TestData.xlsx";

    public static Object[][] getTestdatafromExcel(String sheetname) {
        FileInputStream file = null;

        try {
            file = new FileInputStream(sheetpath);
            book = WorkbookFactory.create(file);
            sheet = book.getSheet(sheetname);
        } catch (IOException e) {
            System.out.println("Either File Not Found! or workbook not created!");
        }


        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i =0; i<sheet.getLastRowNum(); i++ ){
            for (int j =0;  j < sheet.getRow(0).getLastCellNum(); j++){

                data[i][j] = sheet.getRow(i+1).getCell(j).toString();

            }
        }

        return data;

    }

}



