package com.numero.romano;

import javax.swing.JOptionPane;

public class ConverteNumero {

    public String conversorDeNumero(int numero) {

        String result = "";

        String n = Integer.toString(numero);

        int contNumero = n.length();
        if (contNumero == 1) {
            int num = Integer.parseInt(n.substring(0, 1));
            result = retorna9(num);
        } else if (contNumero == 2) {
            int num = Integer.parseInt(n.substring(0, 1));
            int num2 = Integer.parseInt(n.substring(1, 2));
            result = retorna99(num) + retorna9(num2);
        } else if (contNumero == 3) {
            int num = Integer.parseInt(n.substring(0, 1));
            int num2 = Integer.parseInt(n.substring(1, 2));
            int num3 = Integer.parseInt(n.substring(2, 3));
            result = retorna999(num) + retorna99(num2) + retorna9(num3);
        } else {
            int num = Integer.parseInt(n.substring(0, 1));
            int num2 = Integer.parseInt(n.substring(1, 2));
            int num3 = Integer.parseInt(n.substring(2, 3));
            int num4 = Integer.parseInt(n.substring(3, 4));
            result = retorna3(num) + retorna999(num2) + retorna99(num3) + retorna9(num4);
        }
        return result;
    }

    public String retorna9(int num) {
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "I";
                }
            }
        } else if (num >= 5 && num < 9) {
            if (num == 5) {
                numSt = "V";
            } else {
                numSt = "V";
                for (int i = 5; i < num; i++) {
                    if (num > i) {
                        numSt += "I";
                    }
                }
            }
        } else if (num == 4) {
            numSt = "IV";
        } else {
            numSt = "IX";
        }
        return numSt;
    }

    public String retorna99(int num) {
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "X";
                }
            }
        } else if (num >= 5 && num < 9) {
            if (num == 5) {
                numSt = "L";
            } else {
                numSt = "L";
                for (int i = 5; i < num; i++) {
                    if (num > i) {
                        numSt += "X";
                    }
                }
            }
        } else if (num == 4) {
            numSt = "XD";
        } else {
            numSt = "XC";
        }
        return numSt;
    }

    public String retorna999(int num) {
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "C";
                }
            }
        } else if (num >= 5 && num < 9) {
            if (num == 5) {
                numSt = "D";
            } else {
                numSt = "D";
                for (int i = 5; i < num; i++) {
                    if (num > i) {
                        numSt += "M";
                    }
                }
            }
        } else if (num == 4) {
            numSt = "CD";
        } else {
            numSt = "CM";
        }
        return numSt;
    }

    public String retorna3(int num) {
        String numSt = new String();
        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                if (num > i) {
                    numSt += "M";
                }
            }
        }
        return numSt;
    }

}
