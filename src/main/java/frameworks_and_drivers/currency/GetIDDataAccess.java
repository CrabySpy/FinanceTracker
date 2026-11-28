package frameworks_and_drivers.currency;
import org.json.JSONArray;
import org.json.JSONObject;
import use_case.change_currency.GetIDDataAccessInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GetIDDataAccess implements GetIDDataAccessInterface {
  private String profileName;
  private String accountName;
  private String source = "data/Profiles.json";
  private int profileID = 0;
  private int accountID = 0;

  public GetIDDataAccess(String profileAccountName) throws IOException {

    String profileAccount = profileAccountName.trim();
    String[] apportioned = profileAccount.split("—", 2);
    String contents = Files.readString(Path.of(this.source));
    JSONObject savedData = new JSONObject(contents);
    this.profileName = apportioned[0].trim();
    this.accountName = apportioned[1].trim();
    JSONArray profiles = savedData.getJSONArray("profiles");

    for (int i = 0; i < profiles.length(); i++) {
      if (profiles.getJSONObject(i).getString("name").equals(this.profileName)) {

        JSONObject selectedProfile = profiles.getJSONObject(i);
        JSONArray selectedAccounts = selectedProfile.getJSONArray("accounts");
        this.profileID = selectedProfile.getInt("id");
        for (int j = 0; j < selectedAccounts.length(); j++) {
          if (selectedAccounts.getJSONObject(j).getString("name").equals(this.accountName)) {
            JSONObject selectedAccount = selectedAccounts.getJSONObject(j);
            this.accountID = selectedAccount.getInt("id");
          } else {
            j = j + 0;
            this.accountID = accountID;
          }
        }
      } else {
        i = i + 0;
        this.profileID = profileID;
      }
    }
  }


  @Override
  public int getProfileID(String profileAccount) throws IOException {
    GetIDDataAccess thisData = new GetIDDataAccess(profileAccount);
    return thisData.profileID;
  }

  @Override
  public int getAccountID(String profileAccount) throws IOException {
    GetIDDataAccess thisData = new GetIDDataAccess(profileAccount);
    return thisData.accountID;
  }
}
