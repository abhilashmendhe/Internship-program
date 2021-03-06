/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preprocess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import jxl.*;
import jxl.read.biff.BiffException;
import sun.awt.OSInfo;
/**
 *
 * @author abhilash
 */
public class ReadDataSet {
    public ArrayList readAllData(String path) throws IOException, BiffException 
    {
        Workbook wb = Workbook.getWorkbook(new File(path));
        
        Sheet s = wb.getSheet(0);
        int row = s.getRows();
        int col = s.getColumns();
        
        ArrayList all = new ArrayList();
        
        for(int i=0; i<row; i++)
        {
            ArrayList temp = new ArrayList();
            
            for(int j=0; j<col; j++)
            {
                Cell c = s.getCell(j,i);
                temp.add(c.getContents());
            }
            //System.out.println(temp);
            all.add(temp);
        }
        
        return all;
    }
    
    public ArrayList readCertified(ArrayList all) throws IOException, BiffException
    {
        ArrayList getdata = all;
        ArrayList certified = new ArrayList();
        
        for(int i=0; i<getdata.size(); i++)
        {
            ArrayList t = (ArrayList) getdata.get(i);
            if(t.get(4).equals("1"))
                certified.add(t);
        }
        return certified;
    }
    
    public ArrayList readNotCertified(ArrayList all) throws IOException, BiffException
    {
        ArrayList getdata = all;
        ArrayList notcertified = new ArrayList();
        
        for(int i=0; i<getdata.size(); i++)
        {
            ArrayList t = (ArrayList) getdata.get(i);
            if(t.get(4).equals("0"))
                notcertified.add(t);
        }
        return notcertified;
    }
    
}