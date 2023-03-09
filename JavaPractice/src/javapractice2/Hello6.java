/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice2;

/**
 *
 * @author jesse
 */
public final class Hello6 extends Hello3 {

    public Hello6() {
        isHello3 = this instanceof Hello3;
    }

    public Hello6(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    private static int packageNumber = 2;

    public void getPackageNumber() {
        System.out.println("packageNumber: " + packageNumber);
    }

    @Override
    public void getIsHello() {
        super.getIsHello();
        System.out.println("isHello3: " + isHello3);
        getPackageNumber();
    }

    protected class Hello1 extends Hello {

        protected static boolean isHello = true;

        @Override
        public void getIsHello() {
            System.out.println("isHello: " + isHello);
        }
    }

    private class Hello2 extends Hello1 {

        private static int classNumber = 2;

        public void getClassNumber() {
            System.out.println("classNumber: " + classNumber);
        }
    }
}
