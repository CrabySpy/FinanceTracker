package use_case.change_currency;

public class ViewCurrencyOutputData {
  private final String defaultCurrency;

  public ViewCurrencyOutputData(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public String getDefaultCurrency() {
    return defaultCurrency;}
}
