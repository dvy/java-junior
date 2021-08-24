package com.acme.edu;

public class ClassValidator {
    private Class<?> currentClass = null;

    public ClassValidator() {}

    public boolean setCurrentClass(Object object) {
        if(this.currentClass != object.getClass()){
            this.currentClass = object.getClass();
            return true;
        }

        return false;
    }
}
