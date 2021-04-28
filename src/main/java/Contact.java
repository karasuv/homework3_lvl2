public class Contact {
   private String surname;
   private String phoneNumber;
    Contact(String surname,String phoneNumber){
        this.surname=surname;
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
