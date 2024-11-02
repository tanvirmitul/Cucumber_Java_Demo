package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utils {
    public static void visitUrl(WebDriver driver,String url){
        driver.get(url);
    }
    public static void timeNap(int secs) throws InterruptedException {
        Thread.sleep(secs*1000);
    }

    public static void main(String[] args) throws IOException {
//        String excelFilePath = "credentials.xlsx";
////        Sheet sheet = workbook.createSheet("Credentials");
//        FileInputStream fileInputStream = new FileInputStream(excelFilePath);
//        Workbook workbook = new XSSFWorkbook(fileInputStream);
//        Sheet sheet=workbook.getSheetAt(0);
//        Row firstRow = sheet.getRow(1);
//        Cell cell= firstRow.createCell(2);
//        cell.setCellValue("Passed");
//        CellStyle cellStyle= workbook.createCellStyle();
//        Font font= workbook.createFont();
//        font.setColor(IndexedColors.WHITE.getIndex());
//        cellStyle.setFont(font);
//        cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
//        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//        cell.setCellStyle(cellStyle);
//        FileOutputStream fileOutputStream= new FileOutputStream(excelFilePath);
//        workbook.write(fileOutputStream);
        // Check if the first row is not null
//        if (firstRow != null) {
//            // Get the number of columns in the first row
//            int numberOfColumns = firstRow.getLastCellNum();
//            System.out.println("Number of columns: " + numberOfColumns);
//        } else {
//            System.out.println("The first row is empty or does not exist.");
//        }

//        Row headerRow = sheet.createRow(1);
//        headerRow.createCell(0).setCellValue("Username");
//        headerRow.createCell(1).setCellValue("Password");

//        Row dataRow = sheet.createRow(1);
//        dataRow.createCell(2).setCellValue("mitul01");
//        dataRow.createCell(3).setCellValue("1234");
//
//        try (FileOutputStream fileOut = new FileOutputStream(excelFilePath)) {
//            workbook.write(fileOut);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String excelFilePath = "credentials.xlsx";
//
//        try {
//            FileInputStream fileInputStream = new FileInputStream(excelFilePath);
//            Workbook workbook = new XSSFWorkbook(fileInputStream);
//            Sheet sheet = workbook.getSheetAt(0);
//            Row firstRow = sheet.getRow(1);
//            if (firstRow == null) {
//                firstRow = sheet.createRow(1);
//            }
//            Cell cell = firstRow.createCell(2);
//            cell.setCellValue("Passed");
//            CellStyle cellStyle = workbook.createCellStyle();
//            Font font = workbook.createFont();
//            font.setColor(IndexedColors.WHITE.getIndex());
//            cellStyle.setFont(font);
//            cellStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//            cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//            cell.setCellStyle(cellStyle);
//
//            FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath);
//            workbook.write(fileOutputStream);
//
//            // Close resources
//            fileOutputStream.close();
//            workbook.close();
//            fileInputStream.close();
//
//            System.out.println("Excel updated successfully!");
//            String token="YGJ3Q36GKREYC266Z2NB2A8B";
//            String phoneNum="+18042987473";
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.err.println("Failed to update Excel file. Please check the file path and permissions.");
//        }



    }


    }

