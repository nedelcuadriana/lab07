package ro.ase.cts.lab07.decorator;

public class MasinaPersonala implements Masina{

    @Override
    public void pornesteMotorul() {
        System.out.println("Motor pornit");
    }
}
