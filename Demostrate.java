public class Demostrate {

	public static void main(String[] args) {
		int i = 67;
		System.out.println(Character.isUpperCase(i));

	}

  public static String validatedFieldName(String fieldName) {
    if(!(fieldName.charAt(0) == 'm') && Character.isUpperCase(fieldName.charAt(1))){
        throw new IllegalArgumentException();
    }
    return fieldName;
  }
}
