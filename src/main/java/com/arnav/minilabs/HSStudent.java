package com.arnav.minilabs;

public class HSStudent extends Student {
    int gradeLevel;

    public HSStudent(String n, int l) {
        super(n);
        gradeLevel = l;
    }

    public Boolean registerforclass(String className) {
        System.out.println("Registering for " + className);
        if (getParentApproval()) {
            System.out.println("I got parent approval now I need to get counselor approval.");
            if (getCounselorApprval()) {
                System.out.println("Got all approvals");
                System.out.println("Registration successful");
                return Boolean.TRUE;
            }
        }
        System.out.println("Registration unsuccessful for" + className);
        return Boolean.FALSE;
    }

    public Boolean getCounselorApprval() {
        return Boolean.TRUE;
    }
}
