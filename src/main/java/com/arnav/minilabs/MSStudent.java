package com.arnav.minilabs;

public class MSStudent extends Student {

    int gradeLevel;

    public MSStudent(String n, int l) {
        super(n);
        gradeLevel = l;
    }

    public Boolean registerforclass(String className) {
        System.out.println("Registering for " + className);
        if (getParentApproval()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

