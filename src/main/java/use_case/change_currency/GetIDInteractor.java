package use_case.change_currency;

import java.io.IOException;

public class GetIDInteractor implements GetIDInputDataBoundary {

  private final GetIDDataAccessInterface dataAccess;
  private final GetIDOutputDataBoundary presenter;

  public GetIDInteractor(GetIDDataAccessInterface dataAccess, GetIDOutputDataBoundary presenter) {
    this.dataAccess = dataAccess;
    this.presenter = presenter;
  }

  @Override
  public void execute(GetIDInputData inputData) throws IOException {

    int profileID = dataAccess.getProfileID(inputData.getSelectedName());
    int accountID = dataAccess.getAccountID(inputData.getSelectedName());

    if (profileID != 0 && accountID != 0) {
      GetIDOutputData outputData = new GetIDOutputData(profileID, accountID);
      presenter.prepareSuccessView(outputData);
    } else {
      presenter.prepareFailView("Unable to retrieve IDs.");
    }
  }
}
