
package base.patterns.structural.facade;

public class HardDrive {
    
    public byte[] read(long lba, int size) {
        
        System.out.println("read lba = " + lba + ", size = " + size);

        return new byte[size];
    }
}
