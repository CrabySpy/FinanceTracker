package interface_adapter.change_currency;

public class ViewCurrencyViewModel {
  private String defaultCurrency = "NaN";

  public ViewCurrencyViewModel(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public void setDefaultCurrency(String defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public String getDefaultCurrency() {
    return this.defaultCurrency;
  }

  public boolean isSuccessful() {
    return !this.defaultCurrency.equals("NaN");
  }
}
