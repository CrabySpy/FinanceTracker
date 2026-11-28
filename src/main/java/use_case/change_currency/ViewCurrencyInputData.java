package use_case.change_currency;
public class ViewCurrencyInputData {

  private int profileID;
  private int accountID;

  public ViewCurrencyInputData(int profileID, int accountID) {
    this.accountID = accountID;
    this.profileID = profileID;
  }

  public int getAccountID() {
    return accountID;
  }

  public int getProfileID() {
    return profileID;
  }
}