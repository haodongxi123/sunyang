package io.syy.jcartstoreback.dto.in;

public class CustomerUpdateProfileInDTO {

    private  String realBName;
    private  String mobile;
    private  String email;

    public String getRealBName() {
        return realBName;
    }

    public void setRealBName(String realBName) {
        this.realBName = realBName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

