
  package com.capgemini.librarymanagementsystem.validation;
  
  import java.util.regex.Matcher; import java.util.regex.Pattern;

import com.capgemini.librarymanagementsystem.exception.ValidationException;
  
  
  
  public class ValidationAdminStudent { 
	  public boolean validatedId(int id) throws ValidationException {
			String idRegEx = "[0-9]{1}[0-9]{5}" ;
			boolean result = false;
			if (Pattern.matches(idRegEx, String.valueOf(id))) {
				result = true;
			} else {
				throw new ValidationException("Id should contains exactly 6 digits");
			}
			return result;
		}
	public boolean validatedName(String name) throws ValidationException {
		String nameRegEx = "^(?=.{8,20}$)(?![_.-])(?!.*[_.-]{2})[a-zA-Z._-]+(?<![_.-])";
		
			boolean result = false;
			Pattern pattern = Pattern.compile(nameRegEx);
			Matcher matcher = pattern.matcher(name);
			if (matcher.matches()) {
				result = true;
			} else {
				throw new ValidationException("Name should be minimum 8 and maximum 20 letters of alphabets and to seperate you can only use underscore or hyphen");
			}
			return result;
		}

		public boolean validatedMobile(String mobile) throws ValidationException {
			String mobileRegEx = "(0/91)?[7-9][0-9]{9}" ;
			boolean result = false;
			Pattern pattern = Pattern.compile(mobileRegEx);
			Matcher matcher = pattern.matcher(mobile);
			if (matcher.matches()) {
				result = true;
			} else {
				throw new ValidationException("Mobile Number will start between 7 & 9 , It should contains 10 numbers");
			}
			return result;
		}
		public boolean validatedEmail(String email) throws ValidationException {
			
			String emailRegEx = "^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$";
			boolean result = false;
			Pattern pattern = Pattern.compile(emailRegEx);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				result = true;
			} else {
				throw new ValidationException("Before email characters must be above 5 letters,it should be gmail");
			}
			return result;
		}

		public boolean validatedPassword(String password) throws ValidationException {
				String passwordRegEx = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%]).{6,20})" ;
				boolean result = false;
				if (Pattern.matches(passwordRegEx, String.valueOf(password))) { 
					result = true;
				} else {
					throw new ValidationException("Password should contain atleast 6 characters ,one uppercase,one lowercase,one number,one special symbol(@#$%) "); 
				}

				return result;
			}
		
		public boolean validateChoice(String userId) throws ValidationException {
			String validating = "[0-9[10-11]]";
			boolean isValidated = Pattern.matches(validating, userId);
			if (isValidated) {
				return true;
			} else {
				throw new ValidationException("Choice should contain only digits");

			}
		}
	  
  }
 