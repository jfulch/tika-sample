# Apache Tika PDF Text Extractor

This simple Java application demonstrates the use of Apache Tika to extract text from multiple file formats, including PDFs. The application uses the Tika parser to extract text from a sample PDF file and print it to the console.

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven 3.6.3 or higher
- Apache Tika 2.3 or higher

## Setup

1. Clone this repository or download the source code.
2. Navigate to the project directory.

## Building the Application

To build the application, run the following command in the project root directory:

```bash
mvn clean package
```

## Running the Application

After building the application, you can run it using the following command:

```bash
mvn exec:java -Dexec.mainClass="com.example.App" 
```

## Usage

1. Place a PDF inside of the `upload-files` folder
2. Run the application as described above.
3. The extracted text from the PDF will be printed to the console.

## Currently Supported File Formats:

- PDF
- Microsoft Office documents (Word, Excel, PowerPoint)
- OpenDocument formats
- HTML
- Plain text
- Images (with embedded metadata)
- Audio and video files (with embedded metadata)

## Troubleshooting

If you encounter any issues:

- Ensure you have the correct JDK version installed.
- Verify that Maven is correctly installed and configured.
- Check that the `sample.pdf` file exists in the project root directory.

## Further Development

This basic application can be extended to:

- Process multiple files
- Extract metadata from PDFs
- Handle different file formats
- Implement more advanced Tika features

For more information, refer to the Apache Tika documentation.
