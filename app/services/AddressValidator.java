package services;
import java.util.ArrayList;
import java.util.List;
public class AddressValidator {
    public String address_line1;
    public String address_city;
    public String address_state;
    public String address_zip;

    public boolean ran_validation = false;
    public ArrayList errorsList = new ArrayList<String>();


    public AddressValidator(String address_line1, String address_city, String address_state, String address_zip){
        this.address_line1 = address_line1;
        this.address_city = address_city;
        this.address_state = address_state;
        this.address_zip = address_zip;
    }

    public boolean isValid(){
        this.validate();
        return this.errorsList.isEmpty();
    }

    public List getErrors(){
        this.validate();
        List errors_list = this.errorsList.subList(0, this.errorsList.size());
        return errors_list;
    }

    public void validate(){
        if (!this.ran_validation){
            this.run_validation();
        }
    }

    public void run_validation(){
        this.errorsList = compile_errors(
                validate_address_line1(address_line1),
                validate_address_city(address_city),
                validate_address_state(address_state),
                validate_address_zip(address_zip));
        this.ran_validation = true;
    }

    public ArrayList compile_errors(boolean address_line1_valid, boolean address_city_valid,
                                    boolean address_state_valid, boolean address_zip_valid) {
        ArrayList errorsList = new ArrayList<String>();
        if (!address_line1_valid){
            errorsList.add("Address line 1 is invalid");
        }
        if (!address_city_valid){
            errorsList.add("Address city is invalid");
        }
        if (!address_state_valid){
            errorsList.add("Address state is invalid");
        }
        if (!address_zip_valid){
            errorsList.add("Address zip is invalid");
        }
        return errorsList;
    }

    public boolean validate_address_line1(String address_line1){
        return address_line1.matches(
                "^[#.0-9a-zA-Z\\s,-]+$");
    }

    public boolean validate_address_city(String address_city){
        return address_city.matches(
                "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"
        );

    }

    public boolean validate_address_state(String address_state){
        return address_state.matches(
                "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"
        );
    }

    public boolean validate_address_zip(String address_zip) {
            return address_zip.matches(
                    "^[0-9]{5}(?:-[0-9]{4})?$"
            );
        }
    }
