import com.aspose.pdf.Document;
import com.aspose.pdf.ExcelSaveOptions;

public class PdfToExcelConverter {
    public static void main(String[] args) {
        // Specify the path of the input PDF and output Excel file
        String pdfFilePath = "path/to/input.pdf";
        String excelFilePath = "path/to/output.xlsx";

        try {
            // Load the PDF document
            Document pdfDocument = new Document(pdfFilePath);

            // Create ExcelSaveOptions
            ExcelSaveOptions saveOptions = new ExcelSaveOptions();
            saveOptions.setMinimizeTheNumberOfWorksheets(true);
            saveOptions.setFormat(com.aspose.pdf.ExcelSaveOptions.ExcelFormat.XLSX);

            // Save the PDF as an Excel file
            pdfDocument.save(excelFilePath, saveOptions);

            System.out.println("PDF converted to Excel successfully. Output saved at: " + excelFilePath);
        } catch (Exception e) {
            System.err.println("Error during PDF to Excel conversion: " + e.getMessage());
        }
    }
}
