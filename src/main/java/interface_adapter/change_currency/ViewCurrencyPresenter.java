package interface_adapter.change_currency;

import use_case.change_currency.ViewCurrencyOutputBoundary;
import use_case.change_currency.ViewCurrencyOutputData;

public class ViewCurrencyPresenter implements ViewCurrencyOutputBoundary {

  private final ViewCurrencyViewModel viewModel;

  public ViewCurrencyPresenter(ViewCurrencyViewModel viewModel) {
    this.viewModel = viewModel;
  }

  @Override
  public void prepareSuccessView(ViewCurrencyOutputData outputData) {
    viewModel.setDefaultCurrency(outputData.getDefaultCurrency());
  }

  @Override
  public void prepareFailView(String error) {
    viewModel.setDefaultCurrency("NaN");
  }
}
