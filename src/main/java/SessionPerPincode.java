public class SessionPerPincode {
    private String pincode;
    private String availableY_N;
    private String dates;
    private String ageLimit;

    public String getDates() {
        return dates;
    }

    public void setDates(final String dates) {
        this.dates = dates;
    }

    public SessionPerPincode() {
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(final String pincode) {
        this.pincode = pincode;
    }

    public String getAvailableY_N() {
        return availableY_N;
    }

    public void setAvailableY_N(final String availableY_N) {
        this.availableY_N = availableY_N;
    }


    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(final String ageLimit) {
        this.ageLimit = ageLimit;
    }
}
