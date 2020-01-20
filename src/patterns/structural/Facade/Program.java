package patterns.structural.Facade;

public class Program {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
    }
}

class Computer{
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDDRom hddRom = new HDDRom();

    void copy(){
        power.on();
        dvdRom.load(); // if data = true than we load our files
        hddRom.readFile(dvdRom);
    }
}

class Power{

    void on(){
        System.out.println("Computer is on");
    }

    void off(){
        System.out.println("Computer is off");
    }
}

class DVDRom{
    private boolean data = false;

    public boolean hasData(){
        return data;
    }

    void load(){
        data = true;
    }

    void unload(){
        data = false;
    }
}

class HDDRom{

    void readFile(DVDRom dvdRom){
        if (dvdRom.hasData()){
            System.out.println("Process copy files");
        }else {
            System.out.println("Put the disc please");
        }
    }

}