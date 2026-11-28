package use_case.change_currency;
public class GetIDInputData {

  private String selectedName;

  public GetIDInputData(String selectedName) {
    this.selectedName = selectedName;
  }

  public String getSelectedName() {return this.selectedName;}

}
