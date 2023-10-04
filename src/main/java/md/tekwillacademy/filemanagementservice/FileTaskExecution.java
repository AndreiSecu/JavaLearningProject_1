package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {

    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/md/tekwillacademy/filemanagementservice/file.txt");

        FileManger.informIfTheFilExists(fileObject);
        System.out.println(FileManger.createTheFileIfItDoesNotExist(fileObject));
        FileManger.informIfTheFilExists(fileObject);
        FileManger.printTheFileName(fileObject);
        FileManger.printTheAbsolutePath(fileObject);
        FileManger.printIfItIsADirectoryOrAFile(fileObject);


        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Content");
        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Altceva");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject, "Value Free");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject, "Value Free 2");


        InputFileReaderManager.printDataOnTheConsoleUsingFileReader(fileObject);
        System.out.println();
        InputFileReaderManager.printDataFromAFileUsingBufferedReader(fileObject);
        InputFileReaderManager.printDataUsingTheEasiestWay(fileObject);

    }
}
