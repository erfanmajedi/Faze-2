package FileMaker;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * file maker class represents that we make a file for each of classes that need to save their information
 * @author Erfan Majedi
 * @since 2020.12.12
 */
public class FileMaker {
    // make field for path
    String path = "";

    /**
     * constructor for file maker class
     * we initialize path in it
     * @param FilePath
     */
    public FileMaker(String FilePath){
        path = FilePath;
    }

    /**
     * int this method we put data in file and set a boolean value
     * then we print the data in the file and close both file and print file
     * @param Data
     * @param AppendValue
     * @throws IOException
     */
    public void FileWriter(String Data, boolean AppendValue) throws IOException{
        FileWriter fw = new FileWriter(path, AppendValue);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(Data);
        pw.close();
        fw.close();
    }

    /**
     * in this method we check if the file is empty or not
     * because in other classes we have to check the emptiness of file
     * so we can put something and do some actions
     * @return
     * @throws IOException
     */
    public boolean IsEmptyFile() throws IOException{
        // set buffer reader null
        BufferedReader br = null;
        // set flag null
        String Flag = "";
        try {
            // make a file in the path that we choose
            File file = new File(this.path);
            //return file.length();// == 0;
            // read from file
            br = new BufferedReader(new FileReader(file));
        // check some exceptions
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileMaker.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // here we set flag to read and then close it
            try {
                Flag = br.readLine();
                br.close();
            }
            // check some exception
            catch (IOException ex) {
                Logger.getLogger(FileMaker.class.getName()).log(Level.SEVERE, null, ex);
            }
            return Flag.length() <= 3;
        }
    }

    /**
     * in this method we clear the file if t=we want to delete something
     * like in close class that the master want to delete a class from file
     */
    public void ClearFile(){
        // we set the file and print writer
        // file will write in the path and print the file writer
        // we set autoFlush false because we don't want it to flush it automatically
        try {
            FileWriter fw = new FileWriter(path, false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        }
        // check some exceptions and we set a error massage too
        catch (IOException ex) {
            Logger.getLogger(FileMaker.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * in this method we read the file and we count the lines and put it in arrays
     * @return text array
     * @throws IOException
     */
    public String[] ReadFile() throws IOException{
        // set the count lines to the NumberOfLines()
        int countLines = NumberOfLines();
        // set fileReader null
        FileReader fr = null;
        // set bufferReader null
        BufferedReader bf = null;
        // make a array for text we length of countLines
        String[] Text = new String[countLines];
        try {
            // initialize file reader
            fr = new FileReader(path);
            // initialize buffer reader
            bf = new BufferedReader(fr);
            // we use for loop for put all the things that buffer reads to arrays of text
            for(int i = 0; i < countLines; i++)
                Text[i] = bf.readLine();
        }
        // check some exceptions and make a error massage
        catch (FileNotFoundException ex) {
            //Logger.getLogger(FileMaker.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // here we close both files
        finally {
            bf.close();
            fr.close();
        }
        return Text;
    }

    /**
     * in this method we count the number of lines
     * @return count
     * @throws IOException
     */
    public int NumberOfLines() throws IOException
    {
        // set count to zero
        int count = 0;
        // set fileReader null
        FileReader fr = null;
        // set bufferReader null
        BufferedReader bf = null;
        try {
            // initialize fileReader
            fr = new FileReader(path);
            // initialize BufferedReader
            bf = new BufferedReader(fr);
            // use while to start count until the file is not null
            while(bf.readLine() != null)
                count++;
        }
        // check some exceptions and make a error massage
        catch (FileNotFoundException ex) {
            //Logger.getLogger(FileMaker.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // we close both files here
        finally {
            bf.close();
            fr.close();
        }
        return count;
    }
}

