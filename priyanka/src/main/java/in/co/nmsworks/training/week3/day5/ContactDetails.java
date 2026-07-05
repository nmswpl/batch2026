package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactDetails {
    private String name;
    private Integer mobile;
    private String email;
    List<ContactDetails> contact = new ArrayList<>();
    Map<Character,List<ContactDetails>> map= new HashMap<>();

    public ContactDetails() {
    }

    public List<Character> getAlphabet(){
       List<Character> alphabets = new ArrayList<>();
       char ch = 'A';
       for(int i = 0; i < 26; i++){
           alphabets.add(ch++);
       }
       return alphabets;
   }
    public ContactDetails(String name, Integer mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}
