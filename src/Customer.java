public class Customer {
    private final String name;
    private boolean member = false;
    private String memberType;
    private String phoneNumber;

    public Customer(String name,String phoneNumber) {
        this.name = name;
        this.memberType = "None";
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        if(member){
            return name+" "+phoneNumber+" "+"YES"+" "+memberType;
        }
        else return name+" "+phoneNumber+" "+"NO"+" "+"None";
    }
}
