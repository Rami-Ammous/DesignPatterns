package com.ammous.designpatterns.creational.scopeclass.simplefactory.exemple3;

/**
 * @author Rami Ammous
 */
public class PcImaginaire extends  Computer{

    private  String ram;
    private  String hdd;
    private  String cpu;


    public PcImaginaire(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
}
