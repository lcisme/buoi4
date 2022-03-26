package secction4lab1;

import java.util.ArrayList;

public class Phonenumber{
    public String name;
    public ArrayList<String> phone = new ArrayList<>();

    public Phonenumber(String name, String phone){
        this.name = name;
        this.phone.add(phone);
    }
}
