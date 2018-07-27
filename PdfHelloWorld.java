package ca.i88.pdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;

/**
 *
 * @author i88.ca
 */
public class PdfHelloWorld {

    public static void main(String args[]) throws FileNotFoundException {

        String dest = "/tmp/i88.ca.pdf";
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        try (Document document = new Document(pdf)) {
            document.add(new Paragraph("Hello World!"));
            document.close();
        }

    }
}
