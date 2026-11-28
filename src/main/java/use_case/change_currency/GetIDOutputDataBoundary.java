package use_case.change_currency;

public interface GetIDOutputDataBoundary {
    void prepareSuccessView(GetIDOutputData outputData);
    void prepareFailView(String error);
}

