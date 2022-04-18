package ro.ase.cts.lab07.decorator;

public abstract class MasinaDecorator implements Masina{

    protected Masina decoredMasina;

    public MasinaDecorator(Masina decoredMasina) {
        this.decoredMasina = decoredMasina;
    }

    public void pornesteMotorul() {
        decoredMasina.pornesteMotorul();
    }
}
