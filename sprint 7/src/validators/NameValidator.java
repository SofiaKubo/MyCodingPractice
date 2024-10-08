package validators;

import exceptions.ValidateException;
import exceptions.ValidateNameException;

public class NameValidator implements Validator {
    @Override
    public void validate(String name) throws ValidateException {
        if (name.isBlank()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}
