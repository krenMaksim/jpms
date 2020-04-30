package packt.addressbook;

import java.util.List;

import packt.addressbook.util.ContactUtil;
import packt.addressbook.model.Contact;
import packt.util.SortUtil;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Testing");
        ContactUtil contactUtil = new ContactUtil();
        SortUtil sortUtil = new SortUtil();
        List<Contact> contacts = contactUtil.getContacts();
        sortUtil.sortList(contacts);
        System.out.println(contacts);
    }
}