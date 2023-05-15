package ParameterTypes;

import Objects.DtableObject;
import Objects.Product;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;

import java.util.Map;

public class Types {

    @ParameterType(".*")
    public Product product(String product){

        return new Product(product);
    }

    @DataTableType
    public DtableObject setDtableValue(Map<String,String> single){
        return new DtableObject(single.get("uname"),single.get("password"));
    }
}
