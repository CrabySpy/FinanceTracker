package interface_adapter.change_currency;
import use_case.change_currency.GetIDOutputData;
import use_case.change_currency.GetIDOutputDataBoundary;

public class GetIDPresenter implements GetIDOutputDataBoundary {

  private GetIDViewModel viewModel;

  public GetIDPresenter(GetIDViewModel viewModel) {
    this.viewModel = viewModel;
  }

  @Override
  public void prepareSuccessView(GetIDOutputData outputData) {
    viewModel.setProfileID(outputData.getProfileID());
    viewModel.setAccountID(outputData.getAccountID());
  }

  @Override
  public void prepareFailView(String error) {
    viewModel.setProfileID(0);
    viewModel.setAccountID(0);
    System.out.println(error);
  }
}