package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Имён", "Имёныч", "Фамильярный", "Nickname_IIF", "Dr.", "ООО \"ААА\"", "Просто живу я на улице Ленина", "+ 7 8000 90001", "+7 8000 90002", "+7 8000 90003", "+7 8000 90004", "im.im.fam@iif.io", "im.im.fam2@iif.io", "im.im.fam3@iif.io", "https://google.com"));
    app.getContactHelper().submitContactCreation();
  }

}
