package com.benzon.pdfsandbox;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.text.PDFTextStripper;

public class ExtractText {
	public static void main(String[] args) {
		try {
			File file = new File("/TheMythos.pdf");
			PDDocument pdDocument = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();

			String text = pdfStripper.getText(pdDocument);
			System.out.println("Text in PDF\n==================");
			System.out.println(text);

			// Returns the string which will be used at the end of an article.
			// String articleEnd = pdfStripper.getText(pdDocument).getArticleEnd();
			// System.out.println("Article end.");
			// System.out.println(articleEnd);

			pdDocument.close();
		} catch (IOException e) {
			System.out.println("FAILED. \n[" + e.getMessage() + "]\n");
		}
	}
}
