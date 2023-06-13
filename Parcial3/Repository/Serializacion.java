package Parcial3.Repository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Serializacion {
        public Serializacion() {
        }

        public static void writer(Object obj, String fileName) throws IOException {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(obj);
            objOut.close();
            fileOut.close();
        }

        public static Object reader(String fileName) throws IOException, ClassNotFoundException {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Object obj = objIn.readObject();
            objIn.close();
            fileIn.close();
            return obj;
        }
    }

