package com.hospitaldatacenter.config;

import org.apache.poi.hssf.usermodel.*;

public class ExcelUntil {

    public static HSSFWorkbook getHssfWorkbook(String sheetName,String[] title,String[][] valus,HSSFWorkbook wb){
        if(wb==null){
            wb=new HSSFWorkbook();
        }

        HSSFSheet sheet=wb.createSheet(sheetName);

        HSSFRow row=sheet.createRow(0);

        HSSFCellStyle style=wb.createCellStyle();

        style.setWrapText(true);

        HSSFCell cell=null;


        for(int i=0;i<title.length;i++){
            sheet.autoSizeColumn(i);
        }


        for (int i=0;i<title.length;i++){
            cell=row.createCell(i);
            cell.setCellValue(title[i]);
            cell.setCellStyle(style);
            row.getCell(i).setCellStyle(style);
        }
        for (int i=0;i<valus.length;i++){
            row=sheet.createRow(i+1);
            for (int j=0;j<valus[i].length;j++){
                row.createCell(j).setCellValue(valus[i][j]);
            }

        }
        return wb;
    }
}
