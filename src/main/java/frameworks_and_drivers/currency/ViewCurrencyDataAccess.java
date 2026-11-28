package frameworks_and_drivers.currency;
import org.json.JSONArray;
import org.json.JSONObject;
import use_case.change_currency.ViewCurrencyDataAccessInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViewCurrencyDataAccess implements ViewCurrencyDataAccessInterface {

  private String source = "data/Profiles.json";
  private int profileID;
  private int accountID;
  private String defaultCurrency;

  public ViewCurrencyDataAccess(int profileID, int accountID) throws IOException {
    String contents = Files.readString(Path.of(this.source));
    JSONObject savedData = new JSONObject(contents);

    this.profileID = profileID;
    this.accountID = accountID;
    this.defaultCurrency = "NaN";

    JSONArray profiles = savedData.getJSONArray("profiles");

    for (int i = 0; i < profiles.length(); i++) {
      if (profiles.getJSONObject(i).getInt("id") == this.profileID) {
        JSONObject selectedProfile = profiles.getJSONObject(i);
        JSONArray selectedAccounts = selectedProfile.getJSONArray("accounts");
        for (int j = 0; j < selectedAccounts.length(); j++) {
          if (selectedAccounts.getJSONObject(j).getInt("id") == this.accountID) {
            JSONObject selectedAccount = selectedAccounts.getJSONObject(j);
            this.defaultCurrency = selectedAccount.getString("currency");
          } else {
            j = j + 0;
            this.defaultCurrency = defaultCurrency;
          }
        }
      } else {
        i = i + 0;
        this.defaultCurrency = defaultCurrency;
      }
    }
  }

  @Override
  public int getProfileID(int profileID, int accountID) throws IOException {
    ViewCurrencyDataAccess thisData = new ViewCurrencyDataAccess(profileID, accountID);
    return thisData.profileID;
  }

  @Override
  public int getAccountID(int profileID, int accountID) throws IOException {
    ViewCurrencyDataAccess thisData = new ViewCurrencyDataAccess(profileID, accountID);
    return thisData.accountID;
  }

  @Override
  public String getDefaultCurrency(int profileID, int accountID) throws IOException {
    ViewCurrencyDataAccess thisData = new ViewCurrencyDataAccess(profileID, accountID);
    return thisData.defaultCurrency;
  }
}