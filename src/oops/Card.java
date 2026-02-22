package oops;


abstract public class Card implements PayementMethod {

    private String username;
    private  String cardNo;

    public Card(String username, String cardNo) {
        this.username = username;
        this.cardNo = cardNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
