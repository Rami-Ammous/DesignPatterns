package com.ammous.designpatterns.creational.scopeclass.simplefactory.exemple3;

/**
 * @author Rami Ammous
 */
public abstract class Computer {

    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();


    @Override
    public String toString() {
        return "Ma configuration : Ram :: "+getRam()+" | HDD :: "+getHdd()+" | CPU :: "+getCpu();
    }
}
