package secction4lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<Phonenumber> PhoneList = new ArrayList<>();

    public void insertPhone(String name, String phone) {
        for (Phonenumber p : PhoneList) {
            if (p.name == name) {
                for (String s : p.phone) {
                    if (s == phone) {
                        return;
                    }
                }// chua co dt nhung co ten
                p.phone.add(phone);
                return;
            } // chua co sdt lan ten
        }
        PhoneList.add(new Phonenumber(name, phone));
    }

    public void removePhone(String name) {
        for (Phonenumber p : PhoneList) {
            if (p.name == name)
                PhoneList.remove(p);
            return;
        }
    }

    public void updatePhone(String name, String newphone) {
        for (Phonenumber p : PhoneList) {
            if (p.name == name) {
                p.phone.removeAll(p.phone);
                p.phone.add(newphone);
                return;
            }
        }
    }

    public void searchPhone(String name) {
        for (Phonenumber p : PhoneList) {
            if (p.name == name) {
                System.out.println(p.name + " " + p.phone);
            }
        }
    }

    public void sort() {
        if (PhoneList.size() == 0) {
            System.out.println("Không có ai");
        } else {
            Collections.sort(PhoneList, new Comparator<Phonenumber>() {
                public int compare(Phonenumber o1, Phonenumber o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
            System.out.println("Thứ tự sau khi sắp xếp");
            for (Phonenumber p:PhoneList) {
                System.out.println(p.name);
                System.out.println(p.phone);
            }
        }
    }
}