/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

/**
 *
 * @author Ian
 */
public class RecordTest2 {
    public static void main(String[] args){
        Record[] r = new Record[100];
        r[0] = new Record("ian", 100, 100, 200);
        r[1] = new Record("john", 90, 95, 185);
        r[2] = new Record("cj", 80, 90, 170);
        Record.sort(r,"midterm");
        RecordTest.printRecordArray(r);
    }
}
