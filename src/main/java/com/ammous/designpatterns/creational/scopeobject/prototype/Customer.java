package com.ammous.designpatterns.creational.scopeobject.prototype;

/**
 * @author Rami Ammous
 */
public class Customer implements Cloneable{

    @Override
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }

    private Long id;
    private String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
