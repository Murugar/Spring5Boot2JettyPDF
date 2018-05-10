package com.iqmsoft;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class WritePDF {

    public void pdfCreater(Form form){
        System.out.println("Creating pdf");
        System.out.println("wirte: " +form.getContent());

        form.getId();
        PdfWriter pdfWriter = null;
        Document document = new Document();
        try {
            pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("mytest.pdf"));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        document.open();
        Paragraph addressText1 = new Paragraph(form.getContent());
        addressText1.setIndentationLeft(10);
        Paragraph addressText2 = new Paragraph(form.getItem1());
        addressText2.setIndentationLeft(10);
        Paragraph addressText3 = new Paragraph(form.getItem2());
        addressText2.setIndentationLeft(10);
        Paragraph addressText4 = new Paragraph("Datumn : " + String.valueOf(new Date()));
        addressText2.setIndentationLeft(10);


        try {
            document.add(addressText1);
            document.add(addressText2);
            document.add(addressText3);
            document.add(addressText4);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        document.close();

    }

}