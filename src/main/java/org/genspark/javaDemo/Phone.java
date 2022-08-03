package org.genspark.javaDemo;

import org.springframework.beans.factory.annotation.Value;

public class Phone {
    @Value("#{'1234567890'}")
    private String mob;

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
