package StepDefination;

import Objects.DtableObject;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DatatableSteps {

//    @DataTableType
//    public DtableObject setValue(List<String> single){
//        return new DtableObject(single.get(0),single.get(1));
//    }




    @Given("the user credential")
    public void the_user_credential(io.cucumber.datatable.DataTable dataTable) {


        List<String> creds=dataTable.values();
        System.out.println("username =" + creds.get(0));
        System.out.println("password =" + creds.get(1));

        List<String> cred=dataTable.row(0);
        System.out.println("username =" + cred.get(0));
        System.out.println("password =" + cred.get(1));
    }

    @Given("the user credential with multiple Row")
    public void the_user_credential_with_multiple_row(List<DtableObject> objs) {
//        List<List<String>> creds=dataTable.asLists();
//        System.out.println("username =" + creds.get(0).get(0));
//        System.out.println("password =" + creds.get(0).get(1));
//        System.out.println("username =" + creds.get(1).get(0));
//        System.out.println("password =" + creds.get(1).get(1));


        System.out.println("username =" + objs.get(0).getUname());
        System.out.println("password =" + objs.get(0).getPassword());
        System.out.println("username =" + objs.get(1).getUname());
        System.out.println("password =" + objs.get(1).getPassword());

    }

    @Given("the user credential with single row single header")
    public void the_user_credential_with_single_row_single_header(DtableObject obj) {
      //  List<Map<String, String>> obj = dataTable.asMaps();

//        System.out.println("username =" + obj.get(0).get("uname"));
//        System.out.println("username =" + obj.get(0).get("password"));

        System.out.println("username =" + obj.getUname());
        System.out.println("username =" + obj.getPassword());

    }

    @Given("the user credential with Multiple row single header")
    public void the_user_credential_with_multiple_row_single_header( List<DtableObject> obj) {

//        System.out.println("username =" + obj.get(0).get("uname"));
//        System.out.println("username =" + obj.get(0).get("password"));
//        System.out.println("username =" + obj.get(1).get("uname"));
//        System.out.println("username =" + obj.get(1).get("password"));

        System.out.println("username =" + obj.get(0).getUname());
        System.out.println("username =" + obj.get(0).getPassword());

        System.out.println("username =" + obj.get(1).getUname());
        System.out.println("username =" + obj.get(1).getPassword());
    }

    @Given("the user credential with single coulmn with no header")
    public void the_user_credential_with_single_coulmn_with_no_header(io.cucumber.datatable.DataTable dataTable) {

        List<String> obj=dataTable.asList();

        System.out.println("username =" + obj.get(0));
        System.out.println("password =" + obj.get(1));
    }

    @Given("the user credential with single coulmn with header")
    public void the_user_credential_with_single_coulmn_with_header(io.cucumber.datatable.DataTable dataTable) {

        Map<String,String> obj=dataTable.asMap();
        System.out.println("username------- =" + obj.get("name"));



    }


    }
