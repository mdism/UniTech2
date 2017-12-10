package mdism.unitech;

/**
 * Created by mdism on 11-Dec-17.
 */

public class ConnectInfo {

    private String ipAdress;
    private int portID;
    private int slaveID;
    private short readRegister;
    private short writeRegister;

    public ConnectInfo() {
    }

    public ConnectInfo(String ipAdress, int portID, int slaveID, short readRegister, short writeRegister) {
        this.ipAdress = ipAdress;
        this.portID = portID;
        this.slaveID = slaveID;
        this.readRegister = readRegister;
        this.writeRegister = writeRegister;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public int getPortID() {
        return portID;
    }

    public int getSlaveID() {
        return slaveID;
    }

    public short getReadRegister() {
        return readRegister;
    }

    public short getWriteRegister() {
        return writeRegister;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public void setPortID(int portID) {
        this.portID = portID;
    }

    public void setSlaveID(int slaveID) {
        this.slaveID = slaveID;
    }

    public void setReadRegister(short readRegister) {
        this.readRegister = readRegister;
    }

    public void setWriteRegister(short writeRegister) {
        this.writeRegister = writeRegister;
    }

}
