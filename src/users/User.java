package users;

public class User {
    public String id;
    public String name;
    public String userName;
    public String email;
    public Address address;
    public String phone;
    public String website;
    public Company company;

    public User() {}
    public User(String id, String name, String userName, String email, Address addressArrayList, String phone, String website, Company company) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.address = addressArrayList;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "users.Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", addressArrayList=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", companyArrayList=" + company +
                '}';
    }
}
